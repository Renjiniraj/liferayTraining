package com.test;

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
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.portlet.PortletProps;

import net.opentrends.training.model.Employee;
import net.opentrends.training.model.impl.EmployeeImpl;
import net.opentrends.training.service.EmployeeLocalServiceUtil;

/**
 * Portlet implementation class EmployeePortlet
 */
public class EmployeePortlet extends MVCPortlet {
	
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = PortletProps.get("fileupload.folder.name");
	private static String ROOT_FOLDER_DESCRIPTION = PortletProps.get("fileupload.folder.description");
	
	 public void addEmpAction(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException,
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
		  employee.setEmployeeName(empName);
		  employee.setAge(age);
		  employee.setSalary(salary);
		  employee.setUnit(unit);
		  employee.setFileEntryId(fileEntryId);
		  
		  EmployeeLocalServiceUtil.addEmployee(employee);
		  List<Employee> employeesList = EmployeeLocalServiceUtil.getEmployees(-1, -1);
		  System.out.println(employeesList);
	  } catch (Exception e) {
		  e.printStackTrace();
		System.out.println(e.getMessage());
	}
	 
	 
	  actionResponse.setRenderParameter("mvcPath",
	    "/html/employee/view.jsp");
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

public void editEmpAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		 
		 long id = ParamUtil.getLong(actionRequest, "id");
		 String name = ParamUtil.getString(actionRequest, "name");
		 int age = ParamUtil.getInteger(actionRequest, "age");
		 long salary = ParamUtil.getLong(actionRequest, "salary");
		 String unit = ParamUtil.getString(actionRequest, "unit");
		 
		 Employee employee = EmployeeLocalServiceUtil.getEmployee(id);
		 
		 UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		 final ThemeDisplay themeDisplay = (ThemeDisplay) uploadPortletRequest.getAttribute(WebKeys.THEME_DISPLAY) ;
		 
		 long preFileEntryId = employee.getFileEntryId();
		 DLFileEntryLocalServiceUtil.deleteDLFileEntry(preFileEntryId);
		 long fileEntryId = fileUpload(themeDisplay, actionRequest);
		 System.out.println("employee.getFileEntryId()  : "+employee.getFileEntryId());
		 System.out.println("fileUpload(themeDisplay, actionRequest)  : "+fileEntryId);
		 
		 if(Validator.isNotNull(employee)) {
			 employee.setEmpId(id);
			 employee.setEmployeeName(name);
			 employee.setAge(age);
			 employee.setSalary(salary);
			 employee.setUnit(unit);
			 employee.setFileEntryId(fileEntryId);
		 }
		 Employee editEmployee = EmployeeLocalServiceUtil.updateEmployee(employee);
		 
		 
		 
		
		 
		System.out.println("updateEmployee :- "+editEmployee);
		actionResponse.setRenderParameter("mvcPath",  "/html/employee/view.jsp");
		 
	 } 
 
 public void deleteEmp(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
	 System.out.println("calling...................");
	 long empId = ParamUtil.getLong(actionRequest, "id");
	 Employee empl = EmployeeLocalServiceUtil.getEmployee(empId);
	 long fileEntryID = empl.getFileEntryId();
	 Employee employee = EmployeeLocalServiceUtil.deleteEmployee(empId);
	
	DLFileEntryLocalServiceUtil.deleteDLFileEntry(fileEntryID);
	 actionResponse.setRenderParameter("mvcPath", "/html/employee/view.jsp");
 }
 
 public Folder createFolder(ActionRequest actionRequest,ThemeDisplay themeDisplay)
	{
        boolean folderExist = isFolderExist(themeDisplay);
        Folder folder = getFolder(themeDisplay);
		if (!folderExist) {
			long repositoryId = themeDisplay.getScopeGroupId();	
			long userId = themeDisplay.getUserId();
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
