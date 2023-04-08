package com.bhavik.students.model;

public class Car {

    private String name;
    private String model;


    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car() {

    }

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }
}
