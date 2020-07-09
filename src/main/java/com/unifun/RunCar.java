package com.unifun;

import lombok.extern.java.Log;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Log

public class RunCar {
    public static void main(String[] args) {

        List<Motor> listMotor = new ArrayList<>();
        Piston piston1 = new Piston();
        Motor motor = new Motor("V1", 2600);
        Motor motor1 = new Motor("A34", 2200);
        Motor motor2 = new Motor("V6", 2000);
        Car car = new Car("Mazda", Color.BLUE, 18, motor);
        listMotor.add(motor);
        listMotor.add(motor1);
        listMotor.add(motor2);
        listMotor.add(car);
        //listMotor.add(piston1);                          Don`t work!
        listMotor.add(new Motor("N1", 2345));
        test(listMotor);




    }


    public static void test(List<? extends Motor> list) {
        list.stream()
                .filter(e -> e.getType()!=null && !e.getType().isEmpty())
                .sorted((Comparator.comparing(Motor::getType)))
                .forEach(e->log.info(e.toString()));
    }
}
