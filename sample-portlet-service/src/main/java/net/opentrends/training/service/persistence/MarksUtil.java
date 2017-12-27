package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.training.model.Marks;

import java.util.List;

/**
 * The persistence utility for the marks service. This utility wraps {@link MarksPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MarksPersistence
 * @see MarksPersistenceImpl
 * @generated
 */
public class MarksUtil {
    private static MarksPersistence _persistence;

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
    public static void clearCache(Marks marks) {
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
    public static List<Marks> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Marks> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Marks> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Marks update(Marks marks) throws SystemException {
        return getPersistence().update(marks);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Marks update(Marks marks, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(marks, serviceContext);
    }

    /**
    * Caches the marks in the entity cache if it is enabled.
    *
    * @param marks the marks
    */
    public static void cacheResult(net.opentrends.training.model.Marks marks) {
        getPersistence().cacheResult(marks);
    }

    /**
    * Caches the markses in the entity cache if it is enabled.
    *
    * @param markses the markses
    */
    public static void cacheResult(
        java.util.List<net.opentrends.training.model.Marks> markses) {
        getPersistence().cacheResult(markses);
    }

    /**
    * Creates a new marks with the primary key. Does not add the marks to the database.
    *
    * @param marksid the primary key for the new marks
    * @return the new marks
    */
    public static net.opentrends.training.model.Marks create(long marksid) {
        return getPersistence().create(marksid);
    }

    /**
    * Removes the marks with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param marksid the primary key of the marks
    * @return the marks that was removed
    * @throws net.opentrends.training.NoSuchMarksException if a marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Marks remove(long marksid)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.NoSuchMarksException {
        return getPersistence().remove(marksid);
    }

    public static net.opentrends.training.model.Marks updateImpl(
        net.opentrends.training.model.Marks marks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(marks);
    }

    /**
    * Returns the marks with the primary key or throws a {@link net.opentrends.training.NoSuchMarksException} if it could not be found.
    *
    * @param marksid the primary key of the marks
    * @return the marks
    * @throws net.opentrends.training.NoSuchMarksException if a marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Marks findByPrimaryKey(
        long marksid)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.NoSuchMarksException {
        return getPersistence().findByPrimaryKey(marksid);
    }

    /**
    * Returns the marks with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param marksid the primary key of the marks
    * @return the marks, or <code>null</code> if a marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Marks fetchByPrimaryKey(
        long marksid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(marksid);
    }

    /**
    * Returns all the markses.
    *
    * @return the markses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.model.Marks> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the markses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.MarksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of markses
    * @param end the upper bound of the range of markses (not inclusive)
    * @return the range of markses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.model.Marks> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the markses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.MarksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of markses
    * @param end the upper bound of the range of markses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of markses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.model.Marks> findAll(
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

    public static MarksPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (MarksPersistence) PortletBeanLocatorUtil.locate(net.opentrends.training.service.ClpSerializer.getServletContextName(),
                    MarksPersistence.class.getName());

            ReferenceRegistry.registerReference(MarksUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(MarksPersistence persistence) {
    }
}
