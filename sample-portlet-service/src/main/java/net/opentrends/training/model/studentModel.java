package net.opentrends.training.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the student service. Represents a row in the &quot;sample_student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.opentrends.training.model.impl.studentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.opentrends.training.model.impl.studentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see student
 * @see net.opentrends.training.model.impl.studentImpl
 * @see net.opentrends.training.model.impl.studentModelImpl
 * @generated
 */
public interface studentModel extends BaseModel<student> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a student model instance should use the {@link student} interface instead.
     */

    /**
     * Returns the primary key of this student.
     *
     * @return the primary key of this student
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this student.
     *
     * @param primaryKey the primary key of this student
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this student.
     *
     * @return the ID of this student
     */
    public long getId();

    /**
     * Sets the ID of this student.
     *
     * @param id the ID of this student
     */
    public void setId(long id);

    /**
     * Returns the name of this student.
     *
     * @return the name of this student
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this student.
     *
     * @param name the name of this student
     */
    public void setName(String name);

    /**
     * Returns the dept_id of this student.
     *
     * @return the dept_id of this student
     */
    public long getDept_id();

    /**
     * Sets the dept_id of this student.
     *
     * @param dept_id the dept_id of this student
     */
    public void setDept_id(long dept_id);

    /**
     * Returns the roll no of this student.
     *
     * @return the roll no of this student
     */
    public int getRollNo();

    /**
     * Sets the roll no of this student.
     *
     * @param rollNo the roll no of this student
     */
    public void setRollNo(int rollNo);

    /**
     * Returns the user ID of this student.
     *
     * @return the user ID of this student
     */
    public long getUserId();

    /**
     * Sets the user ID of this student.
     *
     * @param userId the user ID of this student
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this student.
     *
     * @return the user uuid of this student
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this student.
     *
     * @param userUuid the user uuid of this student
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the group ID of this student.
     *
     * @return the group ID of this student
     */
    public long getGroupId();

    /**
     * Sets the group ID of this student.
     *
     * @param groupId the group ID of this student
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
    public int compareTo(net.opentrends.training.model.student student);

    @Override
    public int hashCode();

    @Override
    public CacheModel<net.opentrends.training.model.student> toCacheModel();

    @Override
    public net.opentrends.training.model.student toEscapedModel();

    @Override
    public net.opentrends.training.model.student toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}