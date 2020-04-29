package com.company.infrastructure.construction;

import com.company.infrastructure.employee.Employee;

import java.util.ArrayList;
import java.util.UUID;

public class ConstructionDomestic extends Construction {
    private int roomsQuantity;

    public ConstructionDomestic(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, ArrayList<Employee> employees, int roomsQuantity) {
        super(address, squareFeet, squareFeetPrice, estimatedConstructionDays, employees);
        this.roomsQuantity = roomsQuantity;
    }

    public ConstructionDomestic(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, Employee employee, int roomsQuantity) {
        super(address, squareFeet, squareFeetPrice, estimatedConstructionDays, employee);
        this.roomsQuantity = roomsQuantity;
    }

    public ConstructionDomestic(String address, float squareFeet, float squareFeetPrice, int estimatedConstructionDays, int roomsQuantity) {
        super(address, squareFeet, squareFeetPrice, estimatedConstructionDays);
        this.roomsQuantity = roomsQuantity;
    }

    public int getRoomsQuantity() {
        return roomsQuantity;
    }

    public void setRoomsQuantity(int roomsQuantity) {
        this.roomsQuantity = roomsQuantity;
    }

    //TODO: Tostring method
}
