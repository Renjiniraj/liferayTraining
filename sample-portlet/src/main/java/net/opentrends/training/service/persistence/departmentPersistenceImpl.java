package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import net.opentrends.training.NoSuchdepartmentException;
import net.opentrends.training.model.department;
import net.opentrends.training.model.impl.departmentImpl;
import net.opentrends.training.model.impl.departmentModelImpl;
import net.opentrends.training.service.persistence.departmentPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the department service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see departmentPersistence
 * @see departmentUtil
 * @generated
 */
public class departmentPersistenceImpl extends BasePersistenceImpl<department>
    implements departmentPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link departmentUtil} to access the department persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = departmentImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, departmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, departmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_DEPARTMENT = "SELECT department FROM department department";
    private static final String _SQL_COUNT_DEPARTMENT = "SELECT COUNT(department) FROM department department";
    private static final String _ORDER_BY_ENTITY_ALIAS = "department.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No department exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(departmentPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static department _nulldepartment = new departmentImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<department> toCacheModel() {
                return _nulldepartmentCacheModel;
            }
        };

    private static CacheModel<department> _nulldepartmentCacheModel = new CacheModel<department>() {
            @Override
            public department toEntityModel() {
                return _nulldepartment;
            }
        };

    public departmentPersistenceImpl() {
        setModelClass(department.class);
    }

    /**
     * Caches the department in the entity cache if it is enabled.
     *
     * @param department the department
     */
    @Override
    public void cacheResult(department department) {
        EntityCacheUtil.putResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentImpl.class, department.getPrimaryKey(), department);

        department.resetOriginalValues();
    }

    /**
     * Caches the departments in the entity cache if it is enabled.
     *
     * @param departments the departments
     */
    @Override
    public void cacheResult(List<department> departments) {
        for (department department : departments) {
            if (EntityCacheUtil.getResult(
                        departmentModelImpl.ENTITY_CACHE_ENABLED,
                        departmentImpl.class, department.getPrimaryKey()) == null) {
                cacheResult(department);
            } else {
                department.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all departments.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(departmentImpl.class.getName());
        }

        EntityCacheUtil.clearCache(departmentImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the department.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(department department) {
        EntityCacheUtil.removeResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentImpl.class, department.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<department> departments) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (department department : departments) {
            EntityCacheUtil.removeResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
                departmentImpl.class, department.getPrimaryKey());
        }
    }

    /**
     * Creates a new department with the primary key. Does not add the department to the database.
     *
     * @param id the primary key for the new department
     * @return the new department
     */
    @Override
    public department create(long id) {
        department department = new departmentImpl();

        department.setNew(true);
        department.setPrimaryKey(id);

        return department;
    }

    /**
     * Removes the department with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the department
     * @return the department that was removed
     * @throws net.opentrends.training.NoSuchdepartmentException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public department remove(long id)
        throws NoSuchdepartmentException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the department with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the department
     * @return the department that was removed
     * @throws net.opentrends.training.NoSuchdepartmentException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public department remove(Serializable primaryKey)
        throws NoSuchdepartmentException, SystemException {
        Session session = null;

        try {
            session = openSession();

            department department = (department) session.get(departmentImpl.class,
                    primaryKey);

            if (department == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchdepartmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(department);
        } catch (NoSuchdepartmentException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected department removeImpl(department department)
        throws SystemException {
        department = toUnwrappedModel(department);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(department)) {
                department = (department) session.get(departmentImpl.class,
                        department.getPrimaryKeyObj());
            }

            if (department != null) {
                session.delete(department);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (department != null) {
            clearCache(department);
        }

        return department;
    }

    @Override
    public department updateImpl(
        net.opentrends.training.model.department department)
        throws SystemException {
        department = toUnwrappedModel(department);

        boolean isNew = department.isNew();

        Session session = null;

        try {
            session = openSession();

            if (department.isNew()) {
                session.save(department);

                department.setNew(false);
            } else {
                session.merge(department);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
            departmentImpl.class, department.getPrimaryKey(), department);

        return department;
    }

    protected department toUnwrappedModel(department department) {
        if (department instanceof departmentImpl) {
            return department;
        }

        departmentImpl departmentImpl = new departmentImpl();

        departmentImpl.setNew(department.isNew());
        departmentImpl.setPrimaryKey(department.getPrimaryKey());

        departmentImpl.setId(department.getId());
        departmentImpl.setName(department.getName());

        return departmentImpl;
    }

    /**
     * Returns the department with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the department
     * @return the department
     * @throws net.opentrends.training.NoSuchdepartmentException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public department findByPrimaryKey(Serializable primaryKey)
        throws NoSuchdepartmentException, SystemException {
        department department = fetchByPrimaryKey(primaryKey);

        if (department == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchdepartmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return department;
    }

    /**
     * Returns the department with the primary key or throws a {@link net.opentrends.training.NoSuchdepartmentException} if it could not be found.
     *
     * @param id the primary key of the department
     * @return the department
     * @throws net.opentrends.training.NoSuchdepartmentException if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public department findByPrimaryKey(long id)
        throws NoSuchdepartmentException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the department with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the department
     * @return the department, or <code>null</code> if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public department fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        department department = (department) EntityCacheUtil.getResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
                departmentImpl.class, primaryKey);

        if (department == _nulldepartment) {
            return null;
        }

        if (department == null) {
            Session session = null;

            try {
                session = openSession();

                department = (department) session.get(departmentImpl.class,
                        primaryKey);

                if (department != null) {
                    cacheResult(department);
                } else {
                    EntityCacheUtil.putResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
                        departmentImpl.class, primaryKey, _nulldepartment);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(departmentModelImpl.ENTITY_CACHE_ENABLED,
                    departmentImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return department;
    }

    /**
     * Returns the department with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the department
     * @return the department, or <code>null</code> if a department with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public department fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the departments.
     *
     * @return the departments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<department> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<department> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the departments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.departmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of departments
     * @param end the upper bound of the range of departments (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of departments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<department> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<department> list = (List<department>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DEPARTMENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DEPARTMENT;

                if (pagination) {
                    sql = sql.concat(departmentModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<department>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<department>(list);
                } else {
                    list = (List<department>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the departments from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (department department : findAll()) {
            remove(department);
        }
    }

    /**
     * Returns the number of departments.
     *
     * @return the number of departments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_DEPARTMENT);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the department persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.net.opentrends.training.model.department")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<department>> listenersList = new ArrayList<ModelListener<department>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<department>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(departmentImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
