package com.unifun;

import lombok.*;

import java.awt.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
class Car extends Motor {
    private String name;
    private Color color;
    private int wheels;
    private Motor motor;


    public Car(String name, Color color, int wheels, Motor motor) {
        super(motor.getType(), motor.getPower());
        this.name = name;
        this.color = color;
        this.wheels = wheels;
        this.motor = motor;


    }


}
