package net.opentrends.training.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the department service. Represents a row in the &quot;sample_department&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.opentrends.training.model.impl.departmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.opentrends.training.model.impl.departmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see department
 * @see net.opentrends.training.model.impl.departmentImpl
 * @see net.opentrends.training.model.impl.departmentModelImpl
 * @generated
 */
public interface departmentModel extends BaseModel<department> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a department model instance should use the {@link department} interface instead.
     */

    /**
     * Returns the primary key of this department.
     *
     * @return the primary key of this department
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this department.
     *
     * @param primaryKey the primary key of this department
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this department.
     *
     * @return the ID of this department
     */
    public long getId();

    /**
     * Sets the ID of this department.
     *
     * @param id the ID of this department
     */
    public void setId(long id);

    /**
     * Returns the name of this department.
     *
     * @return the name of this department
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this department.
     *
     * @param name the name of this department
     */
    public void setName(String name);

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
    public int compareTo(net.opentrends.training.model.department department);

    @Override
    public int hashCode();

    @Override
    public CacheModel<net.opentrends.training.model.department> toCacheModel();

    @Override
    public net.opentrends.training.model.department toEscapedModel();

    @Override
    public net.opentrends.training.model.department toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}