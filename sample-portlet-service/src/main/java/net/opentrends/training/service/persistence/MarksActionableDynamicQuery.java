package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.training.model.Marks;
import net.opentrends.training.service.MarksLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class MarksActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MarksActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MarksLocalServiceUtil.getService());
        setClass(Marks.class);

        setClassLoader(net.opentrends.training.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("marksid");
    }
}
