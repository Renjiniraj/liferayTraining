package net.opentrends.training.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import net.opentrends.training.service.ClpSerializer;
import net.opentrends.training.service.StudentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class StudentClp extends BaseModelImpl<Student> implements Student {
    private long _studentid;
    private String _name;
    private long _dept_id;
    private int _rollNo;
    private long _userId;
    private String _userUuid;
    private long _groupId;
    private BaseModel<?> _studentRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.training.service.ClpSerializer.class;

    public StudentClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Student.class;
    }

    @Override
    public String getModelClassName() {
        return Student.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _studentid;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setStudentid(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _studentid;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("studentid", getStudentid());
        attributes.put("name", getName());
        attributes.put("dept_id", getDept_id());
        attributes.put("rollNo", getRollNo());
        attributes.put("userId", getUserId());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long studentid = (Long) attributes.get("studentid");

        if (studentid != null) {
            setStudentid(studentid);
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
    public long getStudentid() {
        return _studentid;
    }

    @Override
    public void setStudentid(long studentid) {
        _studentid = studentid;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setStudentid", long.class);

                method.invoke(_studentRemoteModel, studentid);
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

    public BaseModel<?> getStudentRemoteModel() {
        return _studentRemoteModel;
    }

    public void setStudentRemoteModel(BaseModel<?> studentRemoteModel) {
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
            StudentLocalServiceUtil.addStudent(this);
        } else {
            StudentLocalServiceUtil.updateStudent(this);
        }
    }

    @Override
    public Student toEscapedModel() {
        return (Student) ProxyUtil.newProxyInstance(Student.class.getClassLoader(),
            new Class[] { Student.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        StudentClp clone = new StudentClp();

        clone.setStudentid(getStudentid());
        clone.setName(getName());
        clone.setDept_id(getDept_id());
        clone.setRollNo(getRollNo());
        clone.setUserId(getUserId());
        clone.setGroupId(getGroupId());

        return clone;
    }

    @Override
    public int compareTo(Student student) {
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

        if (!(obj instanceof StudentClp)) {
            return false;
        }

        StudentClp student = (StudentClp) obj;

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

        sb.append("{studentid=");
        sb.append(getStudentid());
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
        sb.append("net.opentrends.training.model.Student");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>studentid</column-name><column-value><![CDATA[");
        sb.append(getStudentid());
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
