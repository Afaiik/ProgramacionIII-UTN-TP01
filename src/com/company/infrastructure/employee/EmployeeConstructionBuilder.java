package com.company.infrastructure.employee;

import com.company.common.AppParameters;
import com.company.interfaces.EmployeeConstructionMandatoryMethods;

public class EmployeeConstructionBuilder extends EmployeeConstruction  implements EmployeeConstructionMandatoryMethods {

    public EmployeeConstructionBuilder(String name, double dni, String phoneNumber, double costDayWork, int age) {
        super(name, dni, phoneNumber, costDayWork, age);
    }

    public EmployeeConstructionBuilder(String name, double dni, String phoneNumber, int age) {
        super(name, dni, phoneNumber, AppParameters.BUILDER_COST_DAY_WORK, age);
    }

    //TODO: check builder build implementation
    @Override
    public void build() {
        System.out.println("I'm a Builder and i build ! (obviously)");
    }
}
