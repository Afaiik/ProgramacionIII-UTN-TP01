package com.company.infrastructure.employee;

public class EmployeeConstructionMasterBuilder extends EmployeeConstruction {
    public EmployeeConstructionMasterBuilder(String name, double dni, String phoneNumber, double costDayWork, int age) {
        super(name, dni, phoneNumber, costDayWork, age);
    }

    //TODO: check MasterBuilder build implementation
    @Override
    public void build() {
        System.out.println("metodo 'construir' de MaestroMayor pendiente");
    }
}
