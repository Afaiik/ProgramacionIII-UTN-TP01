package com.company.infrastructure.company;

import com.company.infrastructure.construction.Construction;

import java.util.ArrayList;
import java.util.UUID;

public class Company {
    private UUID id;
    private String name;
    private ArrayList<Construction> constructions;

    public Company(UUID id, String name, Construction construction) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.constructions = new ArrayList<Construction>();
        this.constructions.add(construction);
    }

    public Company(UUID id, String name, ArrayList<Construction> constructionsArray) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.constructions = constructionsArray;
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
        this.constructions = construction;
    }

    public void addConstruction(Construction construction) {
        this.constructions.add(construction);
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
}
