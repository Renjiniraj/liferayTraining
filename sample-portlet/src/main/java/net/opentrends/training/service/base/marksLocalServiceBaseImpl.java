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

import net.opentrends.training.model.marks;
import net.opentrends.training.service.marksLocalService;
import net.opentrends.training.service.persistence.EmployeePersistence;
import net.opentrends.training.service.persistence.FooPersistence;
import net.opentrends.training.service.persistence.ManagerPersistence;
import net.opentrends.training.service.persistence.Student1Persistence;
import net.opentrends.training.service.persistence.departmentPersistence;
import net.opentrends.training.service.persistence.marksPersistence;
import net.opentrends.training.service.persistence.studentFinder;
import net.opentrends.training.service.persistence.studentPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the marks local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link net.opentrends.training.service.impl.marksLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.impl.marksLocalServiceImpl
 * @see net.opentrends.training.service.marksLocalServiceUtil
 * @generated
 */
public abstract class marksLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements marksLocalService, IdentifiableBean {
    @BeanReference(type = net.opentrends.training.service.departmentLocalService.class)
    protected net.opentrends.training.service.departmentLocalService departmentLocalService;
    @BeanReference(type = net.opentrends.training.service.departmentService.class)
    protected net.opentrends.training.service.departmentService departmentService;
    @BeanReference(type = departmentPersistence.class)
    protected departmentPersistence departmentPersistence;
    @BeanReference(type = net.opentrends.training.service.EmployeeLocalService.class)
    protected net.opentrends.training.service.EmployeeLocalService employeeLocalService;
    @BeanReference(type = net.opentrends.training.service.EmployeeService.class)
    protected net.opentrends.training.service.EmployeeService employeeService;
    @BeanReference(type = EmployeePersistence.class)
    protected EmployeePersistence employeePersistence;
    @BeanReference(type = net.opentrends.training.service.FooLocalService.class)
    protected net.opentrends.training.service.FooLocalService fooLocalService;
    @BeanReference(type = net.opentrends.training.service.FooService.class)
    protected net.opentrends.training.service.FooService fooService;
    @BeanReference(type = FooPersistence.class)
    protected FooPersistence fooPersistence;
    @BeanReference(type = net.opentrends.training.service.ManagerLocalService.class)
    protected net.opentrends.training.service.ManagerLocalService managerLocalService;
    @BeanReference(type = ManagerPersistence.class)
    protected ManagerPersistence managerPersistence;
    @BeanReference(type = net.opentrends.training.service.marksLocalService.class)
    protected net.opentrends.training.service.marksLocalService marksLocalService;
    @BeanReference(type = net.opentrends.training.service.marksService.class)
    protected net.opentrends.training.service.marksService marksService;
    @BeanReference(type = marksPersistence.class)
    protected marksPersistence marksPersistence;
    @BeanReference(type = net.opentrends.training.service.studentLocalService.class)
    protected net.opentrends.training.service.studentLocalService studentLocalService;
    @BeanReference(type = net.opentrends.training.service.studentService.class)
    protected net.opentrends.training.service.studentService studentService;
    @BeanReference(type = studentPersistence.class)
    protected studentPersistence studentPersistence;
    @BeanReference(type = studentFinder.class)
    protected studentFinder studentFinder;
    @BeanReference(type = net.opentrends.training.service.Student1LocalService.class)
    protected net.opentrends.training.service.Student1LocalService student1LocalService;
    @BeanReference(type = net.opentrends.training.service.Student1Service.class)
    protected net.opentrends.training.service.Student1Service student1Service;
    @BeanReference(type = Student1Persistence.class)
    protected Student1Persistence student1Persistence;
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
    private marksLocalServiceClpInvoker _clpInvoker = new marksLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link net.opentrends.training.service.marksLocalServiceUtil} to access the marks local service.
     */

    /**
     * Adds the marks to the database. Also notifies the appropriate model listeners.
     *
     * @param marks the marks
     * @return the marks that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public marks addmarks(marks marks) throws SystemException {
        marks.setNew(true);

        return marksPersistence.update(marks);
    }

    /**
     * Creates a new marks with the primary key. Does not add the marks to the database.
     *
     * @param id the primary key for the new marks
     * @return the new marks
     */
    @Override
    public marks createmarks(long id) {
        return marksPersistence.create(id);
    }

    /**
     * Deletes the marks with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the marks
     * @return the marks that was removed
     * @throws PortalException if a marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public marks deletemarks(long id) throws PortalException, SystemException {
        return marksPersistence.remove(id);
    }

    /**
     * Deletes the marks from the database. Also notifies the appropriate model listeners.
     *
     * @param marks the marks
     * @return the marks that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public marks deletemarks(marks marks) throws SystemException {
        return marksPersistence.remove(marks);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(marks.class,
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
        return marksPersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return marksPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return marksPersistence.findWithDynamicQuery(dynamicQuery, start, end,
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return marksPersistence.countWithDynamicQuery(dynamicQuery);
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
        return marksPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public marks fetchmarks(long id) throws SystemException {
        return marksPersistence.fetchByPrimaryKey(id);
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
    public marks getmarks(long id) throws PortalException, SystemException {
        return marksPersistence.findByPrimaryKey(id);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return marksPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<marks> getmarkses(int start, int end) throws SystemException {
        return marksPersistence.findAll(start, end);
    }

    /**
     * Returns the number of markses.
     *
     * @return the number of markses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getmarksesCount() throws SystemException {
        return marksPersistence.countAll();
    }

    /**
     * Updates the marks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param marks the marks
     * @return the marks that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public marks updatemarks(marks marks) throws SystemException {
        return marksPersistence.update(marks);
    }

    /**
     * Returns the department local service.
     *
     * @return the department local service
     */
    public net.opentrends.training.service.departmentLocalService getdepartmentLocalService() {
        return departmentLocalService;
    }

    /**
     * Sets the department local service.
     *
     * @param departmentLocalService the department local service
     */
    public void setdepartmentLocalService(
        net.opentrends.training.service.departmentLocalService departmentLocalService) {
        this.departmentLocalService = departmentLocalService;
    }

    /**
     * Returns the department remote service.
     *
     * @return the department remote service
     */
    public net.opentrends.training.service.departmentService getdepartmentService() {
        return departmentService;
    }

    /**
     * Sets the department remote service.
     *
     * @param departmentService the department remote service
     */
    public void setdepartmentService(
        net.opentrends.training.service.departmentService departmentService) {
        this.departmentService = departmentService;
    }

    /**
     * Returns the department persistence.
     *
     * @return the department persistence
     */
    public departmentPersistence getdepartmentPersistence() {
        return departmentPersistence;
    }

    /**
     * Sets the department persistence.
     *
     * @param departmentPersistence the department persistence
     */
    public void setdepartmentPersistence(
        departmentPersistence departmentPersistence) {
        this.departmentPersistence = departmentPersistence;
    }

    /**
     * Returns the employee local service.
     *
     * @return the employee local service
     */
    public net.opentrends.training.service.EmployeeLocalService getEmployeeLocalService() {
        return employeeLocalService;
    }

    /**
     * Sets the employee local service.
     *
     * @param employeeLocalService the employee local service
     */
    public void setEmployeeLocalService(
        net.opentrends.training.service.EmployeeLocalService employeeLocalService) {
        this.employeeLocalService = employeeLocalService;
    }

    /**
     * Returns the employee remote service.
     *
     * @return the employee remote service
     */
    public net.opentrends.training.service.EmployeeService getEmployeeService() {
        return employeeService;
    }

    /**
     * Sets the employee remote service.
     *
     * @param employeeService the employee remote service
     */
    public void setEmployeeService(
        net.opentrends.training.service.EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * Returns the employee persistence.
     *
     * @return the employee persistence
     */
    public EmployeePersistence getEmployeePersistence() {
        return employeePersistence;
    }

    /**
     * Sets the employee persistence.
     *
     * @param employeePersistence the employee persistence
     */
    public void setEmployeePersistence(EmployeePersistence employeePersistence) {
        this.employeePersistence = employeePersistence;
    }

    /**
     * Returns the foo local service.
     *
     * @return the foo local service
     */
    public net.opentrends.training.service.FooLocalService getFooLocalService() {
        return fooLocalService;
    }

    /**
     * Sets the foo local service.
     *
     * @param fooLocalService the foo local service
     */
    public void setFooLocalService(
        net.opentrends.training.service.FooLocalService fooLocalService) {
        this.fooLocalService = fooLocalService;
    }

    /**
     * Returns the foo remote service.
     *
     * @return the foo remote service
     */
    public net.opentrends.training.service.FooService getFooService() {
        return fooService;
    }

    /**
     * Sets the foo remote service.
     *
     * @param fooService the foo remote service
     */
    public void setFooService(
        net.opentrends.training.service.FooService fooService) {
        this.fooService = fooService;
    }

    /**
     * Returns the foo persistence.
     *
     * @return the foo persistence
     */
    public FooPersistence getFooPersistence() {
        return fooPersistence;
    }

    /**
     * Sets the foo persistence.
     *
     * @param fooPersistence the foo persistence
     */
    public void setFooPersistence(FooPersistence fooPersistence) {
        this.fooPersistence = fooPersistence;
    }

    /**
     * Returns the manager local service.
     *
     * @return the manager local service
     */
    public net.opentrends.training.service.ManagerLocalService getManagerLocalService() {
        return managerLocalService;
    }

    /**
     * Sets the manager local service.
     *
     * @param managerLocalService the manager local service
     */
    public void setManagerLocalService(
        net.opentrends.training.service.ManagerLocalService managerLocalService) {
        this.managerLocalService = managerLocalService;
    }

    /**
     * Returns the manager persistence.
     *
     * @return the manager persistence
     */
    public ManagerPersistence getManagerPersistence() {
        return managerPersistence;
    }

    /**
     * Sets the manager persistence.
     *
     * @param managerPersistence the manager persistence
     */
    public void setManagerPersistence(ManagerPersistence managerPersistence) {
        this.managerPersistence = managerPersistence;
    }

    /**
     * Returns the marks local service.
     *
     * @return the marks local service
     */
    public net.opentrends.training.service.marksLocalService getmarksLocalService() {
        return marksLocalService;
    }

    /**
     * Sets the marks local service.
     *
     * @param marksLocalService the marks local service
     */
    public void setmarksLocalService(
        net.opentrends.training.service.marksLocalService marksLocalService) {
        this.marksLocalService = marksLocalService;
    }

    /**
     * Returns the marks remote service.
     *
     * @return the marks remote service
     */
    public net.opentrends.training.service.marksService getmarksService() {
        return marksService;
    }

    /**
     * Sets the marks remote service.
     *
     * @param marksService the marks remote service
     */
    public void setmarksService(
        net.opentrends.training.service.marksService marksService) {
        this.marksService = marksService;
    }

    /**
     * Returns the marks persistence.
     *
     * @return the marks persistence
     */
    public marksPersistence getmarksPersistence() {
        return marksPersistence;
    }

    /**
     * Sets the marks persistence.
     *
     * @param marksPersistence the marks persistence
     */
    public void setmarksPersistence(marksPersistence marksPersistence) {
        this.marksPersistence = marksPersistence;
    }

    /**
     * Returns the student local service.
     *
     * @return the student local service
     */
    public net.opentrends.training.service.studentLocalService getstudentLocalService() {
        return studentLocalService;
    }

    /**
     * Sets the student local service.
     *
     * @param studentLocalService the student local service
     */
    public void setstudentLocalService(
        net.opentrends.training.service.studentLocalService studentLocalService) {
        this.studentLocalService = studentLocalService;
    }

    /**
     * Returns the student remote service.
     *
     * @return the student remote service
     */
    public net.opentrends.training.service.studentService getstudentService() {
        return studentService;
    }

    /**
     * Sets the student remote service.
     *
     * @param studentService the student remote service
     */
    public void setstudentService(
        net.opentrends.training.service.studentService studentService) {
        this.studentService = studentService;
    }

    /**
     * Returns the student persistence.
     *
     * @return the student persistence
     */
    public studentPersistence getstudentPersistence() {
        return studentPersistence;
    }

    /**
     * Sets the student persistence.
     *
     * @param studentPersistence the student persistence
     */
    public void setstudentPersistence(studentPersistence studentPersistence) {
        this.studentPersistence = studentPersistence;
    }

    /**
     * Returns the student finder.
     *
     * @return the student finder
     */
    public studentFinder getstudentFinder() {
        return studentFinder;
    }

    /**
     * Sets the student finder.
     *
     * @param studentFinder the student finder
     */
    public void setstudentFinder(studentFinder studentFinder) {
        this.studentFinder = studentFinder;
    }

    /**
     * Returns the student1 local service.
     *
     * @return the student1 local service
     */
    public net.opentrends.training.service.Student1LocalService getStudent1LocalService() {
        return student1LocalService;
    }

    /**
     * Sets the student1 local service.
     *
     * @param student1LocalService the student1 local service
     */
    public void setStudent1LocalService(
        net.opentrends.training.service.Student1LocalService student1LocalService) {
        this.student1LocalService = student1LocalService;
    }

    /**
     * Returns the student1 remote service.
     *
     * @return the student1 remote service
     */
    public net.opentrends.training.service.Student1Service getStudent1Service() {
        return student1Service;
    }

    /**
     * Sets the student1 remote service.
     *
     * @param student1Service the student1 remote service
     */
    public void setStudent1Service(
        net.opentrends.training.service.Student1Service student1Service) {
        this.student1Service = student1Service;
    }

    /**
     * Returns the student1 persistence.
     *
     * @return the student1 persistence
     */
    public Student1Persistence getStudent1Persistence() {
        return student1Persistence;
    }

    /**
     * Sets the student1 persistence.
     *
     * @param student1Persistence the student1 persistence
     */
    public void setStudent1Persistence(Student1Persistence student1Persistence) {
        this.student1Persistence = student1Persistence;
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

        PersistedModelLocalServiceRegistryUtil.register("net.opentrends.training.model.marks",
            marksLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "net.opentrends.training.model.marks");
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
        return marks.class;
    }

    protected String getModelClassName() {
        return marks.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = marksPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
