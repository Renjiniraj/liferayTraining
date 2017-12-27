package net.opentrends.training.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import net.opentrends.training.model.Department;
import net.opentrends.training.service.DepartmentLocalService;
import net.opentrends.training.service.persistence.DepartmentPersistence;
import net.opentrends.training.service.persistence.MarksPersistence;
import net.opentrends.training.service.persistence.StudentFinder;
import net.opentrends.training.service.persistence.StudentPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the department local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link net.opentrends.training.service.impl.DepartmentLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.impl.DepartmentLocalServiceImpl
 * @see net.opentrends.training.service.DepartmentLocalServiceUtil
 * @generated
 */
public abstract class DepartmentLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements DepartmentLocalService,
        IdentifiableBean {
    @BeanReference(type = net.opentrends.training.service.DepartmentLocalService.class)
    protected net.opentrends.training.service.DepartmentLocalService departmentLocalService;
    @BeanReference(type = net.opentrends.training.service.DepartmentService.class)
    protected net.opentrends.training.service.DepartmentService departmentService;
    @BeanReference(type = DepartmentPersistence.class)
    protected DepartmentPersistence departmentPersistence;
    @BeanReference(type = net.opentrends.training.service.MarksLocalService.class)
    protected net.opentrends.training.service.MarksLocalService marksLocalService;
    @BeanReference(type = net.opentrends.training.service.MarksService.class)
    protected net.opentrends.training.service.MarksService marksService;
    @BeanReference(type = MarksPersistence.class)
    protected MarksPersistence marksPersistence;
    @BeanReference(type = net.opentrends.training.service.StudentLocalService.class)
    protected net.opentrends.training.service.StudentLocalService studentLocalService;
    @BeanReference(type = net.opentrends.training.service.StudentService.class)
    protected net.opentrends.training.service.StudentService studentService;
    @BeanReference(type = StudentPersistence.class)
    protected StudentPersistence studentPersistence;
    @BeanReference(type = StudentFinder.class)
    protected StudentFinder studentFinder;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private DepartmentLocalServiceClpInvoker _clpInvoker = new DepartmentLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link net.opentrends.training.service.DepartmentLocalServiceUtil} to access the department local service.
     */

    /**
     * Adds the department to the database. Also notifies the appropriate model listeners.
     *
     * @param department the department
     * @return the department that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Department addDepartment(Department department)
        throws SystemException {
        department.setNew(true);

        return departmentPersistence.update(department);
    }

    /**
     * Creates a new department with the primary key. Does not add the department to the database.
     *
     * @param departmentid the primary key for the new department
     * @return the new department
     */
    @Override
    public Department createDepartment(long departmentid) {
        return departmentPersistence.create(departmentid);
    }

    /**
     * Deletes the department with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param departmentid the primary key of the department
     * @return the department that was removed
     * @throws PortalException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Department deleteDepartment(long departmentid)
        throws PortalException, SystemException {
        return departmentPersistence.remove(departmentid);
    }

    /**
     * Deletes the department from the database. Also notifies the appropriate model listeners.
     *
     * @param department the department
     * @return the department that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Department deleteDepartment(Department department)
        throws SystemException {
        return departmentPersistence.remove(department);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Department.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return departmentPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.DepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return departmentPersistence.findWithDynamicQuery(dynamicQuery, start,
            end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.DepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return departmentPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return departmentPersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return departmentPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public Department fetchDepartment(long departmentid)
        throws SystemException {
        return departmentPersistence.fetchByPrimaryKey(departmentid);
    }

    /**
     * Returns the department with the primary key.
     *
     * @param departmentid the primary key of the department
     * @return the department
     * @throws PortalException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Department getDepartment(long departmentid)
        throws PortalException, SystemException {
        return departmentPersistence.findByPrimaryKey(departmentid);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return departmentPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the departments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.DepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of departments
     * @param end the upper bound of the range of departments (not inclusive)
     * @return the range of departments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Department> getDepartments(int start, int end)
        throws SystemException {
        return departmentPersistence.findAll(start, end);
    }

    /**
     * Returns the number of departments.
     *
     * @return the number of departments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getDepartmentsCount() throws SystemException {
        return departmentPersistence.countAll();
    }

    /**
     * Updates the department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param department the department
     * @return the department that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Department updateDepartment(Department department)
        throws SystemException {
        return departmentPersistence.update(department);
    }

    /**
     * Returns the department local service.
     *
     * @return the department local service
     */
    public net.opentrends.training.service.DepartmentLocalService getDepartmentLocalService() {
        return departmentLocalService;
    }

    /**
     * Sets the department local service.
     *
     * @param departmentLocalService the department local service
     */
    public void setDepartmentLocalService(
        net.opentrends.training.service.DepartmentLocalService departmentLocalService) {
        this.departmentLocalService = departmentLocalService;
    }

    /**
     * Returns the department remote service.
     *
     * @return the department remote service
     */
    public net.opentrends.training.service.DepartmentService getDepartmentService() {
        return departmentService;
    }

    /**
     * Sets the department remote service.
     *
     * @param departmentService the department remote service
     */
    public void setDepartmentService(
        net.opentrends.training.service.DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    /**
     * Returns the department persistence.
     *
     * @return the department persistence
     */
    public DepartmentPersistence getDepartmentPersistence() {
        return departmentPersistence;
    }

    /**
     * Sets the department persistence.
     *
     * @param departmentPersistence the department persistence
     */
    public void setDepartmentPersistence(
        DepartmentPersistence departmentPersistence) {
        this.departmentPersistence = departmentPersistence;
    }

    /**
     * Returns the marks local service.
     *
     * @return the marks local service
     */
    public net.opentrends.training.service.MarksLocalService getMarksLocalService() {
        return marksLocalService;
    }

    /**
     * Sets the marks local service.
     *
     * @param marksLocalService the marks local service
     */
    public void setMarksLocalService(
        net.opentrends.training.service.MarksLocalService marksLocalService) {
        this.marksLocalService = marksLocalService;
    }

    /**
     * Returns the marks remote service.
     *
     * @return the marks remote service
     */
    public net.opentrends.training.service.MarksService getMarksService() {
        return marksService;
    }

    /**
     * Sets the marks remote service.
     *
     * @param marksService the marks remote service
     */
    public void setMarksService(
        net.opentrends.training.service.MarksService marksService) {
        this.marksService = marksService;
    }

    /**
     * Returns the marks persistence.
     *
     * @return the marks persistence
     */
    public MarksPersistence getMarksPersistence() {
        return marksPersistence;
    }

    /**
     * Sets the marks persistence.
     *
     * @param marksPersistence the marks persistence
     */
    public void setMarksPersistence(MarksPersistence marksPersistence) {
        this.marksPersistence = marksPersistence;
    }

    /**
     * Returns the student local service.
     *
     * @return the student local service
     */
    public net.opentrends.training.service.StudentLocalService getStudentLocalService() {
        return studentLocalService;
    }

    /**
     * Sets the student local service.
     *
     * @param studentLocalService the student local service
     */
    public void setStudentLocalService(
        net.opentrends.training.service.StudentLocalService studentLocalService) {
        this.studentLocalService = studentLocalService;
    }

    /**
     * Returns the student remote service.
     *
     * @return the student remote service
     */
    public net.opentrends.training.service.StudentService getStudentService() {
        return studentService;
    }

    /**
     * Sets the student remote service.
     *
     * @param studentService the student remote service
     */
    public void setStudentService(
        net.opentrends.training.service.StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * Returns the student persistence.
     *
     * @return the student persistence
     */
    public StudentPersistence getStudentPersistence() {
        return studentPersistence;
    }

    /**
     * Sets the student persistence.
     *
     * @param studentPersistence the student persistence
     */
    public void setStudentPersistence(StudentPersistence studentPersistence) {
        this.studentPersistence = studentPersistence;
    }

    /**
     * Returns the student finder.
     *
     * @return the student finder
     */
    public StudentFinder getStudentFinder() {
        return studentFinder;
    }

    /**
     * Sets the student finder.
     *
     * @param studentFinder the student finder
     */
    public void setStudentFinder(StudentFinder studentFinder) {
        this.studentFinder = studentFinder;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("net.opentrends.training.model.Department",
            departmentLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "net.opentrends.training.model.Department");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Department.class;
    }

    protected String getModelClassName() {
        return Department.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = departmentPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
