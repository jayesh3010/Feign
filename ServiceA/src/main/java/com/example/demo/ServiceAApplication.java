package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@RestController
@SpringBootApplication
public class ServiceAApplication {

	@Autowired
	Environment environment;
	
	@Autowired
	FeignProxy feignproxy;
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}
	
	@RequestMapping("/servicea")
	public String callServiceA()
	{
		String str = "This is in ServiceA : port : " + environment.getProperty("local.server.port");
		System.out.println(str);
		return str;
	}
	
	@RequestMapping("/serviceab")
	public String callServiceAB()
	{
		String str = callServiceA() + "\n";
				
		//str += resttemplate.getForObject("http://localhost:8091/serviceb", String.class);
		str += feignproxy.sayHello();
		
		System.out.println(str);
		
		return str;
	}
}
