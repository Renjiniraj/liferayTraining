package net.opentrends.training.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import net.opentrends.training.service.ClpSerializer;
import net.opentrends.training.service.StudentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class StudentClp extends BaseModelImpl<Student> implements Student {
    private long _studentid;
    private String _fname;
    private String _lname;
    private int _age;
    private String _branch;
    private String _email;
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
        attributes.put("fname", getFname());
        attributes.put("lname", getLname());
        attributes.put("age", getAge());
        attributes.put("branch", getBranch());
        attributes.put("email", getEmail());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long studentid = (Long) attributes.get("studentid");

        if (studentid != null) {
            setStudentid(studentid);
        }

        String fname = (String) attributes.get("fname");

        if (fname != null) {
            setFname(fname);
        }

        String lname = (String) attributes.get("lname");

        if (lname != null) {
            setLname(lname);
        }

        Integer age = (Integer) attributes.get("age");

        if (age != null) {
            setAge(age);
        }

        String branch = (String) attributes.get("branch");

        if (branch != null) {
            setBranch(branch);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
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
    public String getFname() {
        return _fname;
    }

    @Override
    public void setFname(String fname) {
        _fname = fname;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setFname", String.class);

                method.invoke(_studentRemoteModel, fname);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLname() {
        return _lname;
    }

    @Override
    public void setLname(String lname) {
        _lname = lname;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setLname", String.class);

                method.invoke(_studentRemoteModel, lname);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAge() {
        return _age;
    }

    @Override
    public void setAge(int age) {
        _age = age;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setAge", int.class);

                method.invoke(_studentRemoteModel, age);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBranch() {
        return _branch;
    }

    @Override
    public void setBranch(String branch) {
        _branch = branch;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setBranch", String.class);

                method.invoke(_studentRemoteModel, branch);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail() {
        return _email;
    }

    @Override
    public void setEmail(String email) {
        _email = email;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_studentRemoteModel, email);
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
        clone.setFname(getFname());
        clone.setLname(getLname());
        clone.setAge(getAge());
        clone.setBranch(getBranch());
        clone.setEmail(getEmail());

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
        sb.append(", fname=");
        sb.append(getFname());
        sb.append(", lname=");
        sb.append(getLname());
        sb.append(", age=");
        sb.append(getAge());
        sb.append(", branch=");
        sb.append(getBranch());
        sb.append(", email=");
        sb.append(getEmail());
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
            "<column><column-name>fname</column-name><column-value><![CDATA[");
        sb.append(getFname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lname</column-name><column-value><![CDATA[");
        sb.append(getLname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>age</column-name><column-value><![CDATA[");
        sb.append(getAge());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>branch</column-name><column-value><![CDATA[");
        sb.append(getBranch());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
