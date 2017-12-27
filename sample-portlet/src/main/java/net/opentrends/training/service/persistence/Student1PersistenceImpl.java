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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import net.opentrends.training.NoSuchStudent1Exception;
import net.opentrends.training.model.Student1;
import net.opentrends.training.model.impl.Student1Impl;
import net.opentrends.training.model.impl.Student1ModelImpl;
import net.opentrends.training.service.persistence.Student1Persistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the student1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student1Persistence
 * @see Student1Util
 * @generated
 */
public class Student1PersistenceImpl extends BasePersistenceImpl<Student1>
    implements Student1Persistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Student1Util} to access the student1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Student1Impl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Student1ModelImpl.ENTITY_CACHE_ENABLED,
            Student1ModelImpl.FINDER_CACHE_ENABLED, Student1Impl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Student1ModelImpl.ENTITY_CACHE_ENABLED,
            Student1ModelImpl.FINDER_CACHE_ENABLED, Student1Impl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Student1ModelImpl.ENTITY_CACHE_ENABLED,
            Student1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_STUDENT1 = "SELECT student1 FROM Student1 student1";
    private static final String _SQL_COUNT_STUDENT1 = "SELECT COUNT(student1) FROM Student1 student1";
    private static final String _ORDER_BY_ENTITY_ALIAS = "student1.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Student1 exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Student1PersistenceImpl.class);
    private static Student1 _nullStudent1 = new Student1Impl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Student1> toCacheModel() {
                return _nullStudent1CacheModel;
            }
        };

    private static CacheModel<Student1> _nullStudent1CacheModel = new CacheModel<Student1>() {
            @Override
            public Student1 toEntityModel() {
                return _nullStudent1;
            }
        };

    public Student1PersistenceImpl() {
        setModelClass(Student1.class);
    }

    /**
     * Caches the student1 in the entity cache if it is enabled.
     *
     * @param student1 the student1
     */
    @Override
    public void cacheResult(Student1 student1) {
        EntityCacheUtil.putResult(Student1ModelImpl.ENTITY_CACHE_ENABLED,
            Student1Impl.class, student1.getPrimaryKey(), student1);

        student1.resetOriginalValues();
    }

    /**
     * Caches the student1s in the entity cache if it is enabled.
     *
     * @param student1s the student1s
     */
    @Override
    public void cacheResult(List<Student1> student1s) {
        for (Student1 student1 : student1s) {
            if (EntityCacheUtil.getResult(
                        Student1ModelImpl.ENTITY_CACHE_ENABLED,
                        Student1Impl.class, student1.getPrimaryKey()) == null) {
                cacheResult(student1);
            } else {
                student1.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all student1s.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Student1Impl.class.getName());
        }

        EntityCacheUtil.clearCache(Student1Impl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the student1.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Student1 student1) {
        EntityCacheUtil.removeResult(Student1ModelImpl.ENTITY_CACHE_ENABLED,
            Student1Impl.class, student1.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Student1> student1s) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Student1 student1 : student1s) {
            EntityCacheUtil.removeResult(Student1ModelImpl.ENTITY_CACHE_ENABLED,
                Student1Impl.class, student1.getPrimaryKey());
        }
    }

    /**
     * Creates a new student1 with the primary key. Does not add the student1 to the database.
     *
     * @param studentid the primary key for the new student1
     * @return the new student1
     */
    @Override
    public Student1 create(long studentid) {
        Student1 student1 = new Student1Impl();

        student1.setNew(true);
        student1.setPrimaryKey(studentid);

        return student1;
    }

    /**
     * Removes the student1 with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param studentid the primary key of the student1
     * @return the student1 that was removed
     * @throws net.opentrends.training.NoSuchStudent1Exception if a student1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student1 remove(long studentid)
        throws NoSuchStudent1Exception, SystemException {
        return remove((Serializable) studentid);
    }

    /**
     * Removes the student1 with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the student1
     * @return the student1 that was removed
     * @throws net.opentrends.training.NoSuchStudent1Exception if a student1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student1 remove(Serializable primaryKey)
        throws NoSuchStudent1Exception, SystemException {
        Session session = null;

        try {
            session = openSession();

            Student1 student1 = (Student1) session.get(Student1Impl.class,
                    primaryKey);

            if (student1 == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchStudent1Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(student1);
        } catch (NoSuchStudent1Exception nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Student1 removeImpl(Student1 student1) throws SystemException {
        student1 = toUnwrappedModel(student1);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(student1)) {
                student1 = (Student1) session.get(Student1Impl.class,
                        student1.getPrimaryKeyObj());
            }

            if (student1 != null) {
                session.delete(student1);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (student1 != null) {
            clearCache(student1);
        }

        return student1;
    }

    @Override
    public Student1 updateImpl(net.opentrends.training.model.Student1 student1)
        throws SystemException {
        student1 = toUnwrappedModel(student1);

        boolean isNew = student1.isNew();

        Session session = null;

        try {
            session = openSession();

            if (student1.isNew()) {
                session.save(student1);

                student1.setNew(false);
            } else {
                session.merge(student1);
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

        EntityCacheUtil.putResult(Student1ModelImpl.ENTITY_CACHE_ENABLED,
            Student1Impl.class, student1.getPrimaryKey(), student1);

        return student1;
    }

    protected Student1 toUnwrappedModel(Student1 student1) {
        if (student1 instanceof Student1Impl) {
            return student1;
        }

        Student1Impl student1Impl = new Student1Impl();

        student1Impl.setNew(student1.isNew());
        student1Impl.setPrimaryKey(student1.getPrimaryKey());

        student1Impl.setStudentid(student1.getStudentid());
        student1Impl.setFname(student1.getFname());
        student1Impl.setLname(student1.getLname());
        student1Impl.setAge(student1.getAge());
        student1Impl.setBranch(student1.getBranch());
        student1Impl.setEmail(student1.getEmail());

        return student1Impl;
    }

    /**
     * Returns the student1 with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the student1
     * @return the student1
     * @throws net.opentrends.training.NoSuchStudent1Exception if a student1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student1 findByPrimaryKey(Serializable primaryKey)
        throws NoSuchStudent1Exception, SystemException {
        Student1 student1 = fetchByPrimaryKey(primaryKey);

        if (student1 == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchStudent1Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return student1;
    }

    /**
     * Returns the student1 with the primary key or throws a {@link net.opentrends.training.NoSuchStudent1Exception} if it could not be found.
     *
     * @param studentid the primary key of the student1
     * @return the student1
     * @throws net.opentrends.training.NoSuchStudent1Exception if a student1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student1 findByPrimaryKey(long studentid)
        throws NoSuchStudent1Exception, SystemException {
        return findByPrimaryKey((Serializable) studentid);
    }

    /**
     * Returns the student1 with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the student1
     * @return the student1, or <code>null</code> if a student1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student1 fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Student1 student1 = (Student1) EntityCacheUtil.getResult(Student1ModelImpl.ENTITY_CACHE_ENABLED,
                Student1Impl.class, primaryKey);

        if (student1 == _nullStudent1) {
            return null;
        }

        if (student1 == null) {
            Session session = null;

            try {
                session = openSession();

                student1 = (Student1) session.get(Student1Impl.class, primaryKey);

                if (student1 != null) {
                    cacheResult(student1);
                } else {
                    EntityCacheUtil.putResult(Student1ModelImpl.ENTITY_CACHE_ENABLED,
                        Student1Impl.class, primaryKey, _nullStudent1);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Student1ModelImpl.ENTITY_CACHE_ENABLED,
                    Student1Impl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return student1;
    }

    /**
     * Returns the student1 with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param studentid the primary key of the student1
     * @return the student1, or <code>null</code> if a student1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student1 fetchByPrimaryKey(long studentid) throws SystemException {
        return fetchByPrimaryKey((Serializable) studentid);
    }

    /**
     * Returns all the student1s.
     *
     * @return the student1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Student1> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Student1> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Student1> findAll(int start, int end,
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

        List<Student1> list = (List<Student1>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_STUDENT1);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_STUDENT1;

                if (pagination) {
                    sql = sql.concat(Student1ModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Student1>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Student1>(list);
                } else {
                    list = (List<Student1>) QueryUtil.list(q, getDialect(),
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
     * Removes all the student1s from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Student1 student1 : findAll()) {
            remove(student1);
        }
    }

    /**
     * Returns the number of student1s.
     *
     * @return the number of student1s
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

                Query q = session.createQuery(_SQL_COUNT_STUDENT1);

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

    /**
     * Initializes the student1 persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.net.opentrends.training.model.Student1")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Student1>> listenersList = new ArrayList<ModelListener<Student1>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Student1>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Student1Impl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
