package com.chan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

@SpringBootApplication
//标注这是Eureka的客户端 加了这个注解会自动把该项目注册到localhost:8761的注册中心里
@EnableEurekaClient
public class EurekaClientPort1Application {

    public static void main(String[] args) {
    	//不在配置文件中做配置 改在控制台做配置 效果一样
        new SpringApplicationBuilder(EurekaClientPort1Application.class).properties("server.port="+new Scanner(System.in).nextLine()).run(args);
    }

}
