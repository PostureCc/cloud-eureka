package com.chan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//该注解标注这是Eureka的服务器端
@EnableEurekaServer
public class EurekaServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServiceApplication.class).web(true).run(args);
    }

}
