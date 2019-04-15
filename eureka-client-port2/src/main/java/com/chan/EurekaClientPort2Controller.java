package com.chan;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class EurekaClientPort2Controller {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/router")
    public String router() {
        RestTemplate tpl = getRestTemplate();
        String json = tpl.getForObject("http://eureka-client-port1/call/helloloud", String.class);
        return json;
//        return "router";
    }

}