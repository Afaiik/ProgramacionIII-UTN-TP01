package com.company.infrastructure.construction;

import com.company.infrastructure.employee.Employee;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Construction {

    private UUID id;
    private String address;
    private float squareFeet;
    private float squareFeetPrice;
    private int estimatedConstructionDays;
    private ArrayList<Employee> employees;

    public Construction(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, ArrayList<Employee> employees) {
        this.id = UUID.randomUUID();
        this.address = address;
        this.squareFeet = squareFeet;
        this.squareFeetPrice = squareFeetPrice;
        this.estimatedConstructionDays = estimatedConstructionDays;
        this.employees = employees;
    }

    public Construction(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, Employee employee) {
        this.id = UUID.randomUUID();
        this.address = address;
        this.squareFeet = squareFeet;
        this.squareFeetPrice = squareFeetPrice;
        this.estimatedConstructionDays = estimatedConstructionDays;
        this.employees = new ArrayList<Employee>();
        this.employees.add(employee);
    }

    public UUID getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(float squareFeet) {
        this.squareFeet = squareFeet;
    }

    public float getSquareFeetPrice() {
        return squareFeetPrice;
    }

    public void setSquareFeetPrice(float squareFeetPrice) {
        this.squareFeetPrice = squareFeetPrice;
    }

    public int getEstimatedConstructionDays() {
        return estimatedConstructionDays;
    }

    public void setEstimatedConstructionDays(int estimatedConstructionDays) {
        this.estimatedConstructionDays = estimatedConstructionDays;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
    //TODO:Arreglar tostring por lista
    @Override
    public String toString() {
        return "Construction{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", squareFeet=" + squareFeet +
                ", squareFeetPrice=" + squareFeetPrice +
                ", estimatedConstructionDays=" + estimatedConstructionDays +
                ", employees=" + employees +
                '}';
    }

    //TODO: CalcularPrecioEstimado


}
