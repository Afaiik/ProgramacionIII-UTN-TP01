package com.company.infrastructure.company;

import com.company.common.AppParameters;
import com.company.infrastructure.construction.Construction;
import com.company.infrastructure.employee.Employee;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.UUID;

public class Company {
    private UUID id;
    private String name;
    private ArrayList<Construction> constructions;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.constructions = new ArrayList<Construction>();
        this.employees = new ArrayList<Employee>();
    }

    public Company(String name, Construction construction) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.constructions = new ArrayList<Construction>();
        this.addConstruction(construction);
        this.employees = new ArrayList<Employee>();
    }

    public Company(String name, ArrayList<Construction> constructionsArray) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.setConstruction(constructionsArray);
        this.employees = new ArrayList<Employee>();
    }

    public Company(String name, ArrayList<Construction> constructionsArray, ArrayList<Employee> employees) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.setConstruction(constructionsArray);
        this.employees = employees;
    }

    public Company(String name, ArrayList<Construction> constructionsArray, Employee employee) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.setConstruction(constructionsArray);
        this.employees = new ArrayList<Employee>();
        this.employees.add(employee);
    }

    public Company(String name, Construction constructions, Employee employee) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.addConstruction(constructions);
        this.employees = new ArrayList<Employee>();
        this.employees.add(employee);
    }


    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Construction> getConstructions() {
        return constructions;
    }

    public void setConstruction(ArrayList<Construction> construction) {
        boolean validArray = construction.stream().allMatch(this::checkConstructionEmployeesRequirements);
        if(validArray)
            this.constructions = construction;
        else
            throw new InvalidParameterException(AppParameters.CONSTRUCTION_REQUIREMENTS_ERROR);
    }

    public void addConstructions(ArrayList<Construction> constructions) {
        boolean validArray = constructions.stream().allMatch(this::checkConstructionEmployeesRequirements);
        if(validArray)
            this.constructions.addAll(constructions);
        else
            throw new InvalidParameterException(AppParameters.CONSTRUCTION_REQUIREMENTS_ERROR);
    }

    public void addConstruction(Construction construction) {
        if(checkConstructionEmployeesRequirements(construction))
            this.constructions.add(construction);
        else
            throw new InvalidParameterException(AppParameters.CONSTRUCTION_REQUIREMENTS_ERROR);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void addEmployees(ArrayList<Employee> employees) {
        this.employees.addAll(employees);
    }


    //TODO:Arreglar tostring por lista
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", construction=[" + constructions +
                "]}";
    }

    public String getConstructionsDetails(){
        String ret = "Constructions in \"" + this.getName() + "\" Company";
        for(Construction item : this.constructions){
            ret += "\n\tConstruction \n" +
                    "Id_________________: " + item.getId() + "\n" +
                    "Address____________: " + item.getAddress() + "\n" +
                    "Square Feet________: " + item.getSquareFeet() + "\n" +
                    "Square Feet Price__: " + item.getSquareFeetPrice() + "\n" +
                    "Est. Const. Days___: " + item.getEstimatedConstructionDays() + "\n" +
                    "Employees Count____: " + item.getEmployees().size() + "\n" +
                    "Est. Const. Price__: " + item.getEstimatedConstructionPrice() + "\n";
        }
        return ret;
    }

    private boolean checkConstructionEmployeesRequirements(Construction construction){
        int architects = construction.getArchitectsQuantityInConstruction();
        int builders = construction.getBuildersQuantityInConstruction();
        int masterBuilders = construction.getMasterBuildersQuantityInConstruction();

        boolean architectsOk = architects >= AppParameters.MIN_ARCHITECTS_IN_CONSTRUCTION && architects <= AppParameters.MAX_ARCHITECTS_IN_CONSTRUCTION;
        boolean masterBuildersOk = masterBuilders >= AppParameters.MIN_MASTER_BUILDER_IN_CONSTRUCTION && masterBuilders <= AppParameters.MAX_MASTER_BUILDER_IN_CONSTRUCTION;
        boolean buildersOk = builders >= AppParameters.MIN_BUILDER_IN_CONSTRUCTION;

        return architectsOk && masterBuildersOk && buildersOk;
    }

}
