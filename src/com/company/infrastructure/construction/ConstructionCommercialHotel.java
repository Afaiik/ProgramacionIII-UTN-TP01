package com.company.infrastructure.construction;

import com.company.infrastructure.employee.Employee;

import java.util.ArrayList;
import java.util.UUID;

public class ConstructionCommercialHotel extends ConstructionCommercial{

    private int floorsQuantity;

    public ConstructionCommercialHotel(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, ArrayList<Employee> employees, String constructionName, int floorsQuantity) {
        super(address, squareFeet, squareFeetPrice, estimatedConstructionDays, employees, constructionName);
        this.floorsQuantity = floorsQuantity;
    }

    public ConstructionCommercialHotel(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, Employee employee, String constructionName, int floorsQuantity) {
        super(address, squareFeet, squareFeetPrice, estimatedConstructionDays, employee, constructionName);
        this.floorsQuantity = floorsQuantity;
    }

    public ConstructionCommercialHotel(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, String constructionName, int floorsQuantity) {
        super(address, squareFeet, squareFeetPrice, estimatedConstructionDays, constructionName);
        this.floorsQuantity = floorsQuantity;
    }

    public int getFloorsQuantity() {
        return floorsQuantity;
    }

    public void setFloorsQuantity(int floorsQuantity) {
        this.floorsQuantity = floorsQuantity;
    }

}
