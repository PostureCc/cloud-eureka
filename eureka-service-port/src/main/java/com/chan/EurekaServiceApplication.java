package com.chan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
//该注解标注这是Eureka的服务器端
@EnableEurekaServer
public class EurekaServiceApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //读取控制台所输入的端口 并将程序启动 例如输入slave1
        new SpringApplicationBuilder(EurekaServiceApplication.class).profiles(scanner.nextLine()).run(args);
    }

}
