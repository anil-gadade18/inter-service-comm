package com.consumer.consumer_service.webClient;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {



    @Bean
    @LoadBalanced
    public WebClient.Builder webClientLoadBalanced(){
        return WebClient.builder();
    }

    @Bean
    public WebClient webClient(WebClient.Builder builder){
        return builder.baseUrl("http://PROVIDER-SERVICE")
                .build();
    }
}
