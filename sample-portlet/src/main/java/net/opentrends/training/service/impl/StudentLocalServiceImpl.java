package net.opentrends.training.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.training.model.Student;
import net.opentrends.training.service.base.StudentLocalServiceBaseImpl;
import net.opentrends.training.service.persistence.StudentFinderUtil;

/**
 * The implementation of the student local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.opentrends.training.service.studentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.base.studentLocalServiceBaseImpl
 * @see net.opentrends.training.service.studentLocalServiceUtil
 */
public class StudentLocalServiceImpl extends StudentLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link net.opentrends.training.service.studentLocalServiceUtil} to access the student local service.
     */
	public List<Object[]> findByGroupId(long groupId, int begin, int end)throws SystemException
	 {
		return StudentFinderUtil.findByGroupId(groupId, begin, end);
	 }
	
}
