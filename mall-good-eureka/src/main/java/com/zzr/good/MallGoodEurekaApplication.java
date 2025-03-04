package com.zzr.good;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MallGoodEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallGoodEurekaApplication.class, args);
	}

}
