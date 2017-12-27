package net.opentrends.training.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link department}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see department
 * @generated
 */
public class departmentWrapper implements department, ModelWrapper<department> {
    private department _department;

    public departmentWrapper(department department) {
        _department = department;
    }

    @Override
    public Class<?> getModelClass() {
        return department.class;
    }

    @Override
    public String getModelClassName() {
        return department.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }
    }

    /**
    * Returns the primary key of this department.
    *
    * @return the primary key of this department
    */
    @Override
    public long getPrimaryKey() {
        return _department.getPrimaryKey();
    }

    /**
    * Sets the primary key of this department.
    *
    * @param primaryKey the primary key of this department
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _department.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this department.
    *
    * @return the ID of this department
    */
    @Override
    public long getId() {
        return _department.getId();
    }

    /**
    * Sets the ID of this department.
    *
    * @param id the ID of this department
    */
    @Override
    public void setId(long id) {
        _department.setId(id);
    }

    /**
    * Returns the name of this department.
    *
    * @return the name of this department
    */
    @Override
    public java.lang.String getName() {
        return _department.getName();
    }

    /**
    * Sets the name of this department.
    *
    * @param name the name of this department
    */
    @Override
    public void setName(java.lang.String name) {
        _department.setName(name);
    }

    @Override
    public boolean isNew() {
        return _department.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _department.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _department.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _department.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _department.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _department.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _department.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _department.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _department.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _department.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _department.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new departmentWrapper((department) _department.clone());
    }

    @Override
    public int compareTo(net.opentrends.training.model.department department) {
        return _department.compareTo(department);
    }

    @Override
    public int hashCode() {
        return _department.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.training.model.department> toCacheModel() {
        return _department.toCacheModel();
    }

    @Override
    public net.opentrends.training.model.department toEscapedModel() {
        return new departmentWrapper(_department.toEscapedModel());
    }

    @Override
    public net.opentrends.training.model.department toUnescapedModel() {
        return new departmentWrapper(_department.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _department.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _department.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _department.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof departmentWrapper)) {
            return false;
        }

        departmentWrapper departmentWrapper = (departmentWrapper) obj;

        if (Validator.equals(_department, departmentWrapper._department)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public department getWrappeddepartment() {
        return _department;
    }

    @Override
    public department getWrappedModel() {
        return _department;
    }

    @Override
    public void resetOriginalValues() {
        _department.resetOriginalValues();
    }
}
