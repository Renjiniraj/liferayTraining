package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.training.model.Department;
import net.opentrends.training.service.DepartmentLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DepartmentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DepartmentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DepartmentLocalServiceUtil.getService());
        setClass(Department.class);

        setClassLoader(net.opentrends.training.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("departmentid");
    }
}
