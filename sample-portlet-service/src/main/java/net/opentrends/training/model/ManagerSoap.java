package net.opentrends.training.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManagerSoap implements Serializable {
    private long _manageentryID;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _lastModifiedDate;
    private String _managerID;
    private String _managerName;

    public ManagerSoap() {
    }

    public static ManagerSoap toSoapModel(Manager model) {
        ManagerSoap soapModel = new ManagerSoap();

        soapModel.setManageentryID(model.getManageentryID());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setLastModifiedDate(model.getLastModifiedDate());
        soapModel.setManagerID(model.getManagerID());
        soapModel.setManagerName(model.getManagerName());

        return soapModel;
    }

    public static ManagerSoap[] toSoapModels(Manager[] models) {
        ManagerSoap[] soapModels = new ManagerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ManagerSoap[][] toSoapModels(Manager[][] models) {
        ManagerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ManagerSoap[models.length][models[0].length];
        } else {
            soapModels = new ManagerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ManagerSoap[] toSoapModels(List<Manager> models) {
        List<ManagerSoap> soapModels = new ArrayList<ManagerSoap>(models.size());

        for (Manager model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ManagerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _manageentryID;
    }

    public void setPrimaryKey(long pk) {
        setManageentryID(pk);
    }

    public long getManageentryID() {
        return _manageentryID;
    }

    public void setManageentryID(long manageentryID) {
        _manageentryID = manageentryID;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public Date getLastModifiedDate() {
        return _lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        _lastModifiedDate = lastModifiedDate;
    }

    public String getManagerID() {
        return _managerID;
    }

    public void setManagerID(String managerID) {
        _managerID = managerID;
    }

    public String getManagerName() {
        return _managerName;
    }

    public void setManagerName(String managerName) {
        _managerName = managerName;
    }
}
