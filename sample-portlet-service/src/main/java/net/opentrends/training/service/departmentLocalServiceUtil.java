package net.opentrends.training.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for department. This utility wraps
 * {@link net.opentrends.training.service.impl.departmentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see departmentLocalService
 * @see net.opentrends.training.service.base.departmentLocalServiceBaseImpl
 * @see net.opentrends.training.service.impl.departmentLocalServiceImpl
 * @generated
 */
public class departmentLocalServiceUtil {
    private static departmentLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link net.opentrends.training.service.impl.departmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the department to the database. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @return the department that was added
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.department adddepartment(
        net.opentrends.training.model.department department)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().adddepartment(department);
    }

    /**
    * Creates a new department with the primary key. Does not add the department to the database.
    *
    * @param id the primary key for the new department
    * @return the new department
    */
    public static net.opentrends.training.model.department createdepartment(
        long id) {
        return getService().createdepartment(id);
    }

    /**
    * Deletes the department with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the department
    * @return the department that was removed
    * @throws PortalException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.department deletedepartment(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletedepartment(id);
    }

    /**
    * Deletes the department from the database. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @return the department that was removed
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.department deletedepartment(
        net.opentrends.training.model.department department)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletedepartment(department);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.departmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static net.opentrends.training.model.department fetchdepartment(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchdepartment(id);
    }

    /**
    * Returns the department with the primary key.
    *
    * @param id the primary key of the department
    * @return the department
    * @throws PortalException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.department getdepartment(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getdepartment(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<net.opentrends.training.model.department> getdepartments(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getdepartments(start, end);
    }

    /**
    * Returns the number of departments.
    *
    * @return the number of departments
    * @throws SystemException if a system exception occurred
    */
    public static int getdepartmentsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getdepartmentsCount();
    }

    /**
    * Updates the department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @return the department that was updated
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.model.department updatedepartment(
        net.opentrends.training.model.department department)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatedepartment(department);
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

    public static departmentLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    departmentLocalService.class.getName());

            if (invokableLocalService instanceof departmentLocalService) {
                _service = (departmentLocalService) invokableLocalService;
            } else {
                _service = new departmentLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(departmentLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(departmentLocalService service) {
    }
}
