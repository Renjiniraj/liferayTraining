package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.training.model.student;
import net.opentrends.training.service.studentLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class studentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public studentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(studentLocalServiceUtil.getService());
        setClass(student.class);

        setClassLoader(net.opentrends.training.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
