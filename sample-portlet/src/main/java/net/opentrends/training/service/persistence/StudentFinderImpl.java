package net.opentrends.training.service.persistence;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

import net.opentrends.training.model.Student;

public class StudentFinderImpl extends BasePersistenceImpl<Student> implements StudentFinder{
	private final static Log log = LogFactoryUtil.getLog(StudentFinderImpl.class);

	public static final String customSql = StudentFinder.class.getName()+".findStudentDetails";

	 public List<Object[]> findByGroupId(long groupId, int begin, int end)
	 { 
		 List<Object[]> results = null;
		 Session session = null;
		 try {
			  session = openSession();
			  String sqlQuery = CustomSQLUtil.get(customSql);
				log.info("SQL:-" + sqlQuery);

			  SQLQuery query = session.createSQLQuery(sqlQuery);
			  query.setCacheable(false);
			 // query.addEntity("sample_Student", StudentImpl.class);

		        QueryPos qPos = QueryPos.getInstance(query);  
		        qPos.add(groupId);			   
		        results = (List<Object[]>) QueryUtil.list(query, getDialect(), begin, end);
 
		 } catch (Exception e) {
		        try {
		            throw new SystemException(e);
		        } catch (SystemException se) {
		            se.printStackTrace();
		        }
		    } finally {
		        closeSession(session);
		    }

		    return results;
	 }
}
