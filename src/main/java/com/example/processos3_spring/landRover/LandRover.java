package com.example.processos3_spring.landRover;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LandRover {

    private int id;
    private String modelo;
    private String generacion;
    private double precio;
    private double hp;
    private double torque;



}
