package net.opentrends.training.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.opentrends.training.service.http.studentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.http.studentServiceSoap
 * @generated
 */
public class studentSoap implements Serializable {
    private long _id;
    private String _name;
    private long _dept_id;
    private int _rollNo;
    private long _userId;
    private long _groupId;

    public studentSoap() {
    }

    public static studentSoap toSoapModel(student model) {
        studentSoap soapModel = new studentSoap();

        soapModel.setId(model.getId());
        soapModel.setName(model.getName());
        soapModel.setDept_id(model.getDept_id());
        soapModel.setRollNo(model.getRollNo());
        soapModel.setUserId(model.getUserId());
        soapModel.setGroupId(model.getGroupId());

        return soapModel;
    }

    public static studentSoap[] toSoapModels(student[] models) {
        studentSoap[] soapModels = new studentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static studentSoap[][] toSoapModels(student[][] models) {
        studentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new studentSoap[models.length][models[0].length];
        } else {
            soapModels = new studentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static studentSoap[] toSoapModels(List<student> models) {
        List<studentSoap> soapModels = new ArrayList<studentSoap>(models.size());

        for (student model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new studentSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
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
