package net.opentrends.training.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link marksService}.
 *
 * @author Brian Wing Shun Chan
 * @see marksService
 * @generated
 */
public class marksServiceWrapper implements marksService,
    ServiceWrapper<marksService> {
    private marksService _marksService;

    public marksServiceWrapper(marksService marksService) {
        _marksService = marksService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _marksService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _marksService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _marksService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public marksService getWrappedmarksService() {
        return _marksService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedmarksService(marksService marksService) {
        _marksService = marksService;
    }

    @Override
    public marksService getWrappedService() {
        return _marksService;
    }

    @Override
    public void setWrappedService(marksService marksService) {
        _marksService = marksService;
    }
}
