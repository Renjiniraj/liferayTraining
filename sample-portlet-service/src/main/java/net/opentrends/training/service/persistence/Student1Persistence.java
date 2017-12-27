package net.opentrends.training.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import net.opentrends.training.model.Student1;

/**
 * The persistence interface for the student1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student1PersistenceImpl
 * @see Student1Util
 * @generated
 */
public interface Student1Persistence extends BasePersistence<Student1> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Student1Util} to access the student1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the student1 in the entity cache if it is enabled.
    *
    * @param student1 the student1
    */
    public void cacheResult(net.opentrends.training.model.Student1 student1);

    /**
    * Caches the student1s in the entity cache if it is enabled.
    *
    * @param student1s the student1s
    */
    public void cacheResult(
        java.util.List<net.opentrends.training.model.Student1> student1s);

    /**
    * Creates a new student1 with the primary key. Does not add the student1 to the database.
    *
    * @param studentid the primary key for the new student1
    * @return the new student1
    */
    public net.opentrends.training.model.Student1 create(long studentid);

    /**
    * Removes the student1 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param studentid the primary key of the student1
    * @return the student1 that was removed
    * @throws net.opentrends.training.NoSuchStudent1Exception if a student1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.model.Student1 remove(long studentid)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.NoSuchStudent1Exception;

    public net.opentrends.training.model.Student1 updateImpl(
        net.opentrends.training.model.Student1 student1)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the student1 with the primary key or throws a {@link net.opentrends.training.NoSuchStudent1Exception} if it could not be found.
    *
    * @param studentid the primary key of the student1
    * @return the student1
    * @throws net.opentrends.training.NoSuchStudent1Exception if a student1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.model.Student1 findByPrimaryKey(
        long studentid)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.NoSuchStudent1Exception;

    /**
    * Returns the student1 with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param studentid the primary key of the student1
    * @return the student1, or <code>null</code> if a student1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.model.Student1 fetchByPrimaryKey(
        long studentid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the student1s.
    *
    * @return the student1s
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.training.model.Student1> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.training.model.Student1> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.training.model.Student1> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the student1s from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of student1s.
    *
    * @return the number of student1s
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
