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

    public static Boolean isValid = true;

    /**eureka只能检测项目心跳是否正常工作 但不能检测项目内部是否正常工作 所以在这里模拟检测项目内部是否正常运行中(例如检查该服务所在的DB是否能够正常运行)*/
    @RequestMapping(value = "/isValid/{isValid}", method = RequestMethod.GET)
    public String isValid(@PathVariable Boolean isValid) {
    	this.isValid = isValid;
        return isValid.toString();
    }

}
