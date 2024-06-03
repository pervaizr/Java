package com.InheritanceChallengeWorker;

public class Employee extends Worker{

    private long    employeeID;
    private String  hireDate;
    private static int employeeNo = 745;

    public Employee(){

    }
    public Employee(String name, String birthDate,  String hireDate) {
        super(name, birthDate);
        this.employeeID = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
