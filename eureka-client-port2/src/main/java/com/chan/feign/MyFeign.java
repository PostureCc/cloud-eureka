package com.chan.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * value:eureka-client-port1:需要调用哪个服务 
 * fallback:熔断后的处理类
 */
@FeignClient(name = "eureka-client-port1", fallback = MyFeignImpl.class)
public interface MyFeign {

	@RequestMapping(value = "/call/{str}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	String call(@PathVariable("str") String str);

}
