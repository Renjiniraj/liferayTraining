package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.training.model.department;
import net.opentrends.training.service.departmentLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class departmentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public departmentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(departmentLocalServiceUtil.getService());
        setClass(department.class);

        setClassLoader(net.opentrends.training.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
