package net.opentrends.training.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link marksLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see marksLocalService
 * @generated
 */
public class marksLocalServiceWrapper implements marksLocalService,
    ServiceWrapper<marksLocalService> {
    private marksLocalService _marksLocalService;

    public marksLocalServiceWrapper(marksLocalService marksLocalService) {
        _marksLocalService = marksLocalService;
    }

    /**
    * Adds the marks to the database. Also notifies the appropriate model listeners.
    *
    * @param marks the marks
    * @return the marks that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.marks addmarks(
        net.opentrends.training.model.marks marks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.addmarks(marks);
    }

    /**
    * Creates a new marks with the primary key. Does not add the marks to the database.
    *
    * @param id the primary key for the new marks
    * @return the new marks
    */
    @Override
    public net.opentrends.training.model.marks createmarks(long id) {
        return _marksLocalService.createmarks(id);
    }

    /**
    * Deletes the marks with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the marks
    * @return the marks that was removed
    * @throws PortalException if a marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.marks deletemarks(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.deletemarks(id);
    }

    /**
    * Deletes the marks from the database. Also notifies the appropriate model listeners.
    *
    * @param marks the marks
    * @return the marks that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.marks deletemarks(
        net.opentrends.training.model.marks marks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.deletemarks(marks);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _marksLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.marksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.marksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public net.opentrends.training.model.marks fetchmarks(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.fetchmarks(id);
    }

    /**
    * Returns the marks with the primary key.
    *
    * @param id the primary key of the marks
    * @return the marks
    * @throws PortalException if a marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.marks getmarks(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.getmarks(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<net.opentrends.training.model.marks> getmarkses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.getmarkses(start, end);
    }

    /**
    * Returns the number of markses.
    *
    * @return the number of markses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getmarksesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.getmarksesCount();
    }

    /**
    * Updates the marks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param marks the marks
    * @return the marks that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.marks updatemarks(
        net.opentrends.training.model.marks marks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _marksLocalService.updatemarks(marks);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _marksLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _marksLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _marksLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public marksLocalService getWrappedmarksLocalService() {
        return _marksLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedmarksLocalService(marksLocalService marksLocalService) {
        _marksLocalService = marksLocalService;
    }

    @Override
    public marksLocalService getWrappedService() {
        return _marksLocalService;
    }

    @Override
    public void setWrappedService(marksLocalService marksLocalService) {
        _marksLocalService = marksLocalService;
    }
}
