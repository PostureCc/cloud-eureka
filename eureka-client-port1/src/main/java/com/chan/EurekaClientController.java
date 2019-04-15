package com.chan;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @RequestMapping(value = "/call/{str}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String call(@PathVariable String str) {
        return str;
    }

}
