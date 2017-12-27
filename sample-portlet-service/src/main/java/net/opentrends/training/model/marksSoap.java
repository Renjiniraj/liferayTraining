package net.opentrends.training.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.opentrends.training.service.http.marksServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.http.marksServiceSoap
 * @generated
 */
public class marksSoap implements Serializable {
    private long _id;
    private int _rollNo;
    private int _percentage;
    private long _userId;
    private long _groupId;

    public marksSoap() {
    }

    public static marksSoap toSoapModel(marks model) {
        marksSoap soapModel = new marksSoap();

        soapModel.setId(model.getId());
        soapModel.setRollNo(model.getRollNo());
        soapModel.setPercentage(model.getPercentage());
        soapModel.setUserId(model.getUserId());
        soapModel.setGroupId(model.getGroupId());

        return soapModel;
    }

    public static marksSoap[] toSoapModels(marks[] models) {
        marksSoap[] soapModels = new marksSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static marksSoap[][] toSoapModels(marks[][] models) {
        marksSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new marksSoap[models.length][models[0].length];
        } else {
            soapModels = new marksSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static marksSoap[] toSoapModels(List<marks> models) {
        List<marksSoap> soapModels = new ArrayList<marksSoap>(models.size());

        for (marks model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new marksSoap[soapModels.size()]);
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

    public int getRollNo() {
        return _rollNo;
    }

    public void setRollNo(int rollNo) {
        _rollNo = rollNo;
    }

    public int getPercentage() {
        return _percentage;
    }

    public void setPercentage(int percentage) {
        _percentage = percentage;
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
