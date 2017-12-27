package net.opentrends.training.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the marks service. Represents a row in the &quot;sample_marks&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.opentrends.training.model.impl.marksModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.opentrends.training.model.impl.marksImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see marks
 * @see net.opentrends.training.model.impl.marksImpl
 * @see net.opentrends.training.model.impl.marksModelImpl
 * @generated
 */
public interface marksModel extends BaseModel<marks> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a marks model instance should use the {@link marks} interface instead.
     */

    /**
     * Returns the primary key of this marks.
     *
     * @return the primary key of this marks
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this marks.
     *
     * @param primaryKey the primary key of this marks
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this marks.
     *
     * @return the ID of this marks
     */
    public long getId();

    /**
     * Sets the ID of this marks.
     *
     * @param id the ID of this marks
     */
    public void setId(long id);

    /**
     * Returns the roll no of this marks.
     *
     * @return the roll no of this marks
     */
    public int getRollNo();

    /**
     * Sets the roll no of this marks.
     *
     * @param rollNo the roll no of this marks
     */
    public void setRollNo(int rollNo);

    /**
     * Returns the percentage of this marks.
     *
     * @return the percentage of this marks
     */
    public int getPercentage();

    /**
     * Sets the percentage of this marks.
     *
     * @param percentage the percentage of this marks
     */
    public void setPercentage(int percentage);

    /**
     * Returns the user ID of this marks.
     *
     * @return the user ID of this marks
     */
    public long getUserId();

    /**
     * Sets the user ID of this marks.
     *
     * @param userId the user ID of this marks
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this marks.
     *
     * @return the user uuid of this marks
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this marks.
     *
     * @param userUuid the user uuid of this marks
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the group ID of this marks.
     *
     * @return the group ID of this marks
     */
    public long getGroupId();

    /**
     * Sets the group ID of this marks.
     *
     * @param groupId the group ID of this marks
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
    public int compareTo(net.opentrends.training.model.marks marks);

    @Override
    public int hashCode();

    @Override
    public CacheModel<net.opentrends.training.model.marks> toCacheModel();

    @Override
    public net.opentrends.training.model.marks toEscapedModel();

    @Override
    public net.opentrends.training.model.marks toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
