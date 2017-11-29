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
        attributes.put("fname", getFname());
        attributes.put("lname", getLname());
        attributes.put("age", getAge());
        attributes.put("branch", getBranch());
        attributes.put("email", getEmail());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long studentid = (Long) attributes.get("studentid");

        if (studentid != null) {
            setStudentid(studentid);
        }

        String fname = (String) attributes.get("fname");

        if (fname != null) {
            setFname(fname);
        }

        String lname = (String) attributes.get("lname");

        if (lname != null) {
            setLname(lname);
        }

        Integer age = (Integer) attributes.get("age");

        if (age != null) {
            setAge(age);
        }

        String branch = (String) attributes.get("branch");

        if (branch != null) {
            setBranch(branch);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
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
    * Returns the fname of this student.
    *
    * @return the fname of this student
    */
    @Override
    public java.lang.String getFname() {
        return _student.getFname();
    }

    /**
    * Sets the fname of this student.
    *
    * @param fname the fname of this student
    */
    @Override
    public void setFname(java.lang.String fname) {
        _student.setFname(fname);
    }

    /**
    * Returns the lname of this student.
    *
    * @return the lname of this student
    */
    @Override
    public java.lang.String getLname() {
        return _student.getLname();
    }

    /**
    * Sets the lname of this student.
    *
    * @param lname the lname of this student
    */
    @Override
    public void setLname(java.lang.String lname) {
        _student.setLname(lname);
    }

    /**
    * Returns the age of this student.
    *
    * @return the age of this student
    */
    @Override
    public int getAge() {
        return _student.getAge();
    }

    /**
    * Sets the age of this student.
    *
    * @param age the age of this student
    */
    @Override
    public void setAge(int age) {
        _student.setAge(age);
    }

    /**
    * Returns the branch of this student.
    *
    * @return the branch of this student
    */
    @Override
    public java.lang.String getBranch() {
        return _student.getBranch();
    }

    /**
    * Sets the branch of this student.
    *
    * @param branch the branch of this student
    */
    @Override
    public void setBranch(java.lang.String branch) {
        _student.setBranch(branch);
    }

    /**
    * Returns the email of this student.
    *
    * @return the email of this student
    */
    @Override
    public java.lang.String getEmail() {
        return _student.getEmail();
    }

    /**
    * Sets the email of this student.
    *
    * @param email the email of this student
    */
    @Override
    public void setEmail(java.lang.String email) {
        _student.setEmail(email);
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
