package net.opentrends.training.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.training.model.Student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {
    public long studentid;
    public String name;
    public long dept_id;
    public int rollNo;
    public long userId;
    public long groupId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{studentid=");
        sb.append(studentid);
        sb.append(", name=");
        sb.append(name);
        sb.append(", dept_id=");
        sb.append(dept_id);
        sb.append(", rollNo=");
        sb.append(rollNo);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Student toEntityModel() {
        StudentImpl studentImpl = new StudentImpl();

        studentImpl.setStudentid(studentid);

        if (name == null) {
            studentImpl.setName(StringPool.BLANK);
        } else {
            studentImpl.setName(name);
        }

        studentImpl.setDept_id(dept_id);
        studentImpl.setRollNo(rollNo);
        studentImpl.setUserId(userId);
        studentImpl.setGroupId(groupId);

        studentImpl.resetOriginalValues();

        return studentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        studentid = objectInput.readLong();
        name = objectInput.readUTF();
        dept_id = objectInput.readLong();
        rollNo = objectInput.readInt();
        userId = objectInput.readLong();
        groupId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(studentid);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(dept_id);
        objectOutput.writeInt(rollNo);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(groupId);
    }
}
