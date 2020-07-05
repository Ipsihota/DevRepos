package com.web.home.controller;

import com.web.home.model.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping("/")
    public String print(){
        return  "My First Spring boot App";
    }

    @GetMapping("/print")
    public  String printNext(){
        return "Learning More";
    }


    @PostMapping("/customer")
    public Customer printCustDetails(@RequestBody Customer customer){
        return customer;
    }
}
