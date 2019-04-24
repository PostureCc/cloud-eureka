package com.chan;

import com.chan.stream.Consumer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(Consumer.class)
public class EurekaClientPort2Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientPort2Application.class).web(true).run(args);
    }

    @StreamListener("myInput")
    public void onReceive(byte[] msg) {
        System.err.println("消息者2，接收到的消息：" + new String(msg));
    }

}
