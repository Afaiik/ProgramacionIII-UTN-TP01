package com.company.infrastructure.construction;

import com.company.infrastructure.employee.Employee;

import java.util.ArrayList;
import java.util.UUID;

public abstract class ConstructionCommercial extends Construction {
    private String constructionName;

    public ConstructionCommercial(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, ArrayList<Employee> employees, String constructionName) {
        super(address, squareFeet, squareFeetPrice, estimatedConstructionDays, employees);
        this.constructionName = constructionName;
    }

    public ConstructionCommercial(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, Employee employee, String constructionName) {
        super(address, squareFeet, squareFeetPrice, estimatedConstructionDays, employee);
        this.constructionName = constructionName;
    }

    public String getConstructionName() {
        return constructionName;
    }

    public void setConstructionName(String constructionName) {
        this.constructionName = constructionName;
    }

    //TODO: Tostring method
}
