package net.opentrends.training.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import net.opentrends.training.service.ClpSerializer;
import net.opentrends.training.service.studentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class studentClp extends BaseModelImpl<student> implements student {
    private long _id;
    private String _name;
    private long _dept_id;
    private int _rollNo;
    private long _userId;
    private String _userUuid;
    private long _groupId;
    private BaseModel<?> _studentRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.training.service.ClpSerializer.class;

    public studentClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return student.class;
    }

    @Override
    public String getModelClassName() {
        return student.class.getName();
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
        attributes.put("name", getName());
        attributes.put("dept_id", getDept_id());
        attributes.put("rollNo", getRollNo());
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

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Long dept_id = (Long) attributes.get("dept_id");

        if (dept_id != null) {
            setDept_id(dept_id);
        }

        Integer rollNo = (Integer) attributes.get("rollNo");

        if (rollNo != null) {
            setRollNo(rollNo);
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

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_studentRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_studentRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getDept_id() {
        return _dept_id;
    }

    @Override
    public void setDept_id(long dept_id) {
        _dept_id = dept_id;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setDept_id", long.class);

                method.invoke(_studentRemoteModel, dept_id);
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

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setRollNo", int.class);

                method.invoke(_studentRemoteModel, rollNo);
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

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_studentRemoteModel, userId);
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

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_studentRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getstudentRemoteModel() {
        return _studentRemoteModel;
    }

    public void setstudentRemoteModel(BaseModel<?> studentRemoteModel) {
        _studentRemoteModel = studentRemoteModel;
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

        Class<?> remoteModelClass = _studentRemoteModel.getClass();

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

        Object returnValue = method.invoke(_studentRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            studentLocalServiceUtil.addstudent(this);
        } else {
            studentLocalServiceUtil.updatestudent(this);
        }
    }

    @Override
    public student toEscapedModel() {
        return (student) ProxyUtil.newProxyInstance(student.class.getClassLoader(),
            new Class[] { student.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        studentClp clone = new studentClp();

        clone.setId(getId());
        clone.setName(getName());
        clone.setDept_id(getDept_id());
        clone.setRollNo(getRollNo());
        clone.setUserId(getUserId());
        clone.setGroupId(getGroupId());

        return clone;
    }

    @Override
    public int compareTo(student student) {
        long primaryKey = student.getPrimaryKey();

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

        if (!(obj instanceof studentClp)) {
            return false;
        }

        studentClp student = (studentClp) obj;

        long primaryKey = student.getPrimaryKey();

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
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", dept_id=");
        sb.append(getDept_id());
        sb.append(", rollNo=");
        sb.append(getRollNo());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.training.model.student");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dept_id</column-name><column-value><![CDATA[");
        sb.append(getDept_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rollNo</column-name><column-value><![CDATA[");
        sb.append(getRollNo());
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
