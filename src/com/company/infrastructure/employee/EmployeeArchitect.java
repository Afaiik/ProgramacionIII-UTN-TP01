package com.company.infrastructure.employee;

import com.company.common.AppParameters;

public class EmployeeArchitect extends Employee {

    private String enrolmentNumber;

    public EmployeeArchitect(String name, double dni, String phoneNumber, double costDayWork, String enrolmentNumber) {
        super(name, dni, phoneNumber, costDayWork);
        this.enrolmentNumber = enrolmentNumber;
    }

    public EmployeeArchitect(String name, double dni, String phoneNumber, String enrolmentNumber) {
        super(name, dni, phoneNumber, AppParameters.ARCHITECT_COST_DAY_WORK);
        this.enrolmentNumber = enrolmentNumber;
    }

    public String getEnrolmentNumber() {
        return enrolmentNumber;
    }

    public void setEnrolmentNumber(String enrolmentNumber) {
        this.enrolmentNumber = enrolmentNumber;
    }

    //TODO: ToString method

    public String createDrawings(){
        return "I'm creating my next structural drawing";
    }
}
