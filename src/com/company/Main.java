package com.company;

import com.company.infrastructure.company.Company;
import com.company.infrastructure.construction.Construction;
import com.company.infrastructure.construction.ConstructionCommercialBusiness;
import com.company.infrastructure.construction.ConstructionCommercialHotel;
import com.company.infrastructure.construction.ConstructionDomestic;
import com.company.infrastructure.employee.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        doStuff();
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

    public static void doStuff(){
        /**
         A)  Crear instancias de cada tipo de empleado y mostrar el comportamiento de “construir” (para los obreros y maestros)
         y como es el comportamiento de un arquitecto.
         */
        EmployeeArchitect architect1 =
                new EmployeeArchitect("Arquitecto: Don Perez", 12312322, "2235555555", "Mat Provincial: 12121212");

        EmployeeConstructionMasterBuilder masterBuilder =
                new EmployeeConstructionMasterBuilder("Maestro Mayor: Cacho", 1212121212, "2235505555", 1500, 60);

        EmployeeConstructionBuilder normalBuilder =
                new EmployeeConstructionBuilder("Constructor: Juancito", 3232323232.2112, "223123123123", 1000, 32);

        System.out.println("\n\tA) Create employees and make them work");
        System.out.println("-Architect working:");
        System.out.println(architect1.createDrawings());
        System.out.println("-MasterBuilder building:");
        System.out.println(masterBuilder.build());
        System.out.println("-Builder building:");
        System.out.println(normalBuilder.build());
        System.out.println("\n\t-------------------------\n");

        /**
         B) Crear una nueva empresa con un nombre y asignarle distintos tipos de empleados.
         La empresa tiene: nombre, una lista de empleados y las obras realizadas.
         */
        System.out.println("\tB) Assign the employees to a company\n");
        Company ibm = new Company("International Business Machines Corp.");
        System.out.println("Created company: \"" + ibm.getName()+"\"");
        ibm.addEmployee(architect1);

        ArrayList<Employee> addingAsArray = new ArrayList<Employee>(){{
            add(masterBuilder);
            add(normalBuilder);
        }};
        ibm.addEmployees(addingAsArray);

        System.out.println("Company ToString ->");
        System.out.println(ibm.toString());
        System.out.println("\n\t-------------------------\n");
        /**
         C) Crear al menos una obra por cada tipo distinto que existe, asignando empleados a la obra.
         También se pide ejecutar algún método para saber el costo estimado de la obra.
         */
        System.out.println("\tC) Create different kinds of constructions");

        EmployeeArchitect joseArchitect =
                new EmployeeArchitect("Jose", 12312322, "2235555555", "232321");

        EmployeeConstructionMasterBuilder masterJuan =
                new EmployeeConstructionMasterBuilder("Juan", 1212121212, "2235505555", 1500, 60);

        EmployeeConstructionBuilder mikeBuilder =
                new EmployeeConstructionBuilder("Mike", 3232323232.2112, "223123123123", 1000, 32);

        ArrayList<Employee> employeesForConstruction = new ArrayList<Employee>(){{
            add(joseArchitect);
            add(masterJuan);
            add(mikeBuilder);
        }};

        ConstructionCommercialBusiness commercialBusiness =
                new ConstructionCommercialBusiness("La Perla 123", 123, 500, 120, employeesForConstruction,"The Marta's Grocery", "Grocery");

        ConstructionCommercialHotel commercialHotel =
                new ConstructionCommercialHotel("San Martin 321", 175, 750, 200, employeesForConstruction,"Sheratown", 5);

        ConstructionDomestic domestic =
                new ConstructionDomestic("Av Luro 969", 210, 250, 300, employeesForConstruction, 5);

        System.out.println("-Created construction: " + commercialBusiness.getConstructionName());
        System.out.println("+Estimated cost: " + commercialBusiness.getEstimatedConstructionPrice());

        System.out.println("-Created construction: " + commercialHotel.getConstructionName());
        System.out.println("+Estimated cost: " + commercialHotel.getEstimatedConstructionPrice());

        System.out.println("-Created domestic construction in: " + domestic.getAddress());
        System.out.println("+Estimated cost: " + domestic.getEstimatedConstructionPrice());

        System.out.println("\n\t-------------------------\n");

        /**
         D) Se solicita agregar las obras (del punto anterior) a la lista de la empresa.
         */
        /**
         Solo puede haber UN arquitecto por obra.
         Mínimo UN maestro mayor y un máximo de tres por obra.
         No hay límite para los obreros pero al menos debe haber 2.
         */
        System.out.println("\tD)Add constructions to the company");

        System.out.println("-Adding Constructions....");
        try{
            ibm.addConstruction(commercialBusiness);
        }catch (Exception ex){
            System.out.println("Oops ! Exception catched:");
            System.out.println(ex.getMessage());
            System.out.println();
        }

        System.out.println("-Hiring employees in order to meet the minimum requirements");

        EmployeeConstructionBuilder joshBuilder =
                new EmployeeConstructionBuilder("Josh", 3232323232.2112, "223123123123", 1000, 32);

        commercialBusiness.addEmployee(joshBuilder);
        ibm.addConstruction(commercialBusiness);

        commercialHotel.addEmployee(joshBuilder);
        domestic.addEmployee(joshBuilder);

        ibm.addConstruction(commercialHotel);
        ibm.addConstruction(domestic);

        System.out.println("+Construction " + commercialBusiness.getConstructionName() + " added to " + ibm.getName());
        System.out.println("+Construction " + commercialHotel.getConstructionName() + " added to " + ibm.getName());
        System.out.println("+Construction " + domestic.getAddress() + " added to " + ibm.getName());
        System.out.println("\n\t-------------------------\n");

        /**
         E) Crear un método para recorrer los empleados que trabajan en una obra.
         Mostrando por pantalla los distintos datos particulares de cada empleado.
         */
        System.out.println("\tD)Get details about all the employees");
        System.out.println("-Listing ->");
        System.out.println(commercialBusiness.getEmployeesInformation());
        System.out.println("-Listing 2 ->");
        System.out.println(commercialBusiness.getEmployeesInformation());

        System.out.println("\n\t-------------------------\n");

        /**
         F) Crear un método para listar todas las obras por pantalla con el costo de la obra.
         */
        System.out.println("\tF)Get the price of current constructions in a company");
        System.out.println(ibm.getConstructionsDetails());

    }
}
