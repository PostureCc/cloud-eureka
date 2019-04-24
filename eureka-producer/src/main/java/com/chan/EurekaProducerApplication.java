package com.chan;

import com.chan.stream.Send;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(Send.class)
public class EurekaProducerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaProducerApplication.class).web(true).run(args);
    }

}
