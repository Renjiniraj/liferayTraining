package net.opentrends.training.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.opentrends.training.service.http.MarksServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.http.MarksServiceSoap
 * @generated
 */
public class MarksSoap implements Serializable {
    private long _marksid;
    private int _rollNo;
    private int _percentage;
    private long _userId;
    private long _groupId;

    public MarksSoap() {
    }

    public static MarksSoap toSoapModel(Marks model) {
        MarksSoap soapModel = new MarksSoap();

        soapModel.setMarksid(model.getMarksid());
        soapModel.setRollNo(model.getRollNo());
        soapModel.setPercentage(model.getPercentage());
        soapModel.setUserId(model.getUserId());
        soapModel.setGroupId(model.getGroupId());

        return soapModel;
    }

    public static MarksSoap[] toSoapModels(Marks[] models) {
        MarksSoap[] soapModels = new MarksSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static MarksSoap[][] toSoapModels(Marks[][] models) {
        MarksSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new MarksSoap[models.length][models[0].length];
        } else {
            soapModels = new MarksSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static MarksSoap[] toSoapModels(List<Marks> models) {
        List<MarksSoap> soapModels = new ArrayList<MarksSoap>(models.size());

        for (Marks model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new MarksSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _marksid;
    }

    public void setPrimaryKey(long pk) {
        setMarksid(pk);
    }

    public long getMarksid() {
        return _marksid;
    }

    public void setMarksid(long marksid) {
        _marksid = marksid;
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
