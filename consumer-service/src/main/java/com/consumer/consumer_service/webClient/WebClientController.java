package com.consumer.consumer_service.webClient;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/inter-service/webClient")
public class WebClientController {


    @Autowired
    private WebClientProvider webClientProvider;

//    @GetMapping("/instance")
//    public String getInstance(){
//        WebClient webClient = WebClient.create();
//        return webClient.get()
//                .uri("http://localhost:8081/instance")
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();
//    }


    @GetMapping("/instance")
    public String getInstanceInfo(){
        return "WebClient : "+this.webClientProvider.getInstanceInfo();
    }

}
