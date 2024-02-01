package com.example.processos3_spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//usamos loombok para no tener que escribir getters y setters
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bmw {

    private int id;
    private String modelo;
    private String generacion;
    private double precio;
    private double hp;
    private double torque;


}
