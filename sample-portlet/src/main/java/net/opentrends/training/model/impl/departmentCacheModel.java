package net.opentrends.training.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.training.model.department;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing department in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see department
 * @generated
 */
public class departmentCacheModel implements CacheModel<department>,
    Externalizable {
    public long id;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{id=");
        sb.append(id);
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public department toEntityModel() {
        departmentImpl departmentImpl = new departmentImpl();

        departmentImpl.setId(id);

        if (name == null) {
            departmentImpl.setName(StringPool.BLANK);
        } else {
            departmentImpl.setName(name);
        }

        departmentImpl.resetOriginalValues();

        return departmentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        name = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }
    }
}
