package net.opentrends.training.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student1}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student1
 * @generated
 */
public class Student1Wrapper implements Student1, ModelWrapper<Student1> {
    private Student1 _student1;

    public Student1Wrapper(Student1 student1) {
        _student1 = student1;
    }

    @Override
    public Class<?> getModelClass() {
        return Student1.class;
    }

    @Override
    public String getModelClassName() {
        return Student1.class.getName();
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
    * Returns the primary key of this student1.
    *
    * @return the primary key of this student1
    */
    @Override
    public long getPrimaryKey() {
        return _student1.getPrimaryKey();
    }

    /**
    * Sets the primary key of this student1.
    *
    * @param primaryKey the primary key of this student1
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _student1.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the studentid of this student1.
    *
    * @return the studentid of this student1
    */
    @Override
    public long getStudentid() {
        return _student1.getStudentid();
    }

    /**
    * Sets the studentid of this student1.
    *
    * @param studentid the studentid of this student1
    */
    @Override
    public void setStudentid(long studentid) {
        _student1.setStudentid(studentid);
    }

    /**
    * Returns the fname of this student1.
    *
    * @return the fname of this student1
    */
    @Override
    public java.lang.String getFname() {
        return _student1.getFname();
    }

    /**
    * Sets the fname of this student1.
    *
    * @param fname the fname of this student1
    */
    @Override
    public void setFname(java.lang.String fname) {
        _student1.setFname(fname);
    }

    /**
    * Returns the lname of this student1.
    *
    * @return the lname of this student1
    */
    @Override
    public java.lang.String getLname() {
        return _student1.getLname();
    }

    /**
    * Sets the lname of this student1.
    *
    * @param lname the lname of this student1
    */
    @Override
    public void setLname(java.lang.String lname) {
        _student1.setLname(lname);
    }

    /**
    * Returns the age of this student1.
    *
    * @return the age of this student1
    */
    @Override
    public int getAge() {
        return _student1.getAge();
    }

    /**
    * Sets the age of this student1.
    *
    * @param age the age of this student1
    */
    @Override
    public void setAge(int age) {
        _student1.setAge(age);
    }

    /**
    * Returns the branch of this student1.
    *
    * @return the branch of this student1
    */
    @Override
    public java.lang.String getBranch() {
        return _student1.getBranch();
    }

    /**
    * Sets the branch of this student1.
    *
    * @param branch the branch of this student1
    */
    @Override
    public void setBranch(java.lang.String branch) {
        _student1.setBranch(branch);
    }

    /**
    * Returns the email of this student1.
    *
    * @return the email of this student1
    */
    @Override
    public java.lang.String getEmail() {
        return _student1.getEmail();
    }

    /**
    * Sets the email of this student1.
    *
    * @param email the email of this student1
    */
    @Override
    public void setEmail(java.lang.String email) {
        _student1.setEmail(email);
    }

    @Override
    public boolean isNew() {
        return _student1.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _student1.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _student1.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _student1.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _student1.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _student1.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _student1.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _student1.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _student1.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _student1.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _student1.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Student1Wrapper((Student1) _student1.clone());
    }

    @Override
    public int compareTo(net.opentrends.training.model.Student1 student1) {
        return _student1.compareTo(student1);
    }

    @Override
    public int hashCode() {
        return _student1.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.training.model.Student1> toCacheModel() {
        return _student1.toCacheModel();
    }

    @Override
    public net.opentrends.training.model.Student1 toEscapedModel() {
        return new Student1Wrapper(_student1.toEscapedModel());
    }

    @Override
    public net.opentrends.training.model.Student1 toUnescapedModel() {
        return new Student1Wrapper(_student1.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _student1.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _student1.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _student1.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student1Wrapper)) {
            return false;
        }

        Student1Wrapper student1Wrapper = (Student1Wrapper) obj;

        if (Validator.equals(_student1, student1Wrapper._student1)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Student1 getWrappedStudent1() {
        return _student1;
    }

    @Override
    public Student1 getWrappedModel() {
        return _student1;
    }

    @Override
    public void resetOriginalValues() {
        _student1.resetOriginalValues();
    }
}
