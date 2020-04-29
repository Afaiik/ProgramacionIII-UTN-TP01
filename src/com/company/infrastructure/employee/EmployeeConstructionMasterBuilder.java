package com.company.infrastructure.employee;

import com.company.common.AppParameters;
import com.company.interfaces.EmployeeConstructionMandatoryMethods;

public class EmployeeConstructionMasterBuilder extends EmployeeConstruction  implements EmployeeConstructionMandatoryMethods {

    public EmployeeConstructionMasterBuilder(String name, double dni, String phoneNumber, double costDayWork, int age) {
        super(name, dni, phoneNumber, costDayWork, age);
    }

    public EmployeeConstructionMasterBuilder(String name, double dni, String phoneNumber, int age) {
        super(name, dni, phoneNumber, AppParameters.MASTER_BUILDER_COST_DAY_WORK, age);
    }

    //TODO: check MasterBuilder build implementation
    @Override
    public void build() {
        System.out.println("I'm a Master Builder and i keep everything in order");
    }
}
