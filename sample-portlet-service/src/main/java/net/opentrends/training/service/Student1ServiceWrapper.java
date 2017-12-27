package net.opentrends.training.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Student1Service}.
 *
 * @author Brian Wing Shun Chan
 * @see Student1Service
 * @generated
 */
public class Student1ServiceWrapper implements Student1Service,
    ServiceWrapper<Student1Service> {
    private Student1Service _student1Service;

    public Student1ServiceWrapper(Student1Service student1Service) {
        _student1Service = student1Service;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _student1Service.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _student1Service.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _student1Service.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Student1Service getWrappedStudent1Service() {
        return _student1Service;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStudent1Service(Student1Service student1Service) {
        _student1Service = student1Service;
    }

    @Override
    public Student1Service getWrappedService() {
        return _student1Service;
    }

    @Override
    public void setWrappedService(Student1Service student1Service) {
        _student1Service = student1Service;
    }
}
