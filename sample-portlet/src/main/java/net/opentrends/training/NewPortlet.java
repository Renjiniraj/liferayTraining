package net.opentrends.training;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.print.DocFlavor.STRING;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.File;
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
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.portlet.PortletProps;

import net.opentrends.training.model.Student;
import net.opentrends.training.model.impl.StudentImpl;
import net.opentrends.training.service.StudentLocalServiceUtil;

public class NewPortlet extends MVCPortlet{
	
	
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = PortletProps.get("fileupload.folder.name");
	private static String ROOT_FOLDER_DESCRIPTION = PortletProps.get("fileupload.folder.description");
	
    
	 public void addStudentAction(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException,
	   PortletException, SystemException {

	  long studentId;
	  studentId = CounterLocalServiceUtil.increment(Student.class.getName());
	  System.out.println("studentId : - "+studentId);
	  String firstName = ParamUtil.getString(actionRequest, "firstName");
	  System.out.println("firstName : - "+firstName);
	  String lastName = ParamUtil.getString(actionRequest, "lastName");
	  String branch = ParamUtil.getString(actionRequest, "branch");
	  int age = (int) ParamUtil.getLong(actionRequest, "age");
	  String email=ParamUtil.getString(actionRequest, "email");
	 /* Student student = null;
	  student = StudentLocalServiceUtil.createStudent(studentId);
	  */
	  Student student = new StudentImpl();
	  
	  student.setStudentid(studentId);
	  student.setFname(firstName);
	  student.setLname(lastName);
	  student.setBranch(branch);
	  student.setAge(age);
	  student.setEmail(email);
	  
	  StudentLocalServiceUtil.addStudent(student);
	  List<Student> students = StudentLocalServiceUtil.getStudents(-1, -1);
	  System.out.println("students list :"+students);

	  actionResponse.setRenderParameter("mvcPath",
	    "/html/new/displayStudent.jsp");
	  
	 }
	 
	 public void updateStudentAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		 
		 long studentId = ParamUtil.getLong(actionRequest, "id");
		 String studentFname = ParamUtil.getString(actionRequest, "fname");
		 String studentLname = ParamUtil.getString(actionRequest, "lname");
		 int studentAge = ParamUtil.getInteger(actionRequest, "age");
		 String studentBranch = ParamUtil.getString(actionRequest, "branch");
		 String studentEmail = ParamUtil.getString(actionRequest, "email");
		 
		 Student student = StudentLocalServiceUtil.getStudent(studentId);
		 
		 if(Validator.isNotNull(student)) {
			 student.setFname(studentFname);
			 student.setLname(studentLname);
			 student.setAge(studentAge);
			 student.setBranch(studentBranch);
			 student.setEmail(studentEmail);
		 }
		Student updateStudent = StudentLocalServiceUtil.updateStudent(student);
		System.out.println("updateStudent :- "+updateStudent);
		actionResponse.setRenderParameter("mvcPath",  "/html/new/displayStudent.jsp");
		 
	 } 
	 
	 public void deleteStudent(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		 System.out.println("calling...................");
		 long stidentId = ParamUtil.getLong(actionRequest, "id");
		 Student student = StudentLocalServiceUtil.deleteStudent(stidentId);
		 actionResponse.setRenderParameter("mvcPath", "/html/new/displayStudent.jsp");
	 }
	 
	 public void fileAttachmentAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException, IOException {
		 
		 UploadPortletRequest portletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		 final ThemeDisplay themeDisplay = (ThemeDisplay) portletRequest.getAttribute(WebKeys.THEME_DISPLAY) ;
		 
		 createFolder(actionRequest,themeDisplay);
		 
		 System.out.println(".......calling upload");
		 
		 long repositoryId = themeDisplay.getScopeGroupId();
		 Folder folder1 = getFolder(themeDisplay);
		 
		//final FileItem[] files = portletRequest.getMultipartParameterMap().get("attachedFile");
		if(isFileExsistinReq(portletRequest)){
			 final FileItem[] allfiles = portletRequest.getMultipartParameterMap().get("attachedFile");
			 for(final FileItem fileItem : allfiles) {
				// String fileName = portletRequest.getFileName("attachedFile");
				 String contentType = portletRequest.getContentType("attachedFile");
				 String desc = "This file is added";
				 java.io.File file = portletRequest.getFile("attachedFile");
				 ServiceContext serviceContext = new ServiceContext();
				 serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
				 InputStream is = new FileInputStream( file );  
				 DLAppServiceUtil.addFileEntry(repositoryId, folder1.getFolderId(), fileItem.getFileName(), contentType, fileItem.getFileName(), desc, null, 
						is, file.getTotalSpace(), serviceContext);
				 System.out.println("success...................!!");
			 }
		 }
		
		 /*String fileName = portletRequest.getFileName("attachedFile");
		 String contentType = portletRequest.getContentType("attachedFile");
		 String desc = "This file is added";
		 java.io.File file = portletRequest.getFile("attachedFile");*/
		 //portletRequest.g
		 
		
		
		 try {
			 Folder folder = getFolder(themeDisplay); 
		    // ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
			   ServiceContext serviceContext = new ServiceContext();
			   serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
			// InputStream is = new FileInputStream( file );
			 
			/* DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(), fileName, contentType, fileName, desc, null, 
						is, file.getTotalSpace(), serviceContext);
			 */
			 
			/* if(isFileExsistinReq(portletRequest)){
				 final FileItem[] files = portletRequest.getMultipartParameterMap().get("attachedFile");
				 for(final FileItem fileItem : files) {
					 DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(), fileName, contentType, fileName, desc, null, 
							is, file.getTotalSpace(), serviceContext);
				 }
			 }*/
		 } catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		
		
		 
	 }
	 
	 public Folder createFolder(ActionRequest actionRequest,ThemeDisplay themeDisplay)
		{
	        boolean folderExist = isFolderExist(themeDisplay);
	        Folder folder = getFolder(themeDisplay);
	     //  DLFolder addedFolder = (DLFolder) getFolder(themeDisplay);
			if (!folderExist) {
				long repositoryId = themeDisplay.getScopeGroupId();	
				long userId = themeDisplay.getUserId();
				
				try {
					ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
					//DLFolderLocalServiceUtil.addFolder(userId,repositoryId,repositoryId,false,PARENT_FOLDER_ID,ROOT_FOLDER_NAME,"desc",false,serviceContext);  
					folder = DLAppServiceUtil.addFolder(repositoryId,PARENT_FOLDER_ID, ROOT_FOLDER_NAME,ROOT_FOLDER_DESCRIPTION, serviceContext);
		    
					//folder = DLAppServiceUtil.addFolder(repositoryId,PARENT_FOLDER_ID, "File_Upload","desc", serviceContext);
					//DLAppServiceUtil.
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
		    
		   final FileItem[] items = request.getMultipartParameterMap().get("attachedFile");
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
