package net.opentrends.training.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.opentrends.training.service.http.EmployeeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.http.EmployeeServiceSoap
 * @generated
 */
public class EmployeeSoap implements Serializable {
    private long _empId;
    private String _employeeName;
    private int _age;
    private long _salary;
    private long _fileEntryId;
    private String _unit;

    public EmployeeSoap() {
    }

    public static EmployeeSoap toSoapModel(Employee model) {
        EmployeeSoap soapModel = new EmployeeSoap();

        soapModel.setEmpId(model.getEmpId());
        soapModel.setEmployeeName(model.getEmployeeName());
        soapModel.setAge(model.getAge());
        soapModel.setSalary(model.getSalary());
        soapModel.setFileEntryId(model.getFileEntryId());
        soapModel.setUnit(model.getUnit());

        return soapModel;
    }

    public static EmployeeSoap[] toSoapModels(Employee[] models) {
        EmployeeSoap[] soapModels = new EmployeeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[][] toSoapModels(Employee[][] models) {
        EmployeeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EmployeeSoap[models.length][models[0].length];
        } else {
            soapModels = new EmployeeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[] toSoapModels(List<Employee> models) {
        List<EmployeeSoap> soapModels = new ArrayList<EmployeeSoap>(models.size());

        for (Employee model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EmployeeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _empId;
    }

    public void setPrimaryKey(long pk) {
        setEmpId(pk);
    }

    public long getEmpId() {
        return _empId;
    }

    public void setEmpId(long empId) {
        _empId = empId;
    }

    public String getEmployeeName() {
        return _employeeName;
    }

    public void setEmployeeName(String employeeName) {
        _employeeName = employeeName;
    }

    public int getAge() {
        return _age;
    }

    public void setAge(int age) {
        _age = age;
    }

    public long getSalary() {
        return _salary;
    }

    public void setSalary(long salary) {
        _salary = salary;
    }

    public long getFileEntryId() {
        return _fileEntryId;
    }

    public void setFileEntryId(long fileEntryId) {
        _fileEntryId = fileEntryId;
    }

    public String getUnit() {
        return _unit;
    }

    public void setUnit(String unit) {
        _unit = unit;
    }
}
