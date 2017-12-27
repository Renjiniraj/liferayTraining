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

import net.opentrends.training.NoSuchmarksException;
import net.opentrends.training.model.impl.marksImpl;
import net.opentrends.training.model.impl.marksModelImpl;
import net.opentrends.training.model.marks;
import net.opentrends.training.service.persistence.marksPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the marks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see marksPersistence
 * @see marksUtil
 * @generated
 */
public class marksPersistenceImpl extends BasePersistenceImpl<marks>
    implements marksPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link marksUtil} to access the marks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = marksImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(marksModelImpl.ENTITY_CACHE_ENABLED,
            marksModelImpl.FINDER_CACHE_ENABLED, marksImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(marksModelImpl.ENTITY_CACHE_ENABLED,
            marksModelImpl.FINDER_CACHE_ENABLED, marksImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(marksModelImpl.ENTITY_CACHE_ENABLED,
            marksModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_MARKS = "SELECT marks FROM marks marks";
    private static final String _SQL_COUNT_MARKS = "SELECT COUNT(marks) FROM marks marks";
    private static final String _ORDER_BY_ENTITY_ALIAS = "marks.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No marks exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(marksPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static marks _nullmarks = new marksImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<marks> toCacheModel() {
                return _nullmarksCacheModel;
            }
        };

    private static CacheModel<marks> _nullmarksCacheModel = new CacheModel<marks>() {
            @Override
            public marks toEntityModel() {
                return _nullmarks;
            }
        };

    public marksPersistenceImpl() {
        setModelClass(marks.class);
    }

    /**
     * Caches the marks in the entity cache if it is enabled.
     *
     * @param marks the marks
     */
    @Override
    public void cacheResult(marks marks) {
        EntityCacheUtil.putResult(marksModelImpl.ENTITY_CACHE_ENABLED,
            marksImpl.class, marks.getPrimaryKey(), marks);

        marks.resetOriginalValues();
    }

    /**
     * Caches the markses in the entity cache if it is enabled.
     *
     * @param markses the markses
     */
    @Override
    public void cacheResult(List<marks> markses) {
        for (marks marks : markses) {
            if (EntityCacheUtil.getResult(marksModelImpl.ENTITY_CACHE_ENABLED,
                        marksImpl.class, marks.getPrimaryKey()) == null) {
                cacheResult(marks);
            } else {
                marks.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all markses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(marksImpl.class.getName());
        }

        EntityCacheUtil.clearCache(marksImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the marks.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(marks marks) {
        EntityCacheUtil.removeResult(marksModelImpl.ENTITY_CACHE_ENABLED,
            marksImpl.class, marks.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<marks> markses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (marks marks : markses) {
            EntityCacheUtil.removeResult(marksModelImpl.ENTITY_CACHE_ENABLED,
                marksImpl.class, marks.getPrimaryKey());
        }
    }

    /**
     * Creates a new marks with the primary key. Does not add the marks to the database.
     *
     * @param id the primary key for the new marks
     * @return the new marks
     */
    @Override
    public marks create(long id) {
        marks marks = new marksImpl();

        marks.setNew(true);
        marks.setPrimaryKey(id);

        return marks;
    }

    /**
     * Removes the marks with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the marks
     * @return the marks that was removed
     * @throws net.opentrends.training.NoSuchmarksException if a marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public marks remove(long id) throws NoSuchmarksException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the marks with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the marks
     * @return the marks that was removed
     * @throws net.opentrends.training.NoSuchmarksException if a marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public marks remove(Serializable primaryKey)
        throws NoSuchmarksException, SystemException {
        Session session = null;

        try {
            session = openSession();

            marks marks = (marks) session.get(marksImpl.class, primaryKey);

            if (marks == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchmarksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(marks);
        } catch (NoSuchmarksException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected marks removeImpl(marks marks) throws SystemException {
        marks = toUnwrappedModel(marks);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(marks)) {
                marks = (marks) session.get(marksImpl.class,
                        marks.getPrimaryKeyObj());
            }

            if (marks != null) {
                session.delete(marks);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (marks != null) {
            clearCache(marks);
        }

        return marks;
    }

    @Override
    public marks updateImpl(net.opentrends.training.model.marks marks)
        throws SystemException {
        marks = toUnwrappedModel(marks);

        boolean isNew = marks.isNew();

        Session session = null;

        try {
            session = openSession();

            if (marks.isNew()) {
                session.save(marks);

                marks.setNew(false);
            } else {
                session.merge(marks);
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

        EntityCacheUtil.putResult(marksModelImpl.ENTITY_CACHE_ENABLED,
            marksImpl.class, marks.getPrimaryKey(), marks);

        return marks;
    }

    protected marks toUnwrappedModel(marks marks) {
        if (marks instanceof marksImpl) {
            return marks;
        }

        marksImpl marksImpl = new marksImpl();

        marksImpl.setNew(marks.isNew());
        marksImpl.setPrimaryKey(marks.getPrimaryKey());

        marksImpl.setId(marks.getId());
        marksImpl.setRollNo(marks.getRollNo());
        marksImpl.setPercentage(marks.getPercentage());
        marksImpl.setUserId(marks.getUserId());
        marksImpl.setGroupId(marks.getGroupId());

        return marksImpl;
    }

    /**
     * Returns the marks with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the marks
     * @return the marks
     * @throws net.opentrends.training.NoSuchmarksException if a marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public marks findByPrimaryKey(Serializable primaryKey)
        throws NoSuchmarksException, SystemException {
        marks marks = fetchByPrimaryKey(primaryKey);

        if (marks == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchmarksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return marks;
    }

    /**
     * Returns the marks with the primary key or throws a {@link net.opentrends.training.NoSuchmarksException} if it could not be found.
     *
     * @param id the primary key of the marks
     * @return the marks
     * @throws net.opentrends.training.NoSuchmarksException if a marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public marks findByPrimaryKey(long id)
        throws NoSuchmarksException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the marks with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the marks
     * @return the marks, or <code>null</code> if a marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public marks fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        marks marks = (marks) EntityCacheUtil.getResult(marksModelImpl.ENTITY_CACHE_ENABLED,
                marksImpl.class, primaryKey);

        if (marks == _nullmarks) {
            return null;
        }

        if (marks == null) {
            Session session = null;

            try {
                session = openSession();

                marks = (marks) session.get(marksImpl.class, primaryKey);

                if (marks != null) {
                    cacheResult(marks);
                } else {
                    EntityCacheUtil.putResult(marksModelImpl.ENTITY_CACHE_ENABLED,
                        marksImpl.class, primaryKey, _nullmarks);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(marksModelImpl.ENTITY_CACHE_ENABLED,
                    marksImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return marks;
    }

    /**
     * Returns the marks with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the marks
     * @return the marks, or <code>null</code> if a marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public marks fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the markses.
     *
     * @return the markses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<marks> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<marks> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<marks> findAll(int start, int end,
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

        List<marks> list = (List<marks>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MARKS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MARKS;

                if (pagination) {
                    sql = sql.concat(marksModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<marks>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<marks>(list);
                } else {
                    list = (List<marks>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the markses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (marks marks : findAll()) {
            remove(marks);
        }
    }

    /**
     * Returns the number of markses.
     *
     * @return the number of markses
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

                Query q = session.createQuery(_SQL_COUNT_MARKS);

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
     * Initializes the marks persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.net.opentrends.training.model.marks")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<marks>> listenersList = new ArrayList<ModelListener<marks>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<marks>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(marksImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
