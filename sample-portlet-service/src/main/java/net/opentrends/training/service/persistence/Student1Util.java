package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.training.model.Student1;

import java.util.List;

/**
 * The persistence utility for the student1 service. This utility wraps {@link Student1PersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student1Persistence
 * @see Student1PersistenceImpl
 * @generated
 */
public class Student1Util {
    private static Student1Persistence _persistence;

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
    public static void clearCache(Student1 student1) {
        getPersistence().clearCache(student1);
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
    public static List<Student1> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Student1> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Student1> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Student1 update(Student1 student1) throws SystemException {
        return getPersistence().update(student1);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Student1 update(Student1 student1,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(student1, serviceContext);
    }

    /**
    * Caches the student1 in the entity cache if it is enabled.
    *
    * @param student1 the student1
    */
    public static void cacheResult(
        net.opentrends.training.model.Student1 student1) {
        getPersistence().cacheResult(student1);
    }

    /**
    * Caches the student1s in the entity cache if it is enabled.
    *
    * @param student1s the student1s
    */
    public static void cacheResult(
        java.util.List<net.opentrends.training.model.Student1> student1s) {
        getPersistence().cacheResult(student1s);
    }

    /**
    * Creates a new student1 with the primary key. Does not add the student1 to the database.
    *
    * @param studentid the primary key for the new student1
    * @return the new student1
    */
    public static net.opentrends.training.model.Student1 create(long studentid) {
        return getPersistence().create(studentid);
    }

    /**
    * Removes the student1 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param studentid the primary key of the student1
    * @return the student1 that was removed
    * @throws net.opentrends.training.NoSuchStudent1Exception if a student1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Student1 remove(long studentid)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.NoSuchStudent1Exception {
        return getPersistence().remove(studentid);
    }

    public static net.opentrends.training.model.Student1 updateImpl(
        net.opentrends.training.model.Student1 student1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(student1);
    }

    /**
    * Returns the student1 with the primary key or throws a {@link net.opentrends.training.NoSuchStudent1Exception} if it could not be found.
    *
    * @param studentid the primary key of the student1
    * @return the student1
    * @throws net.opentrends.training.NoSuchStudent1Exception if a student1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Student1 findByPrimaryKey(
        long studentid)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.NoSuchStudent1Exception {
        return getPersistence().findByPrimaryKey(studentid);
    }

    /**
    * Returns the student1 with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param studentid the primary key of the student1
    * @return the student1, or <code>null</code> if a student1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.Student1 fetchByPrimaryKey(
        long studentid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(studentid);
    }

    /**
    * Returns all the student1s.
    *
    * @return the student1s
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.model.Student1> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the student1s.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.Student1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of student1s
    * @param end the upper bound of the range of student1s (not inclusive)
    * @return the range of student1s
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.model.Student1> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the student1s.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.Student1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of student1s
    * @param end the upper bound of the range of student1s (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of student1s
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.model.Student1> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the student1s from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of student1s.
    *
    * @return the number of student1s
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Student1Persistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Student1Persistence) PortletBeanLocatorUtil.locate(net.opentrends.training.service.ClpSerializer.getServletContextName(),
                    Student1Persistence.class.getName());

            ReferenceRegistry.registerReference(Student1Util.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Student1Persistence persistence) {
    }
}
