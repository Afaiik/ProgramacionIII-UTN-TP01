package com.company.infrastructure.employee;

public class EmployeeConstructionBuilder extends EmployeeConstruction {

    public EmployeeConstructionBuilder(String name, double dni, String phoneNumber, double costDayWork, int age) {
        super(name, dni, phoneNumber, costDayWork, age);
    }

    //TODO: check builder build implementation
    @Override
    public void build() {
        System.out.println("metodo 'construir' de Constructor pendiente");
    }
}
