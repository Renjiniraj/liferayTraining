package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class studentFinderUtil {
    private static studentFinder _finder;

    public static java.util.List<net.opentrends.training.model.student> getStudentDetails() {
        return getFinder().getStudentDetails();
    }

    public static studentFinder getFinder() {
        if (_finder == null) {
            _finder = (studentFinder) PortletBeanLocatorUtil.locate(net.opentrends.training.service.ClpSerializer.getServletContextName(),
                    studentFinder.class.getName());

            ReferenceRegistry.registerReference(studentFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(studentFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(studentFinderUtil.class, "_finder");
    }
}
