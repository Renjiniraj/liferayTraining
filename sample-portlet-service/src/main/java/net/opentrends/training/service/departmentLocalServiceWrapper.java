package net.opentrends.training.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link departmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see departmentLocalService
 * @generated
 */
public class departmentLocalServiceWrapper implements departmentLocalService,
    ServiceWrapper<departmentLocalService> {
    private departmentLocalService _departmentLocalService;

    public departmentLocalServiceWrapper(
        departmentLocalService departmentLocalService) {
        _departmentLocalService = departmentLocalService;
    }

    /**
    * Adds the department to the database. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @return the department that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.department adddepartment(
        net.opentrends.training.model.department department)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.adddepartment(department);
    }

    /**
    * Creates a new department with the primary key. Does not add the department to the database.
    *
    * @param id the primary key for the new department
    * @return the new department
    */
    @Override
    public net.opentrends.training.model.department createdepartment(long id) {
        return _departmentLocalService.createdepartment(id);
    }

    /**
    * Deletes the department with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the department
    * @return the department that was removed
    * @throws PortalException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.department deletedepartment(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.deletedepartment(id);
    }

    /**
    * Deletes the department from the database. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @return the department that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.department deletedepartment(
        net.opentrends.training.model.department department)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.deletedepartment(department);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _departmentLocalService.dynamicQuery();
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
        return _departmentLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.departmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _departmentLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.departmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _departmentLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _departmentLocalService.dynamicQueryCount(dynamicQuery);
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
        return _departmentLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public net.opentrends.training.model.department fetchdepartment(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.fetchdepartment(id);
    }

    /**
    * Returns the department with the primary key.
    *
    * @param id the primary key of the department
    * @return the department
    * @throws PortalException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.department getdepartment(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.getdepartment(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the departments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.departmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of departments
    * @param end the upper bound of the range of departments (not inclusive)
    * @return the range of departments
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<net.opentrends.training.model.department> getdepartments(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.getdepartments(start, end);
    }

    /**
    * Returns the number of departments.
    *
    * @return the number of departments
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getdepartmentsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.getdepartmentsCount();
    }

    /**
    * Updates the department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @return the department that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.department updatedepartment(
        net.opentrends.training.model.department department)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.updatedepartment(department);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _departmentLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _departmentLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _departmentLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public departmentLocalService getWrappeddepartmentLocalService() {
        return _departmentLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappeddepartmentLocalService(
        departmentLocalService departmentLocalService) {
        _departmentLocalService = departmentLocalService;
    }

    @Override
    public departmentLocalService getWrappedService() {
        return _departmentLocalService;
    }

    @Override
    public void setWrappedService(departmentLocalService departmentLocalService) {
        _departmentLocalService = departmentLocalService;
    }
}
