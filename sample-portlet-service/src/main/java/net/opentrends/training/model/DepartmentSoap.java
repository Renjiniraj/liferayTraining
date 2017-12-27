package net.opentrends.training.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.opentrends.training.service.http.DepartmentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.http.DepartmentServiceSoap
 * @generated
 */
public class DepartmentSoap implements Serializable {
    private long _departmentid;
    private String _deptName;

    public DepartmentSoap() {
    }

    public static DepartmentSoap toSoapModel(Department model) {
        DepartmentSoap soapModel = new DepartmentSoap();

        soapModel.setDepartmentid(model.getDepartmentid());
        soapModel.setDeptName(model.getDeptName());

        return soapModel;
    }

    public static DepartmentSoap[] toSoapModels(Department[] models) {
        DepartmentSoap[] soapModels = new DepartmentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DepartmentSoap[][] toSoapModels(Department[][] models) {
        DepartmentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DepartmentSoap[models.length][models[0].length];
        } else {
            soapModels = new DepartmentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DepartmentSoap[] toSoapModels(List<Department> models) {
        List<DepartmentSoap> soapModels = new ArrayList<DepartmentSoap>(models.size());

        for (Department model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DepartmentSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _departmentid;
    }

    public void setPrimaryKey(long pk) {
        setDepartmentid(pk);
    }

    public long getDepartmentid() {
        return _departmentid;
    }

    public void setDepartmentid(long departmentid) {
        _departmentid = departmentid;
    }

    public String getDeptName() {
        return _deptName;
    }

    public void setDeptName(String deptName) {
        _deptName = deptName;
    }
}
