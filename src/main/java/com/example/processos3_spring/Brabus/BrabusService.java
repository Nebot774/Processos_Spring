package com.example.processos3_spring.Brabus;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BrabusService implements IBrabusService {

    private final BrabusRepository brabusRepository;

    @Autowired
    public BrabusService(BrabusRepository brabusRepository) {
        this.brabusRepository = brabusRepository;
    }

    @Override
    public List<Brabus> findAll() {
        return brabusRepository.findAll();
    }

    @Override
    public List<Brabus> findByHighestHorsepower() {
        return brabusRepository.findByHighestHorsepower();
    }

    @Override
    public List<Brabus> findByHighestPrice() {
        return brabusRepository.findByHighestPrice();
    }

    @Override
    public Brabus findWithHighestTorque() {
        return brabusRepository.findWithHighestTorque();
    }
}

