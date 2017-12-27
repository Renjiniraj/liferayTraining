package net.opentrends.training.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.training.model.Student1;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Student1 in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Student1
 * @generated
 */
public class Student1CacheModel implements CacheModel<Student1>, Externalizable {
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
    public Student1 toEntityModel() {
        Student1Impl student1Impl = new Student1Impl();

        student1Impl.setStudentid(studentid);

        if (fname == null) {
            student1Impl.setFname(StringPool.BLANK);
        } else {
            student1Impl.setFname(fname);
        }

        if (lname == null) {
            student1Impl.setLname(StringPool.BLANK);
        } else {
            student1Impl.setLname(lname);
        }

        student1Impl.setAge(age);

        if (branch == null) {
            student1Impl.setBranch(StringPool.BLANK);
        } else {
            student1Impl.setBranch(branch);
        }

        if (email == null) {
            student1Impl.setEmail(StringPool.BLANK);
        } else {
            student1Impl.setEmail(email);
        }

        student1Impl.resetOriginalValues();

        return student1Impl;
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
