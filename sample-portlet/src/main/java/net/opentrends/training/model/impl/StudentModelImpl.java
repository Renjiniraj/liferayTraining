package net.opentrends.training.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import net.opentrends.training.model.Student;
import net.opentrends.training.model.StudentModel;
import net.opentrends.training.model.StudentSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Student service. Represents a row in the &quot;sample_Student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link net.opentrends.training.model.StudentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StudentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentImpl
 * @see net.opentrends.training.model.Student
 * @see net.opentrends.training.model.StudentModel
 * @generated
 */
@JSON(strict = true)
public class StudentModelImpl extends BaseModelImpl<Student>
    implements StudentModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a student model instance should use the {@link net.opentrends.training.model.Student} interface instead.
     */
    public static final String TABLE_NAME = "sample_Student";
    public static final Object[][] TABLE_COLUMNS = {
            { "studentid", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "dept_id", Types.BIGINT },
            { "rollNo", Types.INTEGER },
            { "userId", Types.BIGINT },
            { "groupId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table sample_Student (studentid LONG not null primary key,name VARCHAR(75) null,dept_id LONG,rollNo INTEGER,userId LONG,groupId LONG)";
    public static final String TABLE_SQL_DROP = "drop table sample_Student";
    public static final String ORDER_BY_JPQL = " ORDER BY student.studentid ASC";
    public static final String ORDER_BY_SQL = " ORDER BY sample_Student.studentid ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.net.opentrends.training.model.Student"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.net.opentrends.training.model.Student"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.net.opentrends.training.model.Student"));
    private static ClassLoader _classLoader = Student.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Student.class
        };
    private long _studentid;
    private String _name;
    private long _dept_id;
    private int _rollNo;
    private long _userId;
    private String _userUuid;
    private long _groupId;
    private Student _escapedModel;

    public StudentModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Student toModel(StudentSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Student model = new StudentImpl();

        model.setStudentid(soapModel.getStudentid());
        model.setName(soapModel.getName());
        model.setDept_id(soapModel.getDept_id());
        model.setRollNo(soapModel.getRollNo());
        model.setUserId(soapModel.getUserId());
        model.setGroupId(soapModel.getGroupId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Student> toModels(StudentSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Student> models = new ArrayList<Student>(soapModels.length);

        for (StudentSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _studentid;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setStudentid(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _studentid;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Student.class;
    }

    @Override
    public String getModelClassName() {
        return Student.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("studentid", getStudentid());
        attributes.put("name", getName());
        attributes.put("dept_id", getDept_id());
        attributes.put("rollNo", getRollNo());
        attributes.put("userId", getUserId());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long studentid = (Long) attributes.get("studentid");

        if (studentid != null) {
            setStudentid(studentid);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Long dept_id = (Long) attributes.get("dept_id");

        if (dept_id != null) {
            setDept_id(dept_id);
        }

        Integer rollNo = (Integer) attributes.get("rollNo");

        if (rollNo != null) {
            setRollNo(rollNo);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }
    }

    @JSON
    @Override
    public long getStudentid() {
        return _studentid;
    }

    @Override
    public void setStudentid(long studentid) {
        _studentid = studentid;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @JSON
    @Override
    public long getDept_id() {
        return _dept_id;
    }

    @Override
    public void setDept_id(long dept_id) {
        _dept_id = dept_id;
    }

    @JSON
    @Override
    public int getRollNo() {
        return _rollNo;
    }

    @Override
    public void setRollNo(int rollNo) {
        _rollNo = rollNo;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Student.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Student toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Student) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        StudentImpl studentImpl = new StudentImpl();

        studentImpl.setStudentid(getStudentid());
        studentImpl.setName(getName());
        studentImpl.setDept_id(getDept_id());
        studentImpl.setRollNo(getRollNo());
        studentImpl.setUserId(getUserId());
        studentImpl.setGroupId(getGroupId());

        studentImpl.resetOriginalValues();

        return studentImpl;
    }

    @Override
    public int compareTo(Student student) {
        long primaryKey = student.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student student = (Student) obj;

        long primaryKey = student.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Student> toCacheModel() {
        StudentCacheModel studentCacheModel = new StudentCacheModel();

        studentCacheModel.studentid = getStudentid();

        studentCacheModel.name = getName();

        String name = studentCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            studentCacheModel.name = null;
        }

        studentCacheModel.dept_id = getDept_id();

        studentCacheModel.rollNo = getRollNo();

        studentCacheModel.userId = getUserId();

        studentCacheModel.groupId = getGroupId();

        return studentCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{studentid=");
        sb.append(getStudentid());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", dept_id=");
        sb.append(getDept_id());
        sb.append(", rollNo=");
        sb.append(getRollNo());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.training.model.Student");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>studentid</column-name><column-value><![CDATA[");
        sb.append(getStudentid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dept_id</column-name><column-value><![CDATA[");
        sb.append(getDept_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rollNo</column-name><column-value><![CDATA[");
        sb.append(getRollNo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
