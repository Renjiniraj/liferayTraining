package net.opentrends.training.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DepartmentService}.
 *
 * @author Brian Wing Shun Chan
 * @see DepartmentService
 * @generated
 */
public class DepartmentServiceWrapper implements DepartmentService,
    ServiceWrapper<DepartmentService> {
    private DepartmentService _departmentService;

    public DepartmentServiceWrapper(DepartmentService departmentService) {
        _departmentService = departmentService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _departmentService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _departmentService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _departmentService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DepartmentService getWrappedDepartmentService() {
        return _departmentService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDepartmentService(DepartmentService departmentService) {
        _departmentService = departmentService;
    }

    @Override
    public DepartmentService getWrappedService() {
        return _departmentService;
    }

    @Override
    public void setWrappedService(DepartmentService departmentService) {
        _departmentService = departmentService;
    }
}
