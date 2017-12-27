package net.opentrends.training.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.training.model.Department;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Department in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Department
 * @generated
 */
public class DepartmentCacheModel implements CacheModel<Department>,
    Externalizable {
    public long departmentid;
    public String deptName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{departmentid=");
        sb.append(departmentid);
        sb.append(", deptName=");
        sb.append(deptName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Department toEntityModel() {
        DepartmentImpl departmentImpl = new DepartmentImpl();

        departmentImpl.setDepartmentid(departmentid);

        if (deptName == null) {
            departmentImpl.setDeptName(StringPool.BLANK);
        } else {
            departmentImpl.setDeptName(deptName);
        }

        departmentImpl.resetOriginalValues();

        return departmentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        departmentid = objectInput.readLong();
        deptName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(departmentid);

        if (deptName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(deptName);
        }
    }
}
