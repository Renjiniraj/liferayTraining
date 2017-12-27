package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.training.model.Student1;
import net.opentrends.training.service.Student1LocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class Student1ActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Student1ActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Student1LocalServiceUtil.getService());
        setClass(Student1.class);

        setClassLoader(net.opentrends.training.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("studentid");
    }
}
