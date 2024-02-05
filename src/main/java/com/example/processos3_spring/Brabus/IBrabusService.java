package com.example.processos3_spring.Brabus;

import com.example.processos3_spring.landRover.LandRover;

import java.util.List;

public interface IBrabusService {

    List<Brabus> findAll();

    // Método para mostrar los con más HP
    List<Brabus> findByHighestHorsepower();

    // Método para mostrar los con el precio más alto
    List<Brabus> findByHighestPrice();

    // Método para mostrar con más torque
    Brabus findWithHighestTorque();


}
