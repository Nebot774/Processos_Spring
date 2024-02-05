package com.example.processos3_spring.landRover;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandRoverService implements ILandRoverService {

    private final LandRoverRepository landRoverRepository;

    @Autowired
    public LandRoverService(LandRoverRepository landRoverRepository) {
        this.landRoverRepository = landRoverRepository;
    }

    @Override
    public List<LandRover> findAll() {
        return landRoverRepository.findAll();
    }

    @Override
    public List<LandRover> findByHighestHorsepower() {
        return landRoverRepository.findByHighestHorsepower();
    }

    @Override
    public List<LandRover> findByHighestPrice() {
        return landRoverRepository.findByHighestPrice();
    }

    @Override
    public LandRover findWithHighestTorque() {
        return landRoverRepository.findWithHighestTorque();
    }

}
