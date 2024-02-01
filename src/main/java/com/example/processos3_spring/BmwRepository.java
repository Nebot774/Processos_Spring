package com.example.processos3_spring;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BmwRepository {

    private List<Bmw> bmws = new ArrayList<>();

    public BmwRepository() {
        bmws.add(new Bmw(1, "M5 Competition", "", 100000.0, 617, 750));
        bmws.add(new Bmw(2, "i8", "Generación", 120000.0, 360, 570));
        bmws.add(new Bmw(3, "Serie 1 M Coupe", "1", 80000.0, 335, 500));
        bmws.add(new Bmw(4, "M3 E92", "3", 85000.0, 425, 550));
        bmws.add(new Bmw(5, "Serie 4", "4", 70000.0, 454, 600));
        bmws.add(new Bmw(6, "Z4", "Generación", 65000.0, 255, 400));
        bmws.add(new Bmw(7, "X7", "Generación", 95000.0, 523, 700));
        bmws.add(new Bmw(8, "Serie 8", "8", 110000.0, 523, 730));
        bmws.add(new Bmw(9, "X1", "Generación", 45000.0, 228, 350));
        bmws.add(new Bmw(10, "Serie 7", "7", 105000.0, 330, 650));
    }

    public List<Bmw> findAll() {
        return bmws;
    }

    public List<Bmw> findByHighestHorsepower() {
        List<Bmw> highestHorsepower = new ArrayList<>();
        double max = 0;
        for (Bmw bmw : bmws) {
            if (bmw.getHp() > max) {
                max = bmw.getHp();
            }
        }
        for (Bmw bmw : bmws) {
            if (bmw.getHp() == max) {
                highestHorsepower.add(bmw);
            }
        }
        return highestHorsepower;
    }

    public List<Bmw> findByHighestPrice() {
        List<Bmw> highestPrice = new ArrayList<>();
        double max = 0;
        for (Bmw bmw : bmws) {
            if (bmw.getPrecio() > max) {
                max = bmw.getPrecio();
            }
        }
        for (Bmw bmw : bmws) {
            if (bmw.getPrecio() == max) {
                highestPrice.add(bmw);
            }
        }
        return highestPrice;
    }





}
