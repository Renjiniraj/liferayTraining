package net.opentrends.training.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.theme.ThemeDisplay;

import net.opentrends.training.model.Employee;
import net.opentrends.training.service.EmployeeLocalServiceUtil;

public class EmployeePermission {
	
	public static void check(PermissionChecker permissionChecker, long empId, String actionid) throws PortalException, SystemException {
		if(!contains(permissionChecker, empId, actionid)) {
			throw new PrincipalException();
		}
	}
    
	public static boolean contains(PermissionChecker permissionChecker, long empId, String actionId) throws PortalException, SystemException {
		
		boolean isPermission = false;
		
		Employee employee = EmployeeLocalServiceUtil.getEmployee(empId);
		isPermission = permissionChecker.hasPermission(employee.getGroupId(), Employee.class.getName(), employee.getEmpId(), actionId);
		
		return isPermission;
		
	}
	
	public static void insertPermission(ThemeDisplay themeDisplay) throws PrincipalException {
		PermissionChecker permissionChecker = themeDisplay.getPermissionChecker();
		if(!(permissionChecker.hasPermission(themeDisplay.getScopeGroupId(), Employee.class.getName(), themeDisplay.getUserId(), "ADD_EMPLOYEE")) ) {
			throw new PrincipalException();
		}
	}
}
