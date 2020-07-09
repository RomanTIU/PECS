package com.unifun;

import lombok.*;

@Getter
@Setter
@ToString

public class Motor extends Piston  {
    private String type;
    private int power;
    public Motor(){}

    public Motor(String type, int power) {
        this.type = type;
        this.power = power;
    }
}
