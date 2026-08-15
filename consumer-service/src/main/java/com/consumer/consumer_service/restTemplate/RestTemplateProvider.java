package com.consumer.consumer_service.restTemplate;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RestTemplateProvider {

    private final RestTemplate restTemplate;


    public String provideInstanceInfo(){
        return restTemplate.getForObject("http://PROVIDER-SERVICE/instance", String.class);
    }
}
