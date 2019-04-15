package com.chan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientPort2Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientPort2Application.class).properties("server.port="+new Scanner(System.in).nextLine()).run(args);
    }

}
