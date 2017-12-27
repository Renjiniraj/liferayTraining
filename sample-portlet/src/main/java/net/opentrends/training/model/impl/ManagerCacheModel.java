package net.opentrends.training.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.training.model.Manager;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Manager in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Manager
 * @generated
 */
public class ManagerCacheModel implements CacheModel<Manager>, Externalizable {
    public long manageentryID;
    public long groupId;
    public long companyId;
    public long userId;
    public long lastModifiedDate;
    public String managerID;
    public String managerName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{manageentryID=");
        sb.append(manageentryID);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", lastModifiedDate=");
        sb.append(lastModifiedDate);
        sb.append(", managerID=");
        sb.append(managerID);
        sb.append(", managerName=");
        sb.append(managerName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Manager toEntityModel() {
        ManagerImpl managerImpl = new ManagerImpl();

        managerImpl.setManageentryID(manageentryID);
        managerImpl.setGroupId(groupId);
        managerImpl.setCompanyId(companyId);
        managerImpl.setUserId(userId);

        if (lastModifiedDate == Long.MIN_VALUE) {
            managerImpl.setLastModifiedDate(null);
        } else {
            managerImpl.setLastModifiedDate(new Date(lastModifiedDate));
        }

        if (managerID == null) {
            managerImpl.setManagerID(StringPool.BLANK);
        } else {
            managerImpl.setManagerID(managerID);
        }

        if (managerName == null) {
            managerImpl.setManagerName(StringPool.BLANK);
        } else {
            managerImpl.setManagerName(managerName);
        }

        managerImpl.resetOriginalValues();

        return managerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        manageentryID = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        lastModifiedDate = objectInput.readLong();
        managerID = objectInput.readUTF();
        managerName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(manageentryID);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(lastModifiedDate);

        if (managerID == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(managerID);
        }

        if (managerName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(managerName);
        }
    }
}
