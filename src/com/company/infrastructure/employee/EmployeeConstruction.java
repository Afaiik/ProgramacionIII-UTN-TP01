package com.company.infrastructure.employee;

import com.company.interfaces.EmployeeConstructionMandatoryMethods;

public abstract class EmployeeConstruction extends Employee {
    private int age;

    public EmployeeConstruction(String name, double dni, String phoneNumber, double costDayWork, int age) {
        super(name, dni, phoneNumber, costDayWork);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //TODO: ToString method

}
