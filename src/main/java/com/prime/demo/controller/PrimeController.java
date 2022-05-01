package com.prime.demo.controller;

import com.prime.demo.model.PrimeResult;
import com.prime.demo.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {

    @Autowired
    PrimeService service;

    @GetMapping("/prime/{limit}")
    public PrimeResult getPrime(@PathVariable Integer limit){
        return service.getPrime(limit);

    }
}
