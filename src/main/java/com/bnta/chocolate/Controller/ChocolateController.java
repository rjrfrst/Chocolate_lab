package com.bnta.chocolate.Controller;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.services.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "chocolates")
public class ChocolateController {

    @Autowired
    ChocolateService chocolateService;

    //Add a new
    @PostMapping
    public ResponseEntity<Chocolate> addNewChocolate(@RequestBody Chocolate chocolate){
        Chocolate savedChocolate = chocolateService.saveChocolate(chocolate);
        return new ResponseEntity<>(savedChocolate, HttpStatus.CREATED);
    }

    //Index, to GET in Postman.
    @GetMapping
    public ResponseEntity<List<Chocolate>> getAllChocolates(){
        return new ResponseEntity(chocolateService.getAllChocolates(), HttpStatus.OK);
    }

} //Last curly bracket
