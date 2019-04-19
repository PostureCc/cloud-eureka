package com.chan.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

	@Autowired
	private MyFeign myFeign;

	@GetMapping("/feignTest/{str}")
	public String call(@PathVariable String str) {
		return myFeign.call(str);
	}

}