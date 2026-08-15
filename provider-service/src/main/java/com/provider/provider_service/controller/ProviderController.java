package com.provider.provider_service.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;
    private final String INSTANCE_VAlUE = UUID.randomUUID().toString();

    @GetMapping("/instance")
    public String provideMessage(){
        System.out.println("Provider service called on port : "+port);
        return "Provider Service called on port : "+port+" , Instance value : "+INSTANCE_VAlUE;
    }

    @GetMapping("/hello")
    public String sayHelloFromProviderService(){
        return "Hello from provider-service.";
    }
}
