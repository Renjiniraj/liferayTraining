package net.opentrends.training.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import net.opentrends.training.service.ClpSerializer;
import net.opentrends.training.service.marksLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class marksClp extends BaseModelImpl<marks> implements marks {
    private long _id;
    private int _rollNo;
    private int _percentage;
    private long _userId;
    private String _userUuid;
    private long _groupId;
    private BaseModel<?> _marksRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.training.service.ClpSerializer.class;

    public marksClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return marks.class;
    }

    @Override
    public String getModelClassName() {
        return marks.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("rollNo", getRollNo());
        attributes.put("percentage", getPercentage());
        attributes.put("userId", getUserId());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Integer rollNo = (Integer) attributes.get("rollNo");

        if (rollNo != null) {
            setRollNo(rollNo);
        }

        Integer percentage = (Integer) attributes.get("percentage");

        if (percentage != null) {
            setPercentage(percentage);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_marksRemoteModel != null) {
            try {
                Class<?> clazz = _marksRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_marksRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRollNo() {
        return _rollNo;
    }

    @Override
    public void setRollNo(int rollNo) {
        _rollNo = rollNo;

        if (_marksRemoteModel != null) {
            try {
                Class<?> clazz = _marksRemoteModel.getClass();

                Method method = clazz.getMethod("setRollNo", int.class);

                method.invoke(_marksRemoteModel, rollNo);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPercentage() {
        return _percentage;
    }

    @Override
    public void setPercentage(int percentage) {
        _percentage = percentage;

        if (_marksRemoteModel != null) {
            try {
                Class<?> clazz = _marksRemoteModel.getClass();

                Method method = clazz.getMethod("setPercentage", int.class);

                method.invoke(_marksRemoteModel, percentage);
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

        if (_marksRemoteModel != null) {
            try {
                Class<?> clazz = _marksRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_marksRemoteModel, userId);
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
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_marksRemoteModel != null) {
            try {
                Class<?> clazz = _marksRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_marksRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getmarksRemoteModel() {
        return _marksRemoteModel;
    }

    public void setmarksRemoteModel(BaseModel<?> marksRemoteModel) {
        _marksRemoteModel = marksRemoteModel;
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

        Class<?> remoteModelClass = _marksRemoteModel.getClass();

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

        Object returnValue = method.invoke(_marksRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            marksLocalServiceUtil.addmarks(this);
        } else {
            marksLocalServiceUtil.updatemarks(this);
        }
    }

    @Override
    public marks toEscapedModel() {
        return (marks) ProxyUtil.newProxyInstance(marks.class.getClassLoader(),
            new Class[] { marks.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        marksClp clone = new marksClp();

        clone.setId(getId());
        clone.setRollNo(getRollNo());
        clone.setPercentage(getPercentage());
        clone.setUserId(getUserId());
        clone.setGroupId(getGroupId());

        return clone;
    }

    @Override
    public int compareTo(marks marks) {
        long primaryKey = marks.getPrimaryKey();

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

        if (!(obj instanceof marksClp)) {
            return false;
        }

        marksClp marks = (marksClp) obj;

        long primaryKey = marks.getPrimaryKey();

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
        StringBundler sb = new StringBundler(11);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", rollNo=");
        sb.append(getRollNo());
        sb.append(", percentage=");
        sb.append(getPercentage());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.training.model.marks");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rollNo</column-name><column-value><![CDATA[");
        sb.append(getRollNo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>percentage</column-name><column-value><![CDATA[");
        sb.append(getPercentage());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
