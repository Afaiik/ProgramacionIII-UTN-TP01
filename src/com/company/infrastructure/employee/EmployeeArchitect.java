package com.company.infrastructure.employee;

public class EmployeeArchitect extends Employee {

    private String enrolmentNumber;

    public EmployeeArchitect(String name, double dni, String phoneNumber, double costDayWork, String enrolmentNumber) {
        super(name, dni, phoneNumber, costDayWork);
        this.enrolmentNumber = enrolmentNumber;
    }

    public String getEnrolmentNumber() {
        return enrolmentNumber;
    }

    public void setEnrolmentNumber(String enrolmentNumber) {
        this.enrolmentNumber = enrolmentNumber;
    }

    //TODO: ToString method


    //TODO: CrearPlanos method
    public void CrearPlanos(){
        System.out.println("Crear planos por implementar");
    }
}
