package com.example.processos3_spring.landRover;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/landrovers")
public class landRoverController {

    private final ILandRoverService landRoverService;

    public landRoverController(ILandRoverService landRoverService) {
        this.landRoverService = landRoverService;
    }

    //http://localhost:8080/landrovers/all
    @GetMapping("/all")
    public List<LandRover> findAll() {
        return landRoverService.findAll();
    }

    //http://localhost:8080/landrovers/highest-hp
    @GetMapping("/highest-hp")
    public List<LandRover> findByHighestHorsepower() {
        return landRoverService.findByHighestHorsepower();
    }

    //http://localhost:8080/landrovers/highest-price
    @GetMapping("/highest-price")
    public List<LandRover> findByHighestPrice() {
        return landRoverService.findByHighestPrice();
    }

    //http://localhost:8080/landrovers/highest-torque
    @GetMapping("/highest-torque")
    public LandRover findWithHighestTorque() {
        return landRoverService.findWithHighestTorque();
    }
}


