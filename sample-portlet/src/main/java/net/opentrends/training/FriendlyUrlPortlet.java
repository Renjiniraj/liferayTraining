package net.opentrends.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ResourceLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.portlet.PortletProps;

import net.opentrends.training.model.Employee;
import net.opentrends.training.model.impl.EmployeeImpl;
import net.opentrends.training.service.EmployeeLocalServiceUtil;

public class FriendlyUrlPortlet extends MVCPortlet {
	
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = PortletProps.get("fileupload.folder.name");
	private static String ROOT_FOLDER_DESCRIPTION = PortletProps.get("fileupload.folder.description");
	
	private static Log _log = LogFactoryUtil.getLog(Employee.class);
	
	 public void addEmployee(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException,
	   PortletException, SystemException, PortalException {

	  long empId = CounterLocalServiceUtil.increment(Employee.class.getName());
	  System.out.println("studentId : - "+empId);
	  String empName = ParamUtil.getString(actionRequest, "name");
	  System.out.println("empName : - "+empName);
	  int age = (int) ParamUtil.getLong(actionRequest, "age");
	  long salary = ParamUtil.getLong(actionRequest, "salary");
	  String unit = ParamUtil.getString(actionRequest, "unit");
	  try {
		  Employee employee = new EmployeeImpl();
			 
		  UploadPortletRequest portletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		  final ThemeDisplay themeDisplay = (ThemeDisplay) portletRequest.getAttribute(WebKeys.THEME_DISPLAY) ;
		  createFolder(actionRequest,themeDisplay);
		  long fileEntryId = fileUpload(themeDisplay, actionRequest);
		 
		 
		  employee.setEmpId(empId);
		  if(Validator.isNotNull(empName)) {
			  employee.setEmployeeName(empName); 
		  }
		  if(Validator.isNotNull(age)) {
			  employee.setAge(age); 
		  }
		  if(Validator.isNotNull(salary)) {
			  employee.setSalary(salary); 
		  }
		  if(Validator.isNotNull(unit)) {
			  employee.setUnit(unit);
		  }
		  if(Validator.isNotNull(fileEntryId)) {
			  employee.setFileEntryId(fileEntryId);
		  }
		  EmployeeLocalServiceUtil.addEmployee(employee);
		  ResourceLocalServiceUtil.addResources(themeDisplay.getCompanyId(), themeDisplay.getScopeGroupId(), themeDisplay.getUserId(), Employee.class.getName(), employee.getEmpId(), false, true, true);
		  
		 
		  List<Employee> employeesList = EmployeeLocalServiceUtil.getEmployees(-1, -1);
		  System.out.println(employeesList);
	  } catch (Exception e) {
		  e.printStackTrace();
		System.out.println(e.getMessage());
	}
	  
	 
	  actionResponse.setRenderParameter("mvcPath",
	    "/html/friendlyurl/view.jsp");
	 }
	 
	 private long fileUpload(ThemeDisplay themeDisplay, ActionRequest actionRequest) {
		 UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		 long fileEntryId = 0;
		   if(isFileExsistinReq(uploadPortletRequest)) {
			 String fileName=uploadPortletRequest.getFileName("photo");		 			
				File file = uploadPortletRequest.getFile("photo");
				String mimeType = uploadPortletRequest.getContentType("photo");
		                 String title = fileName;
				String description = "This file is added ";
				long repositoryId = themeDisplay.getScopeGroupId();
				
			    try
			    {  
			    	Folder folder = getFolder(themeDisplay);
			    	ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
			    	InputStream is = new FileInputStream( file );
			    		FileEntry fileEntry = DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(), fileName, mimeType, 
				    			title, description, "", is, file.getTotalSpace(), serviceContext);
				    	fileEntryId = fileEntry.getFileEntryId();
				   		    	
			     } catch (Exception e)
			    {
			       System.out.println(e.getMessage());
			    	e.printStackTrace();
			    }
			  
		 } 
		 return fileEntryId;
		}
	 
	 public Folder createFolder(ActionRequest actionRequest,ThemeDisplay themeDisplay)
		{   
	        boolean folderExist = isFolderExist(themeDisplay);
	        Folder folder = getFolder(themeDisplay);
			if (!folderExist) {
				long repositoryId = themeDisplay.getScopeGroupId();	
				try {
					ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
					folder = DLAppServiceUtil.addFolder(repositoryId,PARENT_FOLDER_ID, ROOT_FOLDER_NAME,ROOT_FOLDER_DESCRIPTION, serviceContext);
				} catch (PortalException e1) {
					e1.printStackTrace();
				} catch (SystemException e1) {
					e1.printStackTrace();
				}			
			}
			return folder;
		}
		
		
		public boolean isFolderExist(ThemeDisplay themeDisplay){
				boolean folderExist = false;
				try {
					DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
					folderExist = true;
					System.out.println("Folder is already Exist");
				} catch (Exception e) {	
					System.out.println(e.getMessage());
				}
				return folderExist;
		}
		


	public Folder getFolder(ThemeDisplay themeDisplay) {
		Folder folder = null;
		long repositoryId = themeDisplay.getScopeGroupId();
		try {
			folder = DLAppServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		} catch (PortalException portalException) {
			portalException.getMessage();
			portalException.printStackTrace();
		} catch (SystemException systemException) {
			systemException.getMessage();
			systemException.printStackTrace();
		}
		return folder;
	}

	public static boolean isFileExsistinReq(final UploadPortletRequest request) {
		    boolean isfileExsist = false;
		    
		   final FileItem[] items = request.getMultipartParameterMap().get("photo");
		   if(items == null || items.length==0) {
			   return false;
		   }
		   for(final FileItem item:items) {
			   if(!item.getFileName().isEmpty()){
				   isfileExsist = true; 
				   
			   }
		   }
		return isfileExsist;
		 
	 }
	
}