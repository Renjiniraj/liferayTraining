package net.opentrends.training.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.theme.ThemeDisplay;

import net.opentrends.training.model.Department;
import net.opentrends.training.model.Marks;
import net.opentrends.training.model.Student;
import net.opentrends.training.model.student;
import net.opentrends.training.service.DepartmentLocalServiceUtil;
import net.opentrends.training.service.StudentLocalServiceUtil;

public class StudentEditPermission {
	
	public static final String RESOURCE_NAME = "net.opentrends.training.model";
	
	
	 public static void check(PermissionChecker permissionChecker,long studentId, String actionId, long groupId) throws PortalException,
	            SystemException {

	        if (!contains(permissionChecker, studentId, actionId, groupId)) {
	            throw new PrincipalException();
	        }
	    }
    
	
	
	 public static boolean contains(PermissionChecker permissionChecker,
		        long groupId, String actionId) {

		        return permissionChecker.hasPermission(groupId, RESOURCE_NAME, groupId,
		            actionId);
		    }
	 
	 public static boolean contains(PermissionChecker permissionChecker,long studentId, String actionId, long groupid) throws PortalException,
	            SystemException {

	       Student student = StudentLocalServiceUtil.getStudent(studentId);

	        return permissionChecker.hasPermission(groupid,Student.class.getName(), student.getStudentid(),actionId);

	    }
	

	
	public static void insertPermission(ThemeDisplay themeDisplay) throws PrincipalException {
		PermissionChecker permissionChecker = themeDisplay.getPermissionChecker();
		if(!(permissionChecker.hasPermission(themeDisplay.getScopeGroupId(), Student.class.getName(), themeDisplay.getUserId(), "UPDATE")) ) {
			throw new PrincipalException();
		}
		
		if(!(permissionChecker.hasPermission(themeDisplay.getScopeGroupId(), Student.class.getName(), themeDisplay.getUserId(), "DELETE")) ) {
			throw new PrincipalException();
		}
	
	}
}
