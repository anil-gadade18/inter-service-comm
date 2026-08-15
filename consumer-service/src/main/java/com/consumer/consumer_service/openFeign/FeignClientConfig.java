package com.consumer.consumer_service.openFeign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider-service")
public interface FeignClientConfig {

    @GetMapping("/instance")
    public String getInstanceInfo();
}
