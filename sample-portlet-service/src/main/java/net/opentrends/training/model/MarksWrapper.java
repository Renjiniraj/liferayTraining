package net.opentrends.training.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Marks}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Marks
 * @generated
 */
public class MarksWrapper implements Marks, ModelWrapper<Marks> {
    private Marks _marks;

    public MarksWrapper(Marks marks) {
        _marks = marks;
    }

    @Override
    public Class<?> getModelClass() {
        return Marks.class;
    }

    @Override
    public String getModelClassName() {
        return Marks.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("marksid", getMarksid());
        attributes.put("rollNo", getRollNo());
        attributes.put("percentage", getPercentage());
        attributes.put("userId", getUserId());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long marksid = (Long) attributes.get("marksid");

        if (marksid != null) {
            setMarksid(marksid);
        }

        Integer rollNo = (Integer) attributes.get("rollNo");

        if (rollNo != null) {
            setRollNo(rollNo);
        }

        Integer percentage = (Integer) attributes.get("percentage");

        if (percentage != null) {
            setPercentage(percentage);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }
    }

    /**
    * Returns the primary key of this marks.
    *
    * @return the primary key of this marks
    */
    @Override
    public long getPrimaryKey() {
        return _marks.getPrimaryKey();
    }

    /**
    * Sets the primary key of this marks.
    *
    * @param primaryKey the primary key of this marks
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _marks.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the marksid of this marks.
    *
    * @return the marksid of this marks
    */
    @Override
    public long getMarksid() {
        return _marks.getMarksid();
    }

    /**
    * Sets the marksid of this marks.
    *
    * @param marksid the marksid of this marks
    */
    @Override
    public void setMarksid(long marksid) {
        _marks.setMarksid(marksid);
    }

    /**
    * Returns the roll no of this marks.
    *
    * @return the roll no of this marks
    */
    @Override
    public int getRollNo() {
        return _marks.getRollNo();
    }

    /**
    * Sets the roll no of this marks.
    *
    * @param rollNo the roll no of this marks
    */
    @Override
    public void setRollNo(int rollNo) {
        _marks.setRollNo(rollNo);
    }

    /**
    * Returns the percentage of this marks.
    *
    * @return the percentage of this marks
    */
    @Override
    public int getPercentage() {
        return _marks.getPercentage();
    }

    /**
    * Sets the percentage of this marks.
    *
    * @param percentage the percentage of this marks
    */
    @Override
    public void setPercentage(int percentage) {
        _marks.setPercentage(percentage);
    }

    /**
    * Returns the user ID of this marks.
    *
    * @return the user ID of this marks
    */
    @Override
    public long getUserId() {
        return _marks.getUserId();
    }

    /**
    * Sets the user ID of this marks.
    *
    * @param userId the user ID of this marks
    */
    @Override
    public void setUserId(long userId) {
        _marks.setUserId(userId);
    }

    /**
    * Returns the user uuid of this marks.
    *
    * @return the user uuid of this marks
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _marks.getUserUuid();
    }

    /**
    * Sets the user uuid of this marks.
    *
    * @param userUuid the user uuid of this marks
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _marks.setUserUuid(userUuid);
    }

    /**
    * Returns the group ID of this marks.
    *
    * @return the group ID of this marks
    */
    @Override
    public long getGroupId() {
        return _marks.getGroupId();
    }

    /**
    * Sets the group ID of this marks.
    *
    * @param groupId the group ID of this marks
    */
    @Override
    public void setGroupId(long groupId) {
        _marks.setGroupId(groupId);
    }

    @Override
    public boolean isNew() {
        return _marks.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _marks.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _marks.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _marks.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _marks.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _marks.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _marks.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _marks.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _marks.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _marks.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _marks.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new MarksWrapper((Marks) _marks.clone());
    }

    @Override
    public int compareTo(net.opentrends.training.model.Marks marks) {
        return _marks.compareTo(marks);
    }

    @Override
    public int hashCode() {
        return _marks.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.training.model.Marks> toCacheModel() {
        return _marks.toCacheModel();
    }

    @Override
    public net.opentrends.training.model.Marks toEscapedModel() {
        return new MarksWrapper(_marks.toEscapedModel());
    }

    @Override
    public net.opentrends.training.model.Marks toUnescapedModel() {
        return new MarksWrapper(_marks.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _marks.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _marks.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _marks.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MarksWrapper)) {
            return false;
        }

        MarksWrapper marksWrapper = (MarksWrapper) obj;

        if (Validator.equals(_marks, marksWrapper._marks)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Marks getWrappedMarks() {
        return _marks;
    }

    @Override
    public Marks getWrappedModel() {
        return _marks;
    }

    @Override
    public void resetOriginalValues() {
        _marks.resetOriginalValues();
    }
}
