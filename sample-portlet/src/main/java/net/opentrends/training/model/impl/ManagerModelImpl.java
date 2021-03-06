package net.opentrends.training.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import net.opentrends.training.model.Manager;
import net.opentrends.training.model.ManagerModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Manager service. Represents a row in the &quot;sample_Manager&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link net.opentrends.training.model.ManagerModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ManagerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManagerImpl
 * @see net.opentrends.training.model.Manager
 * @see net.opentrends.training.model.ManagerModel
 * @generated
 */
public class ManagerModelImpl extends BaseModelImpl<Manager>
    implements ManagerModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a manager model instance should use the {@link net.opentrends.training.model.Manager} interface instead.
     */
    public static final String TABLE_NAME = "sample_Manager";
    public static final Object[][] TABLE_COLUMNS = {
            { "manageentryID", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "lastModifiedDate", Types.TIMESTAMP },
            { "managerID", Types.VARCHAR },
            { "managerName", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table sample_Manager (manageentryID LONG not null primary key,groupId LONG,companyId LONG,userId LONG,lastModifiedDate DATE null,managerID VARCHAR(75) null,managerName VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table sample_Manager";
    public static final String ORDER_BY_JPQL = " ORDER BY manager.manageentryID ASC";
    public static final String ORDER_BY_SQL = " ORDER BY sample_Manager.manageentryID ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.net.opentrends.training.model.Manager"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.net.opentrends.training.model.Manager"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.net.opentrends.training.model.Manager"));
    private static ClassLoader _classLoader = Manager.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Manager.class
        };
    private long _manageentryID;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _lastModifiedDate;
    private String _managerID;
    private String _managerName;
    private Manager _escapedModel;

    public ManagerModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _manageentryID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setManageentryID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _manageentryID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Manager.class;
    }

    @Override
    public String getModelClassName() {
        return Manager.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("manageentryID", getManageentryID());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("lastModifiedDate", getLastModifiedDate());
        attributes.put("managerID", getManagerID());
        attributes.put("managerName", getManagerName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long manageentryID = (Long) attributes.get("manageentryID");

        if (manageentryID != null) {
            setManageentryID(manageentryID);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Date lastModifiedDate = (Date) attributes.get("lastModifiedDate");

        if (lastModifiedDate != null) {
            setLastModifiedDate(lastModifiedDate);
        }

        String managerID = (String) attributes.get("managerID");

        if (managerID != null) {
            setManagerID(managerID);
        }

        String managerName = (String) attributes.get("managerName");

        if (managerName != null) {
            setManagerName(managerName);
        }
    }

    @Override
    public long getManageentryID() {
        return _manageentryID;
    }

    @Override
    public void setManageentryID(long manageentryID) {
        _manageentryID = manageentryID;
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public Date getLastModifiedDate() {
        return _lastModifiedDate;
    }

    @Override
    public void setLastModifiedDate(Date lastModifiedDate) {
        _lastModifiedDate = lastModifiedDate;
    }

    @Override
    public String getManagerID() {
        if (_managerID == null) {
            return StringPool.BLANK;
        } else {
            return _managerID;
        }
    }

    @Override
    public void setManagerID(String managerID) {
        _managerID = managerID;
    }

    @Override
    public String getManagerName() {
        if (_managerName == null) {
            return StringPool.BLANK;
        } else {
            return _managerName;
        }
    }

    @Override
    public void setManagerName(String managerName) {
        _managerName = managerName;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            Manager.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Manager toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Manager) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        ManagerImpl managerImpl = new ManagerImpl();

        managerImpl.setManageentryID(getManageentryID());
        managerImpl.setGroupId(getGroupId());
        managerImpl.setCompanyId(getCompanyId());
        managerImpl.setUserId(getUserId());
        managerImpl.setLastModifiedDate(getLastModifiedDate());
        managerImpl.setManagerID(getManagerID());
        managerImpl.setManagerName(getManagerName());

        managerImpl.resetOriginalValues();

        return managerImpl;
    }

    @Override
    public int compareTo(Manager manager) {
        long primaryKey = manager.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Manager)) {
            return false;
        }

        Manager manager = (Manager) obj;

        long primaryKey = manager.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Manager> toCacheModel() {
        ManagerCacheModel managerCacheModel = new ManagerCacheModel();

        managerCacheModel.manageentryID = getManageentryID();

        managerCacheModel.groupId = getGroupId();

        managerCacheModel.companyId = getCompanyId();

        managerCacheModel.userId = getUserId();

        Date lastModifiedDate = getLastModifiedDate();

        if (lastModifiedDate != null) {
            managerCacheModel.lastModifiedDate = lastModifiedDate.getTime();
        } else {
            managerCacheModel.lastModifiedDate = Long.MIN_VALUE;
        }

        managerCacheModel.managerID = getManagerID();

        String managerID = managerCacheModel.managerID;

        if ((managerID != null) && (managerID.length() == 0)) {
            managerCacheModel.managerID = null;
        }

        managerCacheModel.managerName = getManagerName();

        String managerName = managerCacheModel.managerName;

        if ((managerName != null) && (managerName.length() == 0)) {
            managerCacheModel.managerName = null;
        }

        return managerCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{manageentryID=");
        sb.append(getManageentryID());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", lastModifiedDate=");
        sb.append(getLastModifiedDate());
        sb.append(", managerID=");
        sb.append(getManagerID());
        sb.append(", managerName=");
        sb.append(getManagerName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.training.model.Manager");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>manageentryID</column-name><column-value><![CDATA[");
        sb.append(getManageentryID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastModifiedDate</column-name><column-value><![CDATA[");
        sb.append(getLastModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>managerID</column-name><column-value><![CDATA[");
        sb.append(getManagerID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>managerName</column-name><column-value><![CDATA[");
        sb.append(getManagerName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
