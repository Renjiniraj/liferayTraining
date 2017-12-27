package net.opentrends.training.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.opentrends.training.service.http.StudentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.http.StudentServiceSoap
 * @generated
 */
public class StudentSoap implements Serializable {
    private long _studentid;
    private String _name;
    private long _dept_id;
    private int _rollNo;
    private long _userId;
    private long _groupId;

    public StudentSoap() {
    }

    public static StudentSoap toSoapModel(Student model) {
        StudentSoap soapModel = new StudentSoap();

        soapModel.setStudentid(model.getStudentid());
        soapModel.setName(model.getName());
        soapModel.setDept_id(model.getDept_id());
        soapModel.setRollNo(model.getRollNo());
        soapModel.setUserId(model.getUserId());
        soapModel.setGroupId(model.getGroupId());

        return soapModel;
    }

    public static StudentSoap[] toSoapModels(Student[] models) {
        StudentSoap[] soapModels = new StudentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static StudentSoap[][] toSoapModels(Student[][] models) {
        StudentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new StudentSoap[models.length][models[0].length];
        } else {
            soapModels = new StudentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static StudentSoap[] toSoapModels(List<Student> models) {
        List<StudentSoap> soapModels = new ArrayList<StudentSoap>(models.size());

        for (Student model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new StudentSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _studentid;
    }

    public void setPrimaryKey(long pk) {
        setStudentid(pk);
    }

    public long getStudentid() {
        return _studentid;
    }

    public void setStudentid(long studentid) {
        _studentid = studentid;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public long getDept_id() {
        return _dept_id;
    }

    public void setDept_id(long dept_id) {
        _dept_id = dept_id;
    }

    public int getRollNo() {
        return _rollNo;
    }

    public void setRollNo(int rollNo) {
        _rollNo = rollNo;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }
}
