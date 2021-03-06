package net.opentrends.training.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.training.model.Student1;
import net.opentrends.training.service.Student1LocalServiceUtil;

/**
 * The extended model base implementation for the Student1 service. Represents a row in the &quot;sample_Student1&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Student1Impl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student1Impl
 * @see net.opentrends.training.model.Student1
 * @generated
 */
public abstract class Student1BaseImpl extends Student1ModelImpl
    implements Student1 {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a student1 model instance should use the {@link Student1} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Student1LocalServiceUtil.addStudent1(this);
        } else {
            Student1LocalServiceUtil.updateStudent1(this);
        }
    }
}
