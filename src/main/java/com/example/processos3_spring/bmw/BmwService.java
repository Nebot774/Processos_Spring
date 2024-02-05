package com.example.processos3_spring.bmw;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BmwService implements IBmwService {

    private final BmwRepository bmwRepository;

    @Autowired
    public BmwService(BmwRepository bmwRepository) {
        this.bmwRepository = bmwRepository;
    }

    @Override
    public List<Bmw> findAll() {
        return bmwRepository.findAll();
    }

    @Override
    public List<Bmw> findByHighestHorsepower() {
        return bmwRepository.findByHighestHorsepower();
    }

    @Override
    public List<Bmw> findByHighestPrice() {
        return bmwRepository.findByHighestPrice();
    }
}

