package com.example.processos3_spring.Brabus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brabus")
public class BrabusController {

    private final IBrabusService brabusService;

    @Autowired
    public BrabusController(IBrabusService brabusService) {
        this.brabusService = brabusService;
    }

    //http://localhost:8080/brabus/all
    @GetMapping("/all")
    public List<Brabus> findAll() {
        return brabusService.findAll();
    }

    //http://localhost:8080/brabus/highest-hp
    @GetMapping("/highest-hp")
    public List<Brabus> findByHighestHorsepower() {
        return brabusService.findByHighestHorsepower();
    }

    //http://localhost:8080/brabus/highest-price
    @GetMapping("/highest-price")
    public List<Brabus> findByHighestPrice() {
        return brabusService.findByHighestPrice();
    }

    //http://localhost:8080/brabus/highest-torque
    @GetMapping("/highest-torque")
    public Brabus findWithHighestTorque() {
        return brabusService.findWithHighestTorque();
    }
}

