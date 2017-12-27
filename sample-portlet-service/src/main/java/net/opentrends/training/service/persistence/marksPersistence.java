package net.opentrends.training.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import net.opentrends.training.model.marks;

/**
 * The persistence interface for the marks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see marksPersistenceImpl
 * @see marksUtil
 * @generated
 */
public interface marksPersistence extends BasePersistence<marks> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link marksUtil} to access the marks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the marks in the entity cache if it is enabled.
    *
    * @param marks the marks
    */
    public void cacheResult(net.opentrends.training.model.marks marks);

    /**
    * Caches the markses in the entity cache if it is enabled.
    *
    * @param markses the markses
    */
    public void cacheResult(
        java.util.List<net.opentrends.training.model.marks> markses);

    /**
    * Creates a new marks with the primary key. Does not add the marks to the database.
    *
    * @param id the primary key for the new marks
    * @return the new marks
    */
    public net.opentrends.training.model.marks create(long id);

    /**
    * Removes the marks with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the marks
    * @return the marks that was removed
    * @throws net.opentrends.training.NoSuchmarksException if a marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.model.marks remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.NoSuchmarksException;

    public net.opentrends.training.model.marks updateImpl(
        net.opentrends.training.model.marks marks)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the marks with the primary key or throws a {@link net.opentrends.training.NoSuchmarksException} if it could not be found.
    *
    * @param id the primary key of the marks
    * @return the marks
    * @throws net.opentrends.training.NoSuchmarksException if a marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.model.marks findByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.NoSuchmarksException;

    /**
    * Returns the marks with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the marks
    * @return the marks, or <code>null</code> if a marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.model.marks fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the markses.
    *
    * @return the markses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.training.model.marks> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.training.model.marks> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.training.model.marks> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the markses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of markses.
    *
    * @return the number of markses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
