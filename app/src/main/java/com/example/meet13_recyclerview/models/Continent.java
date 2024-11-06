package com.example.meet13_recyclerview.models;

import java.util.ArrayList;

public class Continent {
    public int id;
    public String subjectName;
    public ArrayList<Country> countries;

    public Continent(int id, String subjectName, ArrayList<Country> countries) {
        this.id = id;
        this.subjectName = subjectName;
        this.countries = countries;
    }
}