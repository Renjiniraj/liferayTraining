package net.opentrends.training.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.training.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
    public long empId;
    public String employeeName;
    public int age;
    public long salary;
    public long fileEntryId;
    public String unit;
    public long groupId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{empId=");
        sb.append(empId);
        sb.append(", employeeName=");
        sb.append(employeeName);
        sb.append(", age=");
        sb.append(age);
        sb.append(", salary=");
        sb.append(salary);
        sb.append(", fileEntryId=");
        sb.append(fileEntryId);
        sb.append(", unit=");
        sb.append(unit);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setEmpId(empId);

        if (employeeName == null) {
            employeeImpl.setEmployeeName(StringPool.BLANK);
        } else {
            employeeImpl.setEmployeeName(employeeName);
        }

        employeeImpl.setAge(age);
        employeeImpl.setSalary(salary);
        employeeImpl.setFileEntryId(fileEntryId);

        if (unit == null) {
            employeeImpl.setUnit(StringPool.BLANK);
        } else {
            employeeImpl.setUnit(unit);
        }

        employeeImpl.setGroupId(groupId);

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        empId = objectInput.readLong();
        employeeName = objectInput.readUTF();
        age = objectInput.readInt();
        salary = objectInput.readLong();
        fileEntryId = objectInput.readLong();
        unit = objectInput.readUTF();
        groupId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(empId);

        if (employeeName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employeeName);
        }

        objectOutput.writeInt(age);
        objectOutput.writeLong(salary);
        objectOutput.writeLong(fileEntryId);

        if (unit == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(unit);
        }

        objectOutput.writeLong(groupId);
    }
}
