package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.training.model.Manager;

import java.util.List;

/**
 * The persistence utility for the manager service. This utility wraps {@link ManagerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManagerPersistence
 * @see ManagerPersistenceImpl
 * @generated
 */
public class ManagerUtil {
    private static ManagerPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Manager manager) {
        getPersistence().clearCache(manager);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Manager> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Manager> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Manager> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Manager update(Manager manager) throws SystemException {
        return getPersistence().update(manager);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Manager update(Manager manager, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(manager, serviceContext);
    }

    /**
    * Caches the manager in the entity cache if it is enabled.
    *
    * @param manager the manager
    */
    public static void cacheResult(
        net.opentrends.training.model.Manager manager) {
        getPersistence().cacheResult(manager);
    }

    /**
    * Caches the managers in the entity cache if it is enabled.
    *
    * @param managers the managers
    */
    public static void cacheResult(
        java.util.List<net.opentrends.training.model.Manager> managers) {
        getPersistence().cacheResult(managers);
    }

    /**
    * Creates a new manager with the primary key. Does not add the manager to the database.
    *
    * @param manageentryID the primary key for the new manager
    * @return the new manager
    */
    public static net.opentrends.training.model.Manager create(
        long manageentryID) {
        return getPersistence().create(manageentryID);
    }

    /**
    * Removes the manager with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param manageentryID the primary key of the manager
    * @return the manager that was removed
    * @throws net.opentrends.training.NoSuchManagerException if a manager with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Manager remove(
        long manageentryID)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.NoSuchManagerException {
        return getPersistence().remove(manageentryID);
    }

    public static net.opentrends.training.model.Manager updateImpl(
        net.opentrends.training.model.Manager manager)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(manager);
    }

    /**
    * Returns the manager with the primary key or throws a {@link net.opentrends.training.NoSuchManagerException} if it could not be found.
    *
    * @param manageentryID the primary key of the manager
    * @return the manager
    * @throws net.opentrends.training.NoSuchManagerException if a manager with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Manager findByPrimaryKey(
        long manageentryID)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.NoSuchManagerException {
        return getPersistence().findByPrimaryKey(manageentryID);
    }

    /**
    * Returns the manager with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param manageentryID the primary key of the manager
    * @return the manager, or <code>null</code> if a manager with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Manager fetchByPrimaryKey(
        long manageentryID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(manageentryID);
    }

    /**
    * Returns all the managers.
    *
    * @return the managers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.model.Manager> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<net.opentrends.training.model.Manager> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the managers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of managers
    * @param end the upper bound of the range of managers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of managers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.model.Manager> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the managers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of managers.
    *
    * @return the number of managers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ManagerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ManagerPersistence) PortletBeanLocatorUtil.locate(net.opentrends.training.service.ClpSerializer.getServletContextName(),
                    ManagerPersistence.class.getName());

            ReferenceRegistry.registerReference(ManagerUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ManagerPersistence persistence) {
    }
}
