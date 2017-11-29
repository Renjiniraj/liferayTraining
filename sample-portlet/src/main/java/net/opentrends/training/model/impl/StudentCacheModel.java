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
    public String fname;
    public String lname;
    public int age;
    public String branch;
    public String email;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{studentid=");
        sb.append(studentid);
        sb.append(", fname=");
        sb.append(fname);
        sb.append(", lname=");
        sb.append(lname);
        sb.append(", age=");
        sb.append(age);
        sb.append(", branch=");
        sb.append(branch);
        sb.append(", email=");
        sb.append(email);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Student toEntityModel() {
        StudentImpl studentImpl = new StudentImpl();

        studentImpl.setStudentid(studentid);

        if (fname == null) {
            studentImpl.setFname(StringPool.BLANK);
        } else {
            studentImpl.setFname(fname);
        }

        if (lname == null) {
            studentImpl.setLname(StringPool.BLANK);
        } else {
            studentImpl.setLname(lname);
        }

        studentImpl.setAge(age);

        if (branch == null) {
            studentImpl.setBranch(StringPool.BLANK);
        } else {
            studentImpl.setBranch(branch);
        }

        if (email == null) {
            studentImpl.setEmail(StringPool.BLANK);
        } else {
            studentImpl.setEmail(email);
        }

        studentImpl.resetOriginalValues();

        return studentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        studentid = objectInput.readLong();
        fname = objectInput.readUTF();
        lname = objectInput.readUTF();
        age = objectInput.readInt();
        branch = objectInput.readUTF();
        email = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(studentid);

        if (fname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(fname);
        }

        if (lname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lname);
        }

        objectOutput.writeInt(age);

        if (branch == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(branch);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }
    }
}
