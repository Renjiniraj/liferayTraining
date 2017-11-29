package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.training.model.Student;
import net.opentrends.training.service.StudentLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class StudentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public StudentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(StudentLocalServiceUtil.getService());
        setClass(Student.class);

        setClassLoader(net.opentrends.training.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("studentid");
    }
}
