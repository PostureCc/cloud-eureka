package com.chan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients//调用者启动时，打开Feign开关
public class EurekaClientPort2Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientPort2Application.class).web(true).run(args);
    }

}
