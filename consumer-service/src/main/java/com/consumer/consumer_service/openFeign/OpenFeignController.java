package com.consumer.consumer_service.openFeign;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inter-service/openFeign")
@RequiredArgsConstructor
public class OpenFeignController {

    private final FeignClientConfig config;

    @GetMapping("/instance")
    public String getInstanceInfo(){
        return "Open_Feign:"+this.config.getInstanceInfo();
    }



}
