package com.consumer.consumer_service.webClient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WebClientProvider {

    @Autowired
    private WebClient webClient;

    public String getInstanceInfo(){
        return webClient.get()
                .uri("/instance")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}
