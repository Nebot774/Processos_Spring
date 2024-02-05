package com.example.processos3_spring.landRover;


import com.example.processos3_spring.bmw.Bmw;

import java.util.List;

public interface ILandRoverService {
    // Método para encontrar todos los LandRovers
    List<LandRover> findAll();

    // Método para mostrar los andRovers con más HP
    List<LandRover> findByHighestHorsepower();

    // Método para mostrar los LandRovers con el precio más alto
    List<LandRover> findByHighestPrice();

    // Método para mostrar el LandRover con más torque
    LandRover findWithHighestTorque();


}
