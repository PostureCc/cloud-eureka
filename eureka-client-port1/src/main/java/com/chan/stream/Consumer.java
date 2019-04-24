package com.chan.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Consumer {

    @Input("myInput")
    SubscribableChannel getMsg();

}
