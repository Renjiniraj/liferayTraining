package net.opentrends.training.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Manager. This utility wraps
 * {@link net.opentrends.training.service.impl.ManagerLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ManagerLocalService
 * @see net.opentrends.training.service.base.ManagerLocalServiceBaseImpl
 * @see net.opentrends.training.service.impl.ManagerLocalServiceImpl
 * @generated
 */
public class ManagerLocalServiceUtil {
    private static ManagerLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link net.opentrends.training.service.impl.ManagerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the manager to the database. Also notifies the appropriate model listeners.
    *
    * @param manager the manager
    * @return the manager that was added
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Manager addManager(
        net.opentrends.training.model.Manager manager)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addManager(manager);
    }

    /**
    * Creates a new manager with the primary key. Does not add the manager to the database.
    *
    * @param manageentryID the primary key for the new manager
    * @return the new manager
    */
    public static net.opentrends.training.model.Manager createManager(
        long manageentryID) {
        return getService().createManager(manageentryID);
    }

    /**
    * Deletes the manager with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param manageentryID the primary key of the manager
    * @return the manager that was removed
    * @throws PortalException if a manager with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Manager deleteManager(
        long manageentryID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteManager(manageentryID);
    }

    /**
    * Deletes the manager from the database. Also notifies the appropriate model listeners.
    *
    * @param manager the manager
    * @return the manager that was removed
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Manager deleteManager(
        net.opentrends.training.model.Manager manager)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteManager(manager);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static net.opentrends.training.model.Manager fetchManager(
        long manageentryID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchManager(manageentryID);
    }

    /**
    * Returns the manager with the primary key.
    *
    * @param manageentryID the primary key of the manager
    * @return the manager
    * @throws PortalException if a manager with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Manager getManager(
        long manageentryID)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getManager(manageentryID);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the managers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of managers
    * @param end the upper bound of the range of managers (not inclusive)
    * @return the range of managers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.model.Manager> getManagers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getManagers(start, end);
    }

    /**
    * Returns the number of managers.
    *
    * @return the number of managers
    * @throws SystemException if a system exception occurred
    */
    public static int getManagersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getManagersCount();
    }

    /**
    * Updates the manager in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param manager the manager
    * @return the manager that was updated
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Manager updateManager(
        net.opentrends.training.model.Manager manager)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateManager(manager);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static ManagerLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    ManagerLocalService.class.getName());

            if (invokableLocalService instanceof ManagerLocalService) {
                _service = (ManagerLocalService) invokableLocalService;
            } else {
                _service = new ManagerLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(ManagerLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ManagerLocalService service) {
    }
}
