package com.company.infrastructure.construction;

import com.company.infrastructure.employee.Employee;

import java.util.ArrayList;
import java.util.UUID;

public class ConstructionCommercialBusiness extends ConstructionCommercial{

    private String businessField;

    public ConstructionCommercialBusiness(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, ArrayList<Employee> employees, String constructionName, String businessField) {
        super(address, squareFeet, squareFeetPrice, estimatedConstructionDays, employees, constructionName);
        this.businessField = businessField;
    }

    public ConstructionCommercialBusiness(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, Employee employee, String constructionName, String businessField) {
        super(address, squareFeet, squareFeetPrice, estimatedConstructionDays, employee, constructionName);
        this.businessField = businessField;
    }

    public ConstructionCommercialBusiness(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, String constructionName, String businessField) {
        super(address, squareFeet, squareFeetPrice, estimatedConstructionDays, constructionName);
        this.businessField = businessField;
    }

    public String getBusinessField() {
        return businessField;
    }

    public void setBusinessField(String businessField) {
        this.businessField = businessField;
    }

    //TODO: ToString method
}
