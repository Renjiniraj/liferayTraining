package net.opentrends.training.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.opentrends.training.service.http.departmentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.http.departmentServiceSoap
 * @generated
 */
public class departmentSoap implements Serializable {
    private long _id;
    private String _name;

    public departmentSoap() {
    }

    public static departmentSoap toSoapModel(department model) {
        departmentSoap soapModel = new departmentSoap();

        soapModel.setId(model.getId());
        soapModel.setName(model.getName());

        return soapModel;
    }

    public static departmentSoap[] toSoapModels(department[] models) {
        departmentSoap[] soapModels = new departmentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static departmentSoap[][] toSoapModels(department[][] models) {
        departmentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new departmentSoap[models.length][models[0].length];
        } else {
            soapModels = new departmentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static departmentSoap[] toSoapModels(List<department> models) {
        List<departmentSoap> soapModels = new ArrayList<departmentSoap>(models.size());

        for (department model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new departmentSoap[soapModels.size()]);
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
}
