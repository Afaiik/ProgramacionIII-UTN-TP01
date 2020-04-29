package com.company.infrastructure.employee;

import java.util.UUID;

public abstract class Employee {

    public UUID id;
    public String name;
    public double dni;
    public String phoneNumber;
    public double costDayWork;

    public Employee(String name, double dni, String phoneNumber, double costDayWork) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.dni = dni;
        this.phoneNumber = phoneNumber;
        this.costDayWork = costDayWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getCostDayWork() {
        return costDayWork;
    }

    public void setCostDayWork(double costDayWork) {
        this.costDayWork = costDayWork;
    }

    //TODO: ToString method

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dni=" + dni +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", costDayWork=" + costDayWork +
                '}';
    }
}
