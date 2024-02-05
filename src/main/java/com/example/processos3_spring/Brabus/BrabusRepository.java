package com.example.processos3_spring.Brabus;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Repository
public class BrabusRepository {

    private List<Brabus> brabusCars = new ArrayList<>();

    public BrabusRepository() {
        brabusCars.add(new Brabus(1, "Brabus 800", "", 200000.0, 800, 1000));
        brabusCars.add(new Brabus(2, "Brabus Rocket 900", "", 300000.0, 900, 1250));
        brabusCars.add(new Brabus(3, "Brabus G V12 900", "", 350000.0, 900, 1200));
        brabusCars.add(new Brabus(4, "Brabus Adventure 4x4²", "", 250000.0, 550, 800));
        brabusCars.add(new Brabus(5, "Brabus Ultimate E", "", 180000.0, 300, 500));
        // Modelos adicionales
        brabusCars.add(new Brabus(6, "Brabus B35S", "", 150000.0, 450, 550));
        brabusCars.add(new Brabus(7, "Brabus Shadow 900 Black Ops", "", 400000.0, 900, 1100));
        brabusCars.add(new Brabus(8, "Brabus B40", "", 220000.0, 500, 700));
        brabusCars.add(new Brabus(9, "Brabus B50", "", 240000.0, 550, 750));
        brabusCars.add(new Brabus(10, "Brabus B63S", "", 260000.0, 630, 850));

    }

    // Encontrar todos los Brabus
    public List<Brabus> findAll() {
        return brabusCars;
    }

    // Encontrar los Brabus con más HP (caballos de fuerza)
    public List<Brabus> findByHighestHorsepower() {
        List<Brabus> highestHorsepower = new ArrayList<>();
        double max = 0;
        for (Brabus brabus : brabusCars) {
            if (brabus.getHp() > max) {
                max = brabus.getHp();
            }
        }
        for (Brabus brabus : brabusCars) {
            if (brabus.getHp() == max) {
                highestHorsepower.add(brabus);
            }
        }
        return highestHorsepower;
    }

    // Encontrar los Brabus con el precio más alto
    public List<Brabus> findByHighestPrice() {
        List<Brabus> highestPrice = new ArrayList<>();
        double max = 0;
        for (Brabus brabus : brabusCars) {
            if (brabus.getPrecio() > max) {
                max = brabus.getPrecio();
            }
        }
        for (Brabus brabus : brabusCars) {
            if (brabus.getPrecio() == max) {
                highestPrice.add(brabus);
            }
        }
        return highestPrice;
    }

    // Encontrar el Brabus con más torque
    public Brabus findWithHighestTorque() {
        return brabusCars.stream()
                .max(Comparator.comparing(Brabus::getTorque))
                .orElse(null); // Devuelve null si la lista está vacía
    }

}
