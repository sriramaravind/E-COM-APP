package com.prodapi.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class EcommProdAPIApplication {
	//Test
	public  void main(String[] args) {
		SpringApplication.run(EcommProdAPIApplication.class, args)
	}

}
