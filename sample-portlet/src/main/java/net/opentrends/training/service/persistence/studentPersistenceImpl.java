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

import net.opentrends.training.NoSuchstudentException;
import net.opentrends.training.model.impl.studentImpl;
import net.opentrends.training.model.impl.studentModelImpl;
import net.opentrends.training.model.student;
import net.opentrends.training.service.persistence.studentPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see studentPersistence
 * @see studentUtil
 * @generated
 */
public class studentPersistenceImpl extends BasePersistenceImpl<student>
    implements studentPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link studentUtil} to access the student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = studentImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(studentModelImpl.ENTITY_CACHE_ENABLED,
            studentModelImpl.FINDER_CACHE_ENABLED, studentImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(studentModelImpl.ENTITY_CACHE_ENABLED,
            studentModelImpl.FINDER_CACHE_ENABLED, studentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(studentModelImpl.ENTITY_CACHE_ENABLED,
            studentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_STUDENT = "SELECT student FROM student student";
    private static final String _SQL_COUNT_STUDENT = "SELECT COUNT(student) FROM student student";
    private static final String _ORDER_BY_ENTITY_ALIAS = "student.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No student exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(studentPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static student _nullstudent = new studentImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<student> toCacheModel() {
                return _nullstudentCacheModel;
            }
        };

    private static CacheModel<student> _nullstudentCacheModel = new CacheModel<student>() {
            @Override
            public student toEntityModel() {
                return _nullstudent;
            }
        };

    public studentPersistenceImpl() {
        setModelClass(student.class);
    }

    /**
     * Caches the student in the entity cache if it is enabled.
     *
     * @param student the student
     */
    @Override
    public void cacheResult(student student) {
        EntityCacheUtil.putResult(studentModelImpl.ENTITY_CACHE_ENABLED,
            studentImpl.class, student.getPrimaryKey(), student);

        student.resetOriginalValues();
    }

    /**
     * Caches the students in the entity cache if it is enabled.
     *
     * @param students the students
     */
    @Override
    public void cacheResult(List<student> students) {
        for (student student : students) {
            if (EntityCacheUtil.getResult(
                        studentModelImpl.ENTITY_CACHE_ENABLED,
                        studentImpl.class, student.getPrimaryKey()) == null) {
                cacheResult(student);
            } else {
                student.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all students.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(studentImpl.class.getName());
        }

        EntityCacheUtil.clearCache(studentImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the student.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(student student) {
        EntityCacheUtil.removeResult(studentModelImpl.ENTITY_CACHE_ENABLED,
            studentImpl.class, student.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<student> students) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (student student : students) {
            EntityCacheUtil.removeResult(studentModelImpl.ENTITY_CACHE_ENABLED,
                studentImpl.class, student.getPrimaryKey());
        }
    }

    /**
     * Creates a new student with the primary key. Does not add the student to the database.
     *
     * @param id the primary key for the new student
     * @return the new student
     */
    @Override
    public student create(long id) {
        student student = new studentImpl();

        student.setNew(true);
        student.setPrimaryKey(id);

        return student;
    }

    /**
     * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the student
     * @return the student that was removed
     * @throws net.opentrends.training.NoSuchstudentException if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public student remove(long id)
        throws NoSuchstudentException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the student
     * @return the student that was removed
     * @throws net.opentrends.training.NoSuchstudentException if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public student remove(Serializable primaryKey)
        throws NoSuchstudentException, SystemException {
        Session session = null;

        try {
            session = openSession();

            student student = (student) session.get(studentImpl.class,
                    primaryKey);

            if (student == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchstudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(student);
        } catch (NoSuchstudentException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected student removeImpl(student student) throws SystemException {
        student = toUnwrappedModel(student);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(student)) {
                student = (student) session.get(studentImpl.class,
                        student.getPrimaryKeyObj());
            }

            if (student != null) {
                session.delete(student);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (student != null) {
            clearCache(student);
        }

        return student;
    }

    @Override
    public student updateImpl(net.opentrends.training.model.student student)
        throws SystemException {
        student = toUnwrappedModel(student);

        boolean isNew = student.isNew();

        Session session = null;

        try {
            session = openSession();

            if (student.isNew()) {
                session.save(student);

                student.setNew(false);
            } else {
                session.merge(student);
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

        EntityCacheUtil.putResult(studentModelImpl.ENTITY_CACHE_ENABLED,
            studentImpl.class, student.getPrimaryKey(), student);

        return student;
    }

    protected student toUnwrappedModel(student student) {
        if (student instanceof studentImpl) {
            return student;
        }

        studentImpl studentImpl = new studentImpl();

        studentImpl.setNew(student.isNew());
        studentImpl.setPrimaryKey(student.getPrimaryKey());

        studentImpl.setId(student.getId());
        studentImpl.setName(student.getName());
        studentImpl.setDept_id(student.getDept_id());
        studentImpl.setRollNo(student.getRollNo());
        studentImpl.setUserId(student.getUserId());
        studentImpl.setGroupId(student.getGroupId());

        return studentImpl;
    }

    /**
     * Returns the student with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the student
     * @return the student
     * @throws net.opentrends.training.NoSuchstudentException if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public student findByPrimaryKey(Serializable primaryKey)
        throws NoSuchstudentException, SystemException {
        student student = fetchByPrimaryKey(primaryKey);

        if (student == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchstudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return student;
    }

    /**
     * Returns the student with the primary key or throws a {@link net.opentrends.training.NoSuchstudentException} if it could not be found.
     *
     * @param id the primary key of the student
     * @return the student
     * @throws net.opentrends.training.NoSuchstudentException if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public student findByPrimaryKey(long id)
        throws NoSuchstudentException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the student with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the student
     * @return the student, or <code>null</code> if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public student fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        student student = (student) EntityCacheUtil.getResult(studentModelImpl.ENTITY_CACHE_ENABLED,
                studentImpl.class, primaryKey);

        if (student == _nullstudent) {
            return null;
        }

        if (student == null) {
            Session session = null;

            try {
                session = openSession();

                student = (student) session.get(studentImpl.class, primaryKey);

                if (student != null) {
                    cacheResult(student);
                } else {
                    EntityCacheUtil.putResult(studentModelImpl.ENTITY_CACHE_ENABLED,
                        studentImpl.class, primaryKey, _nullstudent);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(studentModelImpl.ENTITY_CACHE_ENABLED,
                    studentImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return student;
    }

    /**
     * Returns the student with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the student
     * @return the student, or <code>null</code> if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public student fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the students.
     *
     * @return the students
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<student> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the students.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.studentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of students
     * @param end the upper bound of the range of students (not inclusive)
     * @return the range of students
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<student> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the students.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.studentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of students
     * @param end the upper bound of the range of students (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of students
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<student> findAll(int start, int end,
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

        List<student> list = (List<student>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_STUDENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_STUDENT;

                if (pagination) {
                    sql = sql.concat(studentModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<student>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<student>(list);
                } else {
                    list = (List<student>) QueryUtil.list(q, getDialect(),
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
     * Removes all the students from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (student student : findAll()) {
            remove(student);
        }
    }

    /**
     * Returns the number of students.
     *
     * @return the number of students
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

                Query q = session.createQuery(_SQL_COUNT_STUDENT);

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
     * Initializes the student persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.net.opentrends.training.model.student")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<student>> listenersList = new ArrayList<ModelListener<student>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<student>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(studentImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
