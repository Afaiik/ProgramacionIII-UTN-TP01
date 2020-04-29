package com.company.infrastructure.company;

import com.company.common.AppParameters;
import com.company.infrastructure.construction.Construction;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.UUID;

public class Company {
    private UUID id;
    private String name;
    private ArrayList<Construction> constructions;

    public Company(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.constructions = new ArrayList<Construction>();
    }

    public Company(String name, Construction construction) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.constructions = new ArrayList<Construction>();
        this.addConstruction(construction);
    }

    public Company(String name, ArrayList<Construction> constructionsArray) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.setConstruction(constructionsArray);
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

    public void addConstruction(Construction construction) {
        if(checkConstructionEmployeesRequirements(construction))
            this.constructions.add(construction);
        else
            throw new InvalidParameterException(AppParameters.CONSTRUCTION_REQUIREMENTS_ERROR);
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
