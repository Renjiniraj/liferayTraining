package net.opentrends.training.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.opentrends.training.service.http.Student1ServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.http.Student1ServiceSoap
 * @generated
 */
public class Student1Soap implements Serializable {
    private long _studentid;
    private String _fname;
    private String _lname;
    private int _age;
    private String _branch;
    private String _email;

    public Student1Soap() {
    }

    public static Student1Soap toSoapModel(Student1 model) {
        Student1Soap soapModel = new Student1Soap();

        soapModel.setStudentid(model.getStudentid());
        soapModel.setFname(model.getFname());
        soapModel.setLname(model.getLname());
        soapModel.setAge(model.getAge());
        soapModel.setBranch(model.getBranch());
        soapModel.setEmail(model.getEmail());

        return soapModel;
    }

    public static Student1Soap[] toSoapModels(Student1[] models) {
        Student1Soap[] soapModels = new Student1Soap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Student1Soap[][] toSoapModels(Student1[][] models) {
        Student1Soap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Student1Soap[models.length][models[0].length];
        } else {
            soapModels = new Student1Soap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Student1Soap[] toSoapModels(List<Student1> models) {
        List<Student1Soap> soapModels = new ArrayList<Student1Soap>(models.size());

        for (Student1 model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Student1Soap[soapModels.size()]);
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

    public String getFname() {
        return _fname;
    }

    public void setFname(String fname) {
        _fname = fname;
    }

    public String getLname() {
        return _lname;
    }

    public void setLname(String lname) {
        _lname = lname;
    }

    public int getAge() {
        return _age;
    }

    public void setAge(int age) {
        _age = age;
    }

    public String getBranch() {
        return _branch;
    }

    public void setBranch(String branch) {
        _branch = branch;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }
}
