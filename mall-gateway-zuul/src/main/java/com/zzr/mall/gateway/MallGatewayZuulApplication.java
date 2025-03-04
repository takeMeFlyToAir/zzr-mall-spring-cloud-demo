package com.zzr.mall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableDiscoveryClient
//支持网关路由
@EnableZuulProxy
@SpringBootApplication
public class MallGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallGatewayZuulApplication.class, args);
	}

}
