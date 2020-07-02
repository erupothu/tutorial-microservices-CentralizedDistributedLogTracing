package com.tutorial.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;


@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulServerApp {
	
	public static void main(String args[]) {
		SpringApplication.run(ZuulServerApp.class, args);
	}
}
