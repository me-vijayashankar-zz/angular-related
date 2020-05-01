package com.infosys.servicedemo.servicedemo.Models;

public class EmployeeModel {

    private String EmployeeID ;
    private String EmployeeName;
    private String EmployeePhoneNos;

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeePhoneNos() {
        return EmployeePhoneNos;
    }

    public void setEmployeePhoneNos(String employeePhoneNos) {
        EmployeePhoneNos = employeePhoneNos;
    }

    public EmployeeModel(String employeeID, String employeeName, String employeePhoneNos) {
        EmployeeID = employeeID;
        EmployeeName = employeeName;
        EmployeePhoneNos = employeePhoneNos;
    }


}