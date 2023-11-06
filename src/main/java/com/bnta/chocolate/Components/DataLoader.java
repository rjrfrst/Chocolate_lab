package com.bnta.chocolate.Components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import com.bnta.chocolate.services.ChocolateService;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    ChocolateService chocolateService;
    @Autowired
    EstateService estateService;
    @Autowired
    ChocolateRepository chocolateRepository;
    @Autowired
    EstateRepository estateRepository;



    public void run(ApplicationArguments args){
        Estate estateOne = new Estate("ChocoOne", "PH");
        Estate estateTwo = new Estate("ChocoTwo", "JP");

        estateService.saveEstate(estateOne);
        estateService.saveEstate(estateTwo);


        Chocolate chocolateOne = new Chocolate("Chocolate", 20, estateOne);
        Chocolate chocolateTwo = new Chocolate("Milk chocolate", 10, estateTwo);

        chocolateService.saveChocolate(chocolateOne);
        chocolateService.saveChocolate(chocolateTwo);


    }


} // Last curly bracket
