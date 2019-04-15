package com.chan;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class EurekaClientController {

    @RequestMapping(value = "/call/{str}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String call(@PathVariable String str, HttpServletRequest request) {
        return String.format("str:%s \nurl:%s", str, request.getRequestURL().toString());
    }

}
