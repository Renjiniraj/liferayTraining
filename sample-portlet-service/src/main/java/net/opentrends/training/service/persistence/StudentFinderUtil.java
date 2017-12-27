package net.opentrends.training.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class StudentFinderUtil {
    private static StudentFinder _finder;

    public static java.util.List<java.lang.Object[]> findByGroupId(
        long groupId, int begin, int end) {
        return getFinder().findByGroupId(groupId, begin, end);
    }

    public static StudentFinder getFinder() {
        if (_finder == null) {
            _finder = (StudentFinder) PortletBeanLocatorUtil.locate(net.opentrends.training.service.ClpSerializer.getServletContextName(),
                    StudentFinder.class.getName());

            ReferenceRegistry.registerReference(StudentFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(StudentFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(StudentFinderUtil.class, "_finder");
    }
}
