package net.opentrends.training.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import net.opentrends.training.service.ClpSerializer;
import net.opentrends.training.service.EmployeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class EmployeeClp extends BaseModelImpl<Employee> implements Employee {
    private long _empId;
    private String _employeeName;
    private int _age;
    private long _salary;
    private long _fileEntryId;
    private String _unit;
    private long _groupId;
    private BaseModel<?> _employeeRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.training.service.ClpSerializer.class;

    public EmployeeClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Employee.class;
    }

    @Override
    public String getModelClassName() {
        return Employee.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _empId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmpId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _empId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("empId", getEmpId());
        attributes.put("employeeName", getEmployeeName());
        attributes.put("age", getAge());
        attributes.put("salary", getSalary());
        attributes.put("fileEntryId", getFileEntryId());
        attributes.put("unit", getUnit());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long empId = (Long) attributes.get("empId");

        if (empId != null) {
            setEmpId(empId);
        }

        String employeeName = (String) attributes.get("employeeName");

        if (employeeName != null) {
            setEmployeeName(employeeName);
        }

        Integer age = (Integer) attributes.get("age");

        if (age != null) {
            setAge(age);
        }

        Long salary = (Long) attributes.get("salary");

        if (salary != null) {
            setSalary(salary);
        }

        Long fileEntryId = (Long) attributes.get("fileEntryId");

        if (fileEntryId != null) {
            setFileEntryId(fileEntryId);
        }

        String unit = (String) attributes.get("unit");

        if (unit != null) {
            setUnit(unit);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }
    }

    @Override
    public long getEmpId() {
        return _empId;
    }

    @Override
    public void setEmpId(long empId) {
        _empId = empId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmpId", long.class);

                method.invoke(_employeeRemoteModel, empId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmployeeName() {
        return _employeeName;
    }

    @Override
    public void setEmployeeName(String employeeName) {
        _employeeName = employeeName;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeName", String.class);

                method.invoke(_employeeRemoteModel, employeeName);
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

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setAge", int.class);

                method.invoke(_employeeRemoteModel, age);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSalary() {
        return _salary;
    }

    @Override
    public void setSalary(long salary) {
        _salary = salary;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setSalary", long.class);

                method.invoke(_employeeRemoteModel, salary);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFileEntryId() {
        return _fileEntryId;
    }

    @Override
    public void setFileEntryId(long fileEntryId) {
        _fileEntryId = fileEntryId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setFileEntryId", long.class);

                method.invoke(_employeeRemoteModel, fileEntryId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUnit() {
        return _unit;
    }

    @Override
    public void setUnit(String unit) {
        _unit = unit;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setUnit", String.class);

                method.invoke(_employeeRemoteModel, unit);
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

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_employeeRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmployeeRemoteModel() {
        return _employeeRemoteModel;
    }

    public void setEmployeeRemoteModel(BaseModel<?> employeeRemoteModel) {
        _employeeRemoteModel = employeeRemoteModel;
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

        Class<?> remoteModelClass = _employeeRemoteModel.getClass();

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

        Object returnValue = method.invoke(_employeeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeeLocalServiceUtil.addEmployee(this);
        } else {
            EmployeeLocalServiceUtil.updateEmployee(this);
        }
    }

    @Override
    public Employee toEscapedModel() {
        return (Employee) ProxyUtil.newProxyInstance(Employee.class.getClassLoader(),
            new Class[] { Employee.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EmployeeClp clone = new EmployeeClp();

        clone.setEmpId(getEmpId());
        clone.setEmployeeName(getEmployeeName());
        clone.setAge(getAge());
        clone.setSalary(getSalary());
        clone.setFileEntryId(getFileEntryId());
        clone.setUnit(getUnit());
        clone.setGroupId(getGroupId());

        return clone;
    }

    @Override
    public int compareTo(Employee employee) {
        long primaryKey = employee.getPrimaryKey();

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

        if (!(obj instanceof EmployeeClp)) {
            return false;
        }

        EmployeeClp employee = (EmployeeClp) obj;

        long primaryKey = employee.getPrimaryKey();

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

        sb.append("{empId=");
        sb.append(getEmpId());
        sb.append(", employeeName=");
        sb.append(getEmployeeName());
        sb.append(", age=");
        sb.append(getAge());
        sb.append(", salary=");
        sb.append(getSalary());
        sb.append(", fileEntryId=");
        sb.append(getFileEntryId());
        sb.append(", unit=");
        sb.append(getUnit());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.training.model.Employee");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>empId</column-name><column-value><![CDATA[");
        sb.append(getEmpId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeName</column-name><column-value><![CDATA[");
        sb.append(getEmployeeName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>age</column-name><column-value><![CDATA[");
        sb.append(getAge());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salary</column-name><column-value><![CDATA[");
        sb.append(getSalary());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
        sb.append(getFileEntryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>unit</column-name><column-value><![CDATA[");
        sb.append(getUnit());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
