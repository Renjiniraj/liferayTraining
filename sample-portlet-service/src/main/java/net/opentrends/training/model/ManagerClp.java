package net.opentrends.training.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import net.opentrends.training.service.ClpSerializer;
import net.opentrends.training.service.ManagerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ManagerClp extends BaseModelImpl<Manager> implements Manager {
    private long _manageentryID;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _lastModifiedDate;
    private String _managerID;
    private String _managerName;
    private BaseModel<?> _managerRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.training.service.ClpSerializer.class;

    public ManagerClp() {
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

        if (_managerRemoteModel != null) {
            try {
                Class<?> clazz = _managerRemoteModel.getClass();

                Method method = clazz.getMethod("setManageentryID", long.class);

                method.invoke(_managerRemoteModel, manageentryID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_managerRemoteModel != null) {
            try {
                Class<?> clazz = _managerRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_managerRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_managerRemoteModel != null) {
            try {
                Class<?> clazz = _managerRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_managerRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_managerRemoteModel != null) {
            try {
                Class<?> clazz = _managerRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_managerRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
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

        if (_managerRemoteModel != null) {
            try {
                Class<?> clazz = _managerRemoteModel.getClass();

                Method method = clazz.getMethod("setLastModifiedDate",
                        Date.class);

                method.invoke(_managerRemoteModel, lastModifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getManagerID() {
        return _managerID;
    }

    @Override
    public void setManagerID(String managerID) {
        _managerID = managerID;

        if (_managerRemoteModel != null) {
            try {
                Class<?> clazz = _managerRemoteModel.getClass();

                Method method = clazz.getMethod("setManagerID", String.class);

                method.invoke(_managerRemoteModel, managerID);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getManagerName() {
        return _managerName;
    }

    @Override
    public void setManagerName(String managerName) {
        _managerName = managerName;

        if (_managerRemoteModel != null) {
            try {
                Class<?> clazz = _managerRemoteModel.getClass();

                Method method = clazz.getMethod("setManagerName", String.class);

                method.invoke(_managerRemoteModel, managerName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getManagerRemoteModel() {
        return _managerRemoteModel;
    }

    public void setManagerRemoteModel(BaseModel<?> managerRemoteModel) {
        _managerRemoteModel = managerRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _managerRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_managerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ManagerLocalServiceUtil.addManager(this);
        } else {
            ManagerLocalServiceUtil.updateManager(this);
        }
    }

    @Override
    public Manager toEscapedModel() {
        return (Manager) ProxyUtil.newProxyInstance(Manager.class.getClassLoader(),
            new Class[] { Manager.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ManagerClp clone = new ManagerClp();

        clone.setManageentryID(getManageentryID());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setLastModifiedDate(getLastModifiedDate());
        clone.setManagerID(getManagerID());
        clone.setManagerName(getManagerName());

        return clone;
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

        if (!(obj instanceof ManagerClp)) {
            return false;
        }

        ManagerClp manager = (ManagerClp) obj;

        long primaryKey = manager.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
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
