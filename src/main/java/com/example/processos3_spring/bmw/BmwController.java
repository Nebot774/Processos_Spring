package com.example.processos3_spring.bmw;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/bmws")
public class BmwController {

    @Autowired
    private BmwService bmwService;

    //http://localhost:8080/bmws/all
    @GetMapping("/all")
    public List<Bmw> getAllBmws() {
        return bmwService.findAll();
    }

    //http://localhost:8080/bmws/highestHorsepower
    @GetMapping("/highestHorsepower")
    public List<Bmw> getBmwsByHighestHorsepower() {
        return bmwService.findByHighestHorsepower();
    }

    //http://localhost:8080/bmws/highestPrice
    @GetMapping("/highestPrice")
    public List<Bmw> getBmwsByHighestPrice() {
        return bmwService.findByHighestPrice();
    }


}

