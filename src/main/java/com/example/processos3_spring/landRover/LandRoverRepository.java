package com.example.processos3_spring.landRover;



import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Repository
public class LandRoverRepository {

    private List<LandRover> landRovers = new ArrayList<>();

    public LandRoverRepository() {
        landRovers.add(new LandRover(1, "Range Rover Sport SVR", "", 130000.0, 575, 700));
        landRovers.add(new LandRover(2, "Range Rover Velar SVAutobiography", "", 90000.0, 550, 680));
        landRovers.add(new LandRover(3, "Discovery Sport", "Generación", 50000.0, 300, 400));
        landRovers.add(new LandRover(4, "Defender V8", "", 110000.0, 525, 625));
        landRovers.add(new LandRover(5, "Range Rover Evoque", "", 60000.0, 250, 365));
        // Modelos adicionales
        landRovers.add(new LandRover(6, "Range Rover Autobiography", "", 140000.0, 565, 700));
        landRovers.add(new LandRover(7, "Range Rover Velar R-Dynamic", "", 75000.0, 385, 450));
        landRovers.add(new LandRover(8, "Discovery HSE Luxury", "", 65000.0, 340, 450));
        landRovers.add(new LandRover(9, "Range Rover Evoque Convertible", "", 55000.0, 240, 340));
        landRovers.add(new LandRover(10, "Defender X-Dynamic", "", 70000.0, 400, 500));

    }

    public List<LandRover> findAll() {
        return landRovers;
    }

    public List<LandRover> findByHighestHorsepower() {
        List<LandRover> highestHorsepower = new ArrayList<>();
        double max = 0;
        for (LandRover landrover : landRovers) {
            if (landrover.getHp() > max) {
                max = landrover.getHp();
            }
        }
        for (LandRover landrover : landRovers) {
            if (landrover.getHp() == max) {
                highestHorsepower.add(landrover);
            }
        }
        return highestHorsepower;
    }

    public List<LandRover> findByHighestPrice() {
        List<LandRover> highestPrice = new ArrayList<>();
        double max = 0;
        for (LandRover landrover : landRovers) {
            if (landrover.getPrecio() > max) {
                max = landrover.getPrecio();
            }
        }
        for (LandRover landrover : landRovers) {
            if (landrover.getPrecio() == max) {
                highestPrice.add(landrover);
            }
        }
        return highestPrice;
    }


    public LandRover findWithHighestTorque() {
        return landRovers.stream()
                .max(Comparator.comparing(LandRover::getTorque))
                .orElse(null); // Devuelve null si la lista está vacía
    }


}
