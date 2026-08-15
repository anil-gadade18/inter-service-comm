package com.consumer.consumer_service.restClient;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/inter-service/restClient")
@RequiredArgsConstructor
public class RestClientController {

    private final RestClientProvider restClientProvider;

//    @GetMapping("/instance")
//    public String getInstance(){
//        RestClient restClient = RestClient.create();
//        return restClient.get()
//                .uri("http://localhost:8081/instance")
//                .retrieve()
//                .body(String.class);
//    }

    @GetMapping("/instance")
    public String getInstance(){
            return restClientProvider.getInstanceInfo();
    }

}
