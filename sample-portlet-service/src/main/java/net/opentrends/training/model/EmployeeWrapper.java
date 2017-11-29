package net.opentrends.training.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
    private Employee _employee;

    public EmployeeWrapper(Employee employee) {
        _employee = employee;
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
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("empId", getEmpId());
        attributes.put("employeeName", getEmployeeName());
        attributes.put("age", getAge());
        attributes.put("salary", getSalary());
        attributes.put("fileEntryId", getFileEntryId());
        attributes.put("unit", getUnit());

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
    }

    /**
    * Returns the primary key of this employee.
    *
    * @return the primary key of this employee
    */
    @Override
    public long getPrimaryKey() {
        return _employee.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee.
    *
    * @param primaryKey the primary key of this employee
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employee.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the emp ID of this employee.
    *
    * @return the emp ID of this employee
    */
    @Override
    public long getEmpId() {
        return _employee.getEmpId();
    }

    /**
    * Sets the emp ID of this employee.
    *
    * @param empId the emp ID of this employee
    */
    @Override
    public void setEmpId(long empId) {
        _employee.setEmpId(empId);
    }

    /**
    * Returns the employee name of this employee.
    *
    * @return the employee name of this employee
    */
    @Override
    public java.lang.String getEmployeeName() {
        return _employee.getEmployeeName();
    }

    /**
    * Sets the employee name of this employee.
    *
    * @param employeeName the employee name of this employee
    */
    @Override
    public void setEmployeeName(java.lang.String employeeName) {
        _employee.setEmployeeName(employeeName);
    }

    /**
    * Returns the age of this employee.
    *
    * @return the age of this employee
    */
    @Override
    public int getAge() {
        return _employee.getAge();
    }

    /**
    * Sets the age of this employee.
    *
    * @param age the age of this employee
    */
    @Override
    public void setAge(int age) {
        _employee.setAge(age);
    }

    /**
    * Returns the salary of this employee.
    *
    * @return the salary of this employee
    */
    @Override
    public long getSalary() {
        return _employee.getSalary();
    }

    /**
    * Sets the salary of this employee.
    *
    * @param salary the salary of this employee
    */
    @Override
    public void setSalary(long salary) {
        _employee.setSalary(salary);
    }

    /**
    * Returns the file entry ID of this employee.
    *
    * @return the file entry ID of this employee
    */
    @Override
    public long getFileEntryId() {
        return _employee.getFileEntryId();
    }

    /**
    * Sets the file entry ID of this employee.
    *
    * @param fileEntryId the file entry ID of this employee
    */
    @Override
    public void setFileEntryId(long fileEntryId) {
        _employee.setFileEntryId(fileEntryId);
    }

    /**
    * Returns the unit of this employee.
    *
    * @return the unit of this employee
    */
    @Override
    public java.lang.String getUnit() {
        return _employee.getUnit();
    }

    /**
    * Sets the unit of this employee.
    *
    * @param unit the unit of this employee
    */
    @Override
    public void setUnit(java.lang.String unit) {
        _employee.setUnit(unit);
    }

    @Override
    public boolean isNew() {
        return _employee.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employee.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employee.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employee.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employee.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employee.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employee.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employee.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeWrapper((Employee) _employee.clone());
    }

    @Override
    public int compareTo(net.opentrends.training.model.Employee employee) {
        return _employee.compareTo(employee);
    }

    @Override
    public int hashCode() {
        return _employee.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.training.model.Employee> toCacheModel() {
        return _employee.toCacheModel();
    }

    @Override
    public net.opentrends.training.model.Employee toEscapedModel() {
        return new EmployeeWrapper(_employee.toEscapedModel());
    }

    @Override
    public net.opentrends.training.model.Employee toUnescapedModel() {
        return new EmployeeWrapper(_employee.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employee.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeWrapper)) {
            return false;
        }

        EmployeeWrapper employeeWrapper = (EmployeeWrapper) obj;

        if (Validator.equals(_employee, employeeWrapper._employee)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employee getWrappedEmployee() {
        return _employee;
    }

    @Override
    public Employee getWrappedModel() {
        return _employee;
    }

    @Override
    public void resetOriginalValues() {
        _employee.resetOriginalValues();
    }
}
