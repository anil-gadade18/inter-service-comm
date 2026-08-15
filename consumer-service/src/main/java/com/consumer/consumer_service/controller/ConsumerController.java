package com.consumer.consumer_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @GetMapping("/instance")
    public String getInstanceInfo(){
        return "Hello from consumer-service.";
    }
}
