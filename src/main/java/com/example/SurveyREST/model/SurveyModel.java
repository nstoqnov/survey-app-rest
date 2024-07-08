package com.example.SurveyREST.model;

public class SurveyModel {
    private int Id;
    private String owner;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
