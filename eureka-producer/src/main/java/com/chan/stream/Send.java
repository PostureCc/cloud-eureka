package com.chan.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface Send {

    @Output("myInput")
    SubscribableChannel sendMsg();

}
