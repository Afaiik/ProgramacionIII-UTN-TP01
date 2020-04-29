package com.company;

import com.company.infrastructure.company.Company;
import com.company.infrastructure.construction.Construction;
import com.company.infrastructure.construction.ConstructionCommercialBusiness;
import com.company.infrastructure.employee.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        firstTests();
    }

    public static void firstTests(){

        Company emmsa = new Company("Emmsa S.A.");


        Employee masterBuilder =
                new EmployeeConstructionMasterBuilder("Maestro Mayor: Cacho", 1212121212, "2235505555", 1500, 60);

        Employee normalBuilder =
                new EmployeeConstructionBuilder("Constructor: Juancito", 3232323232.2112, "223123123123", 1000, 32);

        Employee architect =
                new EmployeeArchitect("Arquitecto: Don Perez", 12312322, "2235555555", "Mat Provincial: 12121212");

        ArrayList<Employee> arrayEmpleados = new ArrayList<>();
        arrayEmpleados.add(architect);
        arrayEmpleados.add(masterBuilder);
        arrayEmpleados.add(masterBuilder);
        arrayEmpleados.add(masterBuilder);
        arrayEmpleados.add(normalBuilder);
        arrayEmpleados.add(normalBuilder);
        arrayEmpleados.add(normalBuilder);

        Construction constructionPerla =
                new ConstructionCommercialBusiness("La Perla 123", 123, 500, 120, arrayEmpleados,"Construction Cool Name", "Grocery");

        System.out.println("Cantidad arquitectos -> " + constructionPerla.getArchitectsQuantityInConstruction());
        System.out.println("Cantidad MaestrosObra -> " + constructionPerla.getMasterBuildersQuantityInConstruction());
        System.out.println("Cantidad Obreros -> " + constructionPerla.getBuildersQuantityInConstruction());

        emmsa.addConstruction(constructionPerla);


    }

}
