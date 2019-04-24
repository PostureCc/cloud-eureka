package com.chan;

import com.chan.stream.Consumer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
//标注这是Eureka的客户端 加了这个注解会自动把该项目注册到localhost:8761的注册中心里
@EnableEurekaClient
@EnableBinding(Consumer.class)
public class EurekaClientPort1Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientPort1Application.class).web(true).run(args);
    }

    @StreamListener("myInput")
    public void onReceive(byte[] msg) {
        System.err.println("消息者1，接收到的消息：" + new String(msg));
    }

}
