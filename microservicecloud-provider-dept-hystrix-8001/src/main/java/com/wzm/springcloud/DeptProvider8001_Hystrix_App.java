package com.wzm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @description
 * @author wzm
 * @date 2020-05-18 22:06
 * @since
 */

@SpringBootApplication
/**
 * 本服务启动后会自动注册进eureka服务中
 */
@EnableEurekaClient
/**
 * 服务发现
 */
@EnableDiscoveryClient
/**
 * 对Hystrix熔断机制的支持
 */
@EnableCircuitBreaker
public class DeptProvider8001_Hystrix_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
	}
}
