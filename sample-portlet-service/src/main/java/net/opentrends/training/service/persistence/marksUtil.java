package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.training.model.marks;

import java.util.List;

/**
 * The persistence utility for the marks service. This utility wraps {@link marksPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see marksPersistence
 * @see marksPersistenceImpl
 * @generated
 */
public class marksUtil {
    private static marksPersistence _persistence;

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
    public static void clearCache(marks marks) {
        getPersistence().clearCache(marks);
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
    public static List<marks> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<marks> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<marks> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static marks update(marks marks) throws SystemException {
        return getPersistence().update(marks);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static marks update(marks marks, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(marks, serviceContext);
    }

    /**
    * Caches the marks in the entity cache if it is enabled.
    *
    * @param marks the marks
    */
    public static void cacheResult(net.opentrends.training.model.marks marks) {
        getPersistence().cacheResult(marks);
    }

    /**
    * Caches the markses in the entity cache if it is enabled.
    *
    * @param markses the markses
    */
    public static void cacheResult(
        java.util.List<net.opentrends.training.model.marks> markses) {
        getPersistence().cacheResult(markses);
    }

    /**
    * Creates a new marks with the primary key. Does not add the marks to the database.
    *
    * @param id the primary key for the new marks
    * @return the new marks
    */
    public static net.opentrends.training.model.marks create(long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the marks with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the marks
    * @return the marks that was removed
    * @throws net.opentrends.training.NoSuchmarksException if a marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.marks remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.NoSuchmarksException {
        return getPersistence().remove(id);
    }

    public static net.opentrends.training.model.marks updateImpl(
        net.opentrends.training.model.marks marks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(marks);
    }

    /**
    * Returns the marks with the primary key or throws a {@link net.opentrends.training.NoSuchmarksException} if it could not be found.
    *
    * @param id the primary key of the marks
    * @return the marks
    * @throws net.opentrends.training.NoSuchmarksException if a marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.marks findByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.NoSuchmarksException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the marks with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the marks
    * @return the marks, or <code>null</code> if a marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.marks fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the markses.
    *
    * @return the markses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.model.marks> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the markses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.marksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of markses
    * @param end the upper bound of the range of markses (not inclusive)
    * @return the range of markses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.model.marks> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the markses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.marksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of markses
    * @param end the upper bound of the range of markses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of markses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.model.marks> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the markses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of markses.
    *
    * @return the number of markses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static marksPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (marksPersistence) PortletBeanLocatorUtil.locate(net.opentrends.training.service.ClpSerializer.getServletContextName(),
                    marksPersistence.class.getName());

            ReferenceRegistry.registerReference(marksUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(marksPersistence persistence) {
    }
}
