package net.opentrends.training.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Manager}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Manager
 * @generated
 */
public class ManagerWrapper implements Manager, ModelWrapper<Manager> {
    private Manager _manager;

    public ManagerWrapper(Manager manager) {
        _manager = manager;
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

    /**
    * Returns the primary key of this manager.
    *
    * @return the primary key of this manager
    */
    @Override
    public long getPrimaryKey() {
        return _manager.getPrimaryKey();
    }

    /**
    * Sets the primary key of this manager.
    *
    * @param primaryKey the primary key of this manager
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _manager.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the manageentry i d of this manager.
    *
    * @return the manageentry i d of this manager
    */
    @Override
    public long getManageentryID() {
        return _manager.getManageentryID();
    }

    /**
    * Sets the manageentry i d of this manager.
    *
    * @param manageentryID the manageentry i d of this manager
    */
    @Override
    public void setManageentryID(long manageentryID) {
        _manager.setManageentryID(manageentryID);
    }

    /**
    * Returns the group ID of this manager.
    *
    * @return the group ID of this manager
    */
    @Override
    public long getGroupId() {
        return _manager.getGroupId();
    }

    /**
    * Sets the group ID of this manager.
    *
    * @param groupId the group ID of this manager
    */
    @Override
    public void setGroupId(long groupId) {
        _manager.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this manager.
    *
    * @return the company ID of this manager
    */
    @Override
    public long getCompanyId() {
        return _manager.getCompanyId();
    }

    /**
    * Sets the company ID of this manager.
    *
    * @param companyId the company ID of this manager
    */
    @Override
    public void setCompanyId(long companyId) {
        _manager.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this manager.
    *
    * @return the user ID of this manager
    */
    @Override
    public long getUserId() {
        return _manager.getUserId();
    }

    /**
    * Sets the user ID of this manager.
    *
    * @param userId the user ID of this manager
    */
    @Override
    public void setUserId(long userId) {
        _manager.setUserId(userId);
    }

    /**
    * Returns the user uuid of this manager.
    *
    * @return the user uuid of this manager
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _manager.getUserUuid();
    }

    /**
    * Sets the user uuid of this manager.
    *
    * @param userUuid the user uuid of this manager
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _manager.setUserUuid(userUuid);
    }

    /**
    * Returns the last modified date of this manager.
    *
    * @return the last modified date of this manager
    */
    @Override
    public java.util.Date getLastModifiedDate() {
        return _manager.getLastModifiedDate();
    }

    /**
    * Sets the last modified date of this manager.
    *
    * @param lastModifiedDate the last modified date of this manager
    */
    @Override
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        _manager.setLastModifiedDate(lastModifiedDate);
    }

    /**
    * Returns the manager i d of this manager.
    *
    * @return the manager i d of this manager
    */
    @Override
    public java.lang.String getManagerID() {
        return _manager.getManagerID();
    }

    /**
    * Sets the manager i d of this manager.
    *
    * @param managerID the manager i d of this manager
    */
    @Override
    public void setManagerID(java.lang.String managerID) {
        _manager.setManagerID(managerID);
    }

    /**
    * Returns the manager name of this manager.
    *
    * @return the manager name of this manager
    */
    @Override
    public java.lang.String getManagerName() {
        return _manager.getManagerName();
    }

    /**
    * Sets the manager name of this manager.
    *
    * @param managerName the manager name of this manager
    */
    @Override
    public void setManagerName(java.lang.String managerName) {
        _manager.setManagerName(managerName);
    }

    @Override
    public boolean isNew() {
        return _manager.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _manager.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _manager.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _manager.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _manager.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _manager.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _manager.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _manager.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _manager.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _manager.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _manager.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ManagerWrapper((Manager) _manager.clone());
    }

    @Override
    public int compareTo(net.opentrends.training.model.Manager manager) {
        return _manager.compareTo(manager);
    }

    @Override
    public int hashCode() {
        return _manager.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.training.model.Manager> toCacheModel() {
        return _manager.toCacheModel();
    }

    @Override
    public net.opentrends.training.model.Manager toEscapedModel() {
        return new ManagerWrapper(_manager.toEscapedModel());
    }

    @Override
    public net.opentrends.training.model.Manager toUnescapedModel() {
        return new ManagerWrapper(_manager.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _manager.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _manager.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _manager.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ManagerWrapper)) {
            return false;
        }

        ManagerWrapper managerWrapper = (ManagerWrapper) obj;

        if (Validator.equals(_manager, managerWrapper._manager)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Manager getWrappedManager() {
        return _manager;
    }

    @Override
    public Manager getWrappedModel() {
        return _manager;
    }

    @Override
    public void resetOriginalValues() {
        _manager.resetOriginalValues();
    }
}
