package com.geekster.springbootannotation.MyObjects;

public class Car {

    private String color;

    public Car(String color) {
        this.color = color;
        System.out.println("Inside "+ this.color + " Car Constructor...object must have been created!!!!!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
