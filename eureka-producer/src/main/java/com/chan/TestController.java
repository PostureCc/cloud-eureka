package com.chan;

import com.chan.stream.Send;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Send send;

    @RequestMapping(value = "/test/{msg}", method = RequestMethod.GET)
    public String test(@PathVariable String msg) {
        send.sendMsg().send(MessageBuilder.withPayload(msg.getBytes()).build());
        System.err.println("send success...");
        return "success";
    }

}
