package net.opentrends.training.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import net.opentrends.training.model.Marks;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Marks in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Marks
 * @generated
 */
public class MarksCacheModel implements CacheModel<Marks>, Externalizable {
    public long marksid;
    public int rollNo;
    public int percentage;
    public long userId;
    public long groupId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{marksid=");
        sb.append(marksid);
        sb.append(", rollNo=");
        sb.append(rollNo);
        sb.append(", percentage=");
        sb.append(percentage);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Marks toEntityModel() {
        MarksImpl marksImpl = new MarksImpl();

        marksImpl.setMarksid(marksid);
        marksImpl.setRollNo(rollNo);
        marksImpl.setPercentage(percentage);
        marksImpl.setUserId(userId);
        marksImpl.setGroupId(groupId);

        marksImpl.resetOriginalValues();

        return marksImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        marksid = objectInput.readLong();
        rollNo = objectInput.readInt();
        percentage = objectInput.readInt();
        userId = objectInput.readLong();
        groupId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(marksid);
        objectOutput.writeInt(rollNo);
        objectOutput.writeInt(percentage);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(groupId);
    }
}
