package com.springcloud.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//使用@EnableEurekaClient注解表明是client
@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringcloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudClientApplication.class, args);
	}
	@Value("${server.port}") String port;
	@RequestMapping("/")
	public String home() {
		return "hello world from port " + port;  
		}
}

