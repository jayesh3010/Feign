package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="Feign-proxy",url="localhost:8091")
public interface FeignProxy {
	
	@RequestMapping(value="/serviceb",method=RequestMethod.GET)
	public String sayHello();

}
