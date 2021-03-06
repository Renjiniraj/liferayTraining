package net.opentrends.training.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;sample_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.opentrends.training.model.impl.EmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.opentrends.training.model.impl.EmployeeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @see net.opentrends.training.model.impl.EmployeeImpl
 * @see net.opentrends.training.model.impl.EmployeeModelImpl
 * @generated
 */
public interface EmployeeModel extends BaseModel<Employee> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
     */

    /**
     * Returns the primary key of this employee.
     *
     * @return the primary key of this employee
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this employee.
     *
     * @param primaryKey the primary key of this employee
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the emp ID of this employee.
     *
     * @return the emp ID of this employee
     */
    public long getEmpId();

    /**
     * Sets the emp ID of this employee.
     *
     * @param empId the emp ID of this employee
     */
    public void setEmpId(long empId);

    /**
     * Returns the employee name of this employee.
     *
     * @return the employee name of this employee
     */
    @AutoEscape
    public String getEmployeeName();

    /**
     * Sets the employee name of this employee.
     *
     * @param employeeName the employee name of this employee
     */
    public void setEmployeeName(String employeeName);

    /**
     * Returns the age of this employee.
     *
     * @return the age of this employee
     */
    public int getAge();

    /**
     * Sets the age of this employee.
     *
     * @param age the age of this employee
     */
    public void setAge(int age);

    /**
     * Returns the salary of this employee.
     *
     * @return the salary of this employee
     */
    public long getSalary();

    /**
     * Sets the salary of this employee.
     *
     * @param salary the salary of this employee
     */
    public void setSalary(long salary);

    /**
     * Returns the file entry ID of this employee.
     *
     * @return the file entry ID of this employee
     */
    public long getFileEntryId();

    /**
     * Sets the file entry ID of this employee.
     *
     * @param fileEntryId the file entry ID of this employee
     */
    public void setFileEntryId(long fileEntryId);

    /**
     * Returns the unit of this employee.
     *
     * @return the unit of this employee
     */
    @AutoEscape
    public String getUnit();

    /**
     * Sets the unit of this employee.
     *
     * @param unit the unit of this employee
     */
    public void setUnit(String unit);

    /**
     * Returns the group ID of this employee.
     *
     * @return the group ID of this employee
     */
    public long getGroupId();

    /**
     * Sets the group ID of this employee.
     *
     * @param groupId the group ID of this employee
     */
    public void setGroupId(long groupId);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(net.opentrends.training.model.Employee employee);

    @Override
    public int hashCode();

    @Override
    public CacheModel<net.opentrends.training.model.Employee> toCacheModel();

    @Override
    public net.opentrends.training.model.Employee toEscapedModel();

    @Override
    public net.opentrends.training.model.Employee toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
