package com.demo.restfulwebservice.restfulwebservicesexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAppController {

    //returning string!!
    @GetMapping("/helloApp")
    public String getHelloApp(){
        return "Hello App Ipsita!!";
    }

    // returning Bean!!
    @GetMapping("/helloAppBean")
    public HelloAppBean getHelloAppBean(){
        return new HelloAppBean("Hello App Bean Ipsita!!");
    }
}
