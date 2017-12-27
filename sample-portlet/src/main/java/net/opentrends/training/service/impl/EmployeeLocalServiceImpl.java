package net.opentrends.training.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ResourceLocalServiceUtil;

import net.opentrends.training.service.base.EmployeeLocalServiceBaseImpl;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.opentrends.training.service.EmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.base.EmployeeLocalServiceBaseImpl
 * @see net.opentrends.training.service.EmployeeLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {

	@Override
	public void addResource(long companyid, long groupid, long userid, String entityName, String primekey,
			boolean portletActions, boolean addGroupPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {
		// TODO Auto-generated method stub
		ResourceLocalServiceUtil.addResources(companyid, groupid, userid, entityName, primekey, false, true, true);
		return ;
		
	}
   
	
}
