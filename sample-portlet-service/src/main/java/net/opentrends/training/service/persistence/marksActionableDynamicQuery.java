package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.training.model.marks;
import net.opentrends.training.service.marksLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class marksActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public marksActionableDynamicQuery() throws SystemException {
        setBaseLocalService(marksLocalServiceUtil.getService());
        setClass(marks.class);

        setClassLoader(net.opentrends.training.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
