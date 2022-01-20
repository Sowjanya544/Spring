package com.dxc.model;

public class Student {

    private int id;
    private String name;
    private String sub;
    private String idn;

    public Student () {}


    public Student (int id, String name, String sub, String idn) {
        this.id = id;
        this.name = name;
        this.sub = sub;
        this.idn = idn;
    }

    public Student (String name, String sub, String idn) {
        this.name = name;
        this.sub = sub;
        this.idn= idn;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSub() {
        return sub;
    }


    public void setSub(String sub) {
        this.sub = sub;
    }


    public String getIdn() {
        return idn;
    }


    public void setIdn(String idn) {
        this.idn = idn;
    }


    @Override
    public String toString() {
        return "Student  - " + getId() +" : " + getName() + " by " + getSub() + " (" + getIdn() + ")";
    }

}
