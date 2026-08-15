package com.consumer.consumer_service.restTemplate;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inter-service/restTemplate")
@RequiredArgsConstructor
public class RestTemplateController {

    private final RestTemplateProvider restTemplateProvider;


    @GetMapping("/instance")
    public String getInstanceInfo(){
        return "REST_Template : "+this.restTemplateProvider.provideInstanceInfo();
    }
}
