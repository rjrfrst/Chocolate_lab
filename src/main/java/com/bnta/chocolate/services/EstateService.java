package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstateService {

    @Autowired
    EstateRepository estateRepository;

    @Autowired
    ChocolateService chocolateService;

    //
    public Optional<Estate> getEstateByID(long id){
        return estateRepository.findById(id);
    }

    //we can look here for all the completedEstates???
    //is it possible to use the components?


    //Get all estates
    public List<Estate> getAllEstates(){
        return estateRepository.findAll();
    }

    //Save an estate in the db
    public Estate saveEstate(Estate estate){
        estateRepository.save(estate);
        return estate;
    }



}//Last curly bracket
