package org.geekster;

import org.springframework.stereotype.Component;

@Component
public class Car {

    String color = "Red";

    public Car() {
        this.color = color;
        System.out.println("Car object made on its own");
    }

    public String getColour() {
        return color;
    }
}
