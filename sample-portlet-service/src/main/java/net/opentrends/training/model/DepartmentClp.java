package net.opentrends.training.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import net.opentrends.training.service.ClpSerializer;
import net.opentrends.training.service.DepartmentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class DepartmentClp extends BaseModelImpl<Department>
    implements Department {
    private long _departmentid;
    private String _deptName;
    private BaseModel<?> _departmentRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.training.service.ClpSerializer.class;

    public DepartmentClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Department.class;
    }

    @Override
    public String getModelClassName() {
        return Department.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _departmentid;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setDepartmentid(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _departmentid;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("departmentid", getDepartmentid());
        attributes.put("deptName", getDeptName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long departmentid = (Long) attributes.get("departmentid");

        if (departmentid != null) {
            setDepartmentid(departmentid);
        }

        String deptName = (String) attributes.get("deptName");

        if (deptName != null) {
            setDeptName(deptName);
        }
    }

    @Override
    public long getDepartmentid() {
        return _departmentid;
    }

    @Override
    public void setDepartmentid(long departmentid) {
        _departmentid = departmentid;

        if (_departmentRemoteModel != null) {
            try {
                Class<?> clazz = _departmentRemoteModel.getClass();

                Method method = clazz.getMethod("setDepartmentid", long.class);

                method.invoke(_departmentRemoteModel, departmentid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDeptName() {
        return _deptName;
    }

    @Override
    public void setDeptName(String deptName) {
        _deptName = deptName;

        if (_departmentRemoteModel != null) {
            try {
                Class<?> clazz = _departmentRemoteModel.getClass();

                Method method = clazz.getMethod("setDeptName", String.class);

                method.invoke(_departmentRemoteModel, deptName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDepartmentRemoteModel() {
        return _departmentRemoteModel;
    }

    public void setDepartmentRemoteModel(BaseModel<?> departmentRemoteModel) {
        _departmentRemoteModel = departmentRemoteModel;
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

        Class<?> remoteModelClass = _departmentRemoteModel.getClass();

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

        Object returnValue = method.invoke(_departmentRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DepartmentLocalServiceUtil.addDepartment(this);
        } else {
            DepartmentLocalServiceUtil.updateDepartment(this);
        }
    }

    @Override
    public Department toEscapedModel() {
        return (Department) ProxyUtil.newProxyInstance(Department.class.getClassLoader(),
            new Class[] { Department.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        DepartmentClp clone = new DepartmentClp();

        clone.setDepartmentid(getDepartmentid());
        clone.setDeptName(getDeptName());

        return clone;
    }

    @Override
    public int compareTo(Department department) {
        long primaryKey = department.getPrimaryKey();

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

        if (!(obj instanceof DepartmentClp)) {
            return false;
        }

        DepartmentClp department = (DepartmentClp) obj;

        long primaryKey = department.getPrimaryKey();

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
        StringBundler sb = new StringBundler(5);

        sb.append("{departmentid=");
        sb.append(getDepartmentid());
        sb.append(", deptName=");
        sb.append(getDeptName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.training.model.Department");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>departmentid</column-name><column-value><![CDATA[");
        sb.append(getDepartmentid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>deptName</column-name><column-value><![CDATA[");
        sb.append(getDeptName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
