package com.consumer.consumer_service.restClient;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
public class RestClientConfig {


//    @Bean
//    @LoadBalanced
//    public RestClient.Builder loadBalanced(){
//        return RestClient.builder();
//    }
//    @Bean
//    public RestClient restClient(RestClient.Builder builder){
//        return builder.baseUrl("http://localhost:8081")
//                .build();
//    }




    @Bean
    @LoadBalanced
    public RestClient.Builder restClientLoadBalanced(){
        return RestClient.builder();
    }

    @Bean
    public RestClient restClient(RestClient.Builder builder){
        return builder.baseUrl("http://provider-service")
                .build();
    }

//    @Bean
//    @LoadBalanced
//    public RestClient.Builder loadBalancedRestClient(){
//        return RestClient.builder();
//    }
//
//
//    @Bean
//    public RestClient restClient(RestClient.Builder builder){
//        return builder.baseUrl("http://provider-service").build();
//    }
}
