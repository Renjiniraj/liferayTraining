package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.training.model.Manager;
import net.opentrends.training.service.ManagerLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ManagerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ManagerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ManagerLocalServiceUtil.getService());
        setClass(Manager.class);

        setClassLoader(net.opentrends.training.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("manageentryID");
    }
}
