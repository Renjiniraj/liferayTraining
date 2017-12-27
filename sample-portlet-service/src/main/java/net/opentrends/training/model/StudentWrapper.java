package net.opentrends.training.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentWrapper implements Student, ModelWrapper<Student> {
    private Student _student;

    public StudentWrapper(Student student) {
        _student = student;
    }

    @Override
    public Class<?> getModelClass() {
        return Student.class;
    }

    @Override
    public String getModelClassName() {
        return Student.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("studentid", getStudentid());
        attributes.put("name", getName());
        attributes.put("dept_id", getDept_id());
        attributes.put("rollNo", getRollNo());
        attributes.put("userId", getUserId());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long studentid = (Long) attributes.get("studentid");

        if (studentid != null) {
            setStudentid(studentid);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Long dept_id = (Long) attributes.get("dept_id");

        if (dept_id != null) {
            setDept_id(dept_id);
        }

        Integer rollNo = (Integer) attributes.get("rollNo");

        if (rollNo != null) {
            setRollNo(rollNo);
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
    * Returns the primary key of this student.
    *
    * @return the primary key of this student
    */
    @Override
    public long getPrimaryKey() {
        return _student.getPrimaryKey();
    }

    /**
    * Sets the primary key of this student.
    *
    * @param primaryKey the primary key of this student
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _student.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the studentid of this student.
    *
    * @return the studentid of this student
    */
    @Override
    public long getStudentid() {
        return _student.getStudentid();
    }

    /**
    * Sets the studentid of this student.
    *
    * @param studentid the studentid of this student
    */
    @Override
    public void setStudentid(long studentid) {
        _student.setStudentid(studentid);
    }

    /**
    * Returns the name of this student.
    *
    * @return the name of this student
    */
    @Override
    public java.lang.String getName() {
        return _student.getName();
    }

    /**
    * Sets the name of this student.
    *
    * @param name the name of this student
    */
    @Override
    public void setName(java.lang.String name) {
        _student.setName(name);
    }

    /**
    * Returns the dept_id of this student.
    *
    * @return the dept_id of this student
    */
    @Override
    public long getDept_id() {
        return _student.getDept_id();
    }

    /**
    * Sets the dept_id of this student.
    *
    * @param dept_id the dept_id of this student
    */
    @Override
    public void setDept_id(long dept_id) {
        _student.setDept_id(dept_id);
    }

    /**
    * Returns the roll no of this student.
    *
    * @return the roll no of this student
    */
    @Override
    public int getRollNo() {
        return _student.getRollNo();
    }

    /**
    * Sets the roll no of this student.
    *
    * @param rollNo the roll no of this student
    */
    @Override
    public void setRollNo(int rollNo) {
        _student.setRollNo(rollNo);
    }

    /**
    * Returns the user ID of this student.
    *
    * @return the user ID of this student
    */
    @Override
    public long getUserId() {
        return _student.getUserId();
    }

    /**
    * Sets the user ID of this student.
    *
    * @param userId the user ID of this student
    */
    @Override
    public void setUserId(long userId) {
        _student.setUserId(userId);
    }

    /**
    * Returns the user uuid of this student.
    *
    * @return the user uuid of this student
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _student.getUserUuid();
    }

    /**
    * Sets the user uuid of this student.
    *
    * @param userUuid the user uuid of this student
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _student.setUserUuid(userUuid);
    }

    /**
    * Returns the group ID of this student.
    *
    * @return the group ID of this student
    */
    @Override
    public long getGroupId() {
        return _student.getGroupId();
    }

    /**
    * Sets the group ID of this student.
    *
    * @param groupId the group ID of this student
    */
    @Override
    public void setGroupId(long groupId) {
        _student.setGroupId(groupId);
    }

    @Override
    public boolean isNew() {
        return _student.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _student.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _student.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _student.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _student.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _student.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _student.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _student.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _student.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _student.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _student.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new StudentWrapper((Student) _student.clone());
    }

    @Override
    public int compareTo(net.opentrends.training.model.Student student) {
        return _student.compareTo(student);
    }

    @Override
    public int hashCode() {
        return _student.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.training.model.Student> toCacheModel() {
        return _student.toCacheModel();
    }

    @Override
    public net.opentrends.training.model.Student toEscapedModel() {
        return new StudentWrapper(_student.toEscapedModel());
    }

    @Override
    public net.opentrends.training.model.Student toUnescapedModel() {
        return new StudentWrapper(_student.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _student.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _student.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _student.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof StudentWrapper)) {
            return false;
        }

        StudentWrapper studentWrapper = (StudentWrapper) obj;

        if (Validator.equals(_student, studentWrapper._student)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Student getWrappedStudent() {
        return _student;
    }

    @Override
    public Student getWrappedModel() {
        return _student;
    }

    @Override
    public void resetOriginalValues() {
        _student.resetOriginalValues();
    }
}
