package com.bnta.chocolate.Controller;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "estates")
public class EstateController {

    @Autowired
    EstateService estateService;

    //Index
    @GetMapping
    public ResponseEntity<List<Estate>> getAllEstates(){
        return new ResponseEntity(estateService.getAllEstates(), HttpStatus.OK);
    }

} //Last Curly Bracket
