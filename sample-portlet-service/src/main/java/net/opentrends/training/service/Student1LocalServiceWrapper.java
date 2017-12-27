package net.opentrends.training.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Student1LocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Student1LocalService
 * @generated
 */
public class Student1LocalServiceWrapper implements Student1LocalService,
    ServiceWrapper<Student1LocalService> {
    private Student1LocalService _student1LocalService;

    public Student1LocalServiceWrapper(
        Student1LocalService student1LocalService) {
        _student1LocalService = student1LocalService;
    }

    /**
    * Adds the student1 to the database. Also notifies the appropriate model listeners.
    *
    * @param student1 the student1
    * @return the student1 that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.Student1 addStudent1(
        net.opentrends.training.model.Student1 student1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _student1LocalService.addStudent1(student1);
    }

    /**
    * Creates a new student1 with the primary key. Does not add the student1 to the database.
    *
    * @param studentid the primary key for the new student1
    * @return the new student1
    */
    @Override
    public net.opentrends.training.model.Student1 createStudent1(long studentid) {
        return _student1LocalService.createStudent1(studentid);
    }

    /**
    * Deletes the student1 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param studentid the primary key of the student1
    * @return the student1 that was removed
    * @throws PortalException if a student1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.Student1 deleteStudent1(long studentid)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _student1LocalService.deleteStudent1(studentid);
    }

    /**
    * Deletes the student1 from the database. Also notifies the appropriate model listeners.
    *
    * @param student1 the student1
    * @return the student1 that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.Student1 deleteStudent1(
        net.opentrends.training.model.Student1 student1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _student1LocalService.deleteStudent1(student1);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _student1LocalService.dynamicQuery();
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
        return _student1LocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.Student1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _student1LocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.Student1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _student1LocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _student1LocalService.dynamicQueryCount(dynamicQuery);
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
        return _student1LocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public net.opentrends.training.model.Student1 fetchStudent1(long studentid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _student1LocalService.fetchStudent1(studentid);
    }

    /**
    * Returns the student1 with the primary key.
    *
    * @param studentid the primary key of the student1
    * @return the student1
    * @throws PortalException if a student1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.Student1 getStudent1(long studentid)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _student1LocalService.getStudent1(studentid);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _student1LocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<net.opentrends.training.model.Student1> getStudent1s(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _student1LocalService.getStudent1s(start, end);
    }

    /**
    * Returns the number of student1s.
    *
    * @return the number of student1s
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getStudent1sCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _student1LocalService.getStudent1sCount();
    }

    /**
    * Updates the student1 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param student1 the student1
    * @return the student1 that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.training.model.Student1 updateStudent1(
        net.opentrends.training.model.Student1 student1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _student1LocalService.updateStudent1(student1);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _student1LocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _student1LocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _student1LocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Student1LocalService getWrappedStudent1LocalService() {
        return _student1LocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStudent1LocalService(
        Student1LocalService student1LocalService) {
        _student1LocalService = student1LocalService;
    }

    @Override
    public Student1LocalService getWrappedService() {
        return _student1LocalService;
    }

    @Override
    public void setWrappedService(Student1LocalService student1LocalService) {
        _student1LocalService = student1LocalService;
    }
}
