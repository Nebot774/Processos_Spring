package com.example.processos3_spring.bmw;

import com.example.processos3_spring.bmw.Bmw;

import java.util.List;

public interface IBmwService {

    // Método para encontrar todos los BMWs
    List<Bmw> findAll();

    // Método para mostrar los BMWs con más HP
    List<Bmw> findByHighestHorsepower();

    // Método para mostrar los BMWs con el precio más alto
    List<Bmw> findByHighestPrice();

}

