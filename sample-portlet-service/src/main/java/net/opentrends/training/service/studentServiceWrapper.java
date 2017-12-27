package net.opentrends.training.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link studentService}.
 *
 * @author Brian Wing Shun Chan
 * @see studentService
 * @generated
 */
public class studentServiceWrapper implements studentService,
    ServiceWrapper<studentService> {
    private studentService _studentService;

    public studentServiceWrapper(studentService studentService) {
        _studentService = studentService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _studentService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _studentService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _studentService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public studentService getWrappedstudentService() {
        return _studentService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedstudentService(studentService studentService) {
        _studentService = studentService;
    }

    @Override
    public studentService getWrappedService() {
        return _studentService;
    }

    @Override
    public void setWrappedService(studentService studentService) {
        _studentService = studentService;
    }
}
