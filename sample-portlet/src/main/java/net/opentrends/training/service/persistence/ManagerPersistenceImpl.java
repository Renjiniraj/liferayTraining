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

import net.opentrends.training.NoSuchManagerException;
import net.opentrends.training.model.Manager;
import net.opentrends.training.model.impl.ManagerImpl;
import net.opentrends.training.model.impl.ManagerModelImpl;
import net.opentrends.training.service.persistence.ManagerPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the manager service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManagerPersistence
 * @see ManagerUtil
 * @generated
 */
public class ManagerPersistenceImpl extends BasePersistenceImpl<Manager>
    implements ManagerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ManagerUtil} to access the manager persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ManagerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ManagerModelImpl.ENTITY_CACHE_ENABLED,
            ManagerModelImpl.FINDER_CACHE_ENABLED, ManagerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ManagerModelImpl.ENTITY_CACHE_ENABLED,
            ManagerModelImpl.FINDER_CACHE_ENABLED, ManagerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ManagerModelImpl.ENTITY_CACHE_ENABLED,
            ManagerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_MANAGER = "SELECT manager FROM Manager manager";
    private static final String _SQL_COUNT_MANAGER = "SELECT COUNT(manager) FROM Manager manager";
    private static final String _ORDER_BY_ENTITY_ALIAS = "manager.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Manager exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ManagerPersistenceImpl.class);
    private static Manager _nullManager = new ManagerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Manager> toCacheModel() {
                return _nullManagerCacheModel;
            }
        };

    private static CacheModel<Manager> _nullManagerCacheModel = new CacheModel<Manager>() {
            @Override
            public Manager toEntityModel() {
                return _nullManager;
            }
        };

    public ManagerPersistenceImpl() {
        setModelClass(Manager.class);
    }

    /**
     * Caches the manager in the entity cache if it is enabled.
     *
     * @param manager the manager
     */
    @Override
    public void cacheResult(Manager manager) {
        EntityCacheUtil.putResult(ManagerModelImpl.ENTITY_CACHE_ENABLED,
            ManagerImpl.class, manager.getPrimaryKey(), manager);

        manager.resetOriginalValues();
    }

    /**
     * Caches the managers in the entity cache if it is enabled.
     *
     * @param managers the managers
     */
    @Override
    public void cacheResult(List<Manager> managers) {
        for (Manager manager : managers) {
            if (EntityCacheUtil.getResult(
                        ManagerModelImpl.ENTITY_CACHE_ENABLED,
                        ManagerImpl.class, manager.getPrimaryKey()) == null) {
                cacheResult(manager);
            } else {
                manager.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all managers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ManagerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ManagerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the manager.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Manager manager) {
        EntityCacheUtil.removeResult(ManagerModelImpl.ENTITY_CACHE_ENABLED,
            ManagerImpl.class, manager.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Manager> managers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Manager manager : managers) {
            EntityCacheUtil.removeResult(ManagerModelImpl.ENTITY_CACHE_ENABLED,
                ManagerImpl.class, manager.getPrimaryKey());
        }
    }

    /**
     * Creates a new manager with the primary key. Does not add the manager to the database.
     *
     * @param manageentryID the primary key for the new manager
     * @return the new manager
     */
    @Override
    public Manager create(long manageentryID) {
        Manager manager = new ManagerImpl();

        manager.setNew(true);
        manager.setPrimaryKey(manageentryID);

        return manager;
    }

    /**
     * Removes the manager with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param manageentryID the primary key of the manager
     * @return the manager that was removed
     * @throws net.opentrends.training.NoSuchManagerException if a manager with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Manager remove(long manageentryID)
        throws NoSuchManagerException, SystemException {
        return remove((Serializable) manageentryID);
    }

    /**
     * Removes the manager with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the manager
     * @return the manager that was removed
     * @throws net.opentrends.training.NoSuchManagerException if a manager with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Manager remove(Serializable primaryKey)
        throws NoSuchManagerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Manager manager = (Manager) session.get(ManagerImpl.class,
                    primaryKey);

            if (manager == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchManagerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(manager);
        } catch (NoSuchManagerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Manager removeImpl(Manager manager) throws SystemException {
        manager = toUnwrappedModel(manager);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(manager)) {
                manager = (Manager) session.get(ManagerImpl.class,
                        manager.getPrimaryKeyObj());
            }

            if (manager != null) {
                session.delete(manager);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (manager != null) {
            clearCache(manager);
        }

        return manager;
    }

    @Override
    public Manager updateImpl(net.opentrends.training.model.Manager manager)
        throws SystemException {
        manager = toUnwrappedModel(manager);

        boolean isNew = manager.isNew();

        Session session = null;

        try {
            session = openSession();

            if (manager.isNew()) {
                session.save(manager);

                manager.setNew(false);
            } else {
                session.merge(manager);
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

        EntityCacheUtil.putResult(ManagerModelImpl.ENTITY_CACHE_ENABLED,
            ManagerImpl.class, manager.getPrimaryKey(), manager);

        return manager;
    }

    protected Manager toUnwrappedModel(Manager manager) {
        if (manager instanceof ManagerImpl) {
            return manager;
        }

        ManagerImpl managerImpl = new ManagerImpl();

        managerImpl.setNew(manager.isNew());
        managerImpl.setPrimaryKey(manager.getPrimaryKey());

        managerImpl.setManageentryID(manager.getManageentryID());
        managerImpl.setGroupId(manager.getGroupId());
        managerImpl.setCompanyId(manager.getCompanyId());
        managerImpl.setUserId(manager.getUserId());
        managerImpl.setLastModifiedDate(manager.getLastModifiedDate());
        managerImpl.setManagerID(manager.getManagerID());
        managerImpl.setManagerName(manager.getManagerName());

        return managerImpl;
    }

    /**
     * Returns the manager with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the manager
     * @return the manager
     * @throws net.opentrends.training.NoSuchManagerException if a manager with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Manager findByPrimaryKey(Serializable primaryKey)
        throws NoSuchManagerException, SystemException {
        Manager manager = fetchByPrimaryKey(primaryKey);

        if (manager == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchManagerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return manager;
    }

    /**
     * Returns the manager with the primary key or throws a {@link net.opentrends.training.NoSuchManagerException} if it could not be found.
     *
     * @param manageentryID the primary key of the manager
     * @return the manager
     * @throws net.opentrends.training.NoSuchManagerException if a manager with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Manager findByPrimaryKey(long manageentryID)
        throws NoSuchManagerException, SystemException {
        return findByPrimaryKey((Serializable) manageentryID);
    }

    /**
     * Returns the manager with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the manager
     * @return the manager, or <code>null</code> if a manager with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Manager fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Manager manager = (Manager) EntityCacheUtil.getResult(ManagerModelImpl.ENTITY_CACHE_ENABLED,
                ManagerImpl.class, primaryKey);

        if (manager == _nullManager) {
            return null;
        }

        if (manager == null) {
            Session session = null;

            try {
                session = openSession();

                manager = (Manager) session.get(ManagerImpl.class, primaryKey);

                if (manager != null) {
                    cacheResult(manager);
                } else {
                    EntityCacheUtil.putResult(ManagerModelImpl.ENTITY_CACHE_ENABLED,
                        ManagerImpl.class, primaryKey, _nullManager);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(ManagerModelImpl.ENTITY_CACHE_ENABLED,
                    ManagerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return manager;
    }

    /**
     * Returns the manager with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param manageentryID the primary key of the manager
     * @return the manager, or <code>null</code> if a manager with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Manager fetchByPrimaryKey(long manageentryID)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) manageentryID);
    }

    /**
     * Returns all the managers.
     *
     * @return the managers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Manager> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the managers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of managers
     * @param end the upper bound of the range of managers (not inclusive)
     * @return the range of managers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Manager> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the managers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.model.impl.ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of managers
     * @param end the upper bound of the range of managers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of managers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Manager> findAll(int start, int end,
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

        List<Manager> list = (List<Manager>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MANAGER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MANAGER;

                if (pagination) {
                    sql = sql.concat(ManagerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Manager>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Manager>(list);
                } else {
                    list = (List<Manager>) QueryUtil.list(q, getDialect(),
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
     * Removes all the managers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Manager manager : findAll()) {
            remove(manager);
        }
    }

    /**
     * Returns the number of managers.
     *
     * @return the number of managers
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

                Query q = session.createQuery(_SQL_COUNT_MANAGER);

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
     * Initializes the manager persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.net.opentrends.training.model.Manager")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Manager>> listenersList = new ArrayList<ModelListener<Manager>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Manager>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ManagerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
