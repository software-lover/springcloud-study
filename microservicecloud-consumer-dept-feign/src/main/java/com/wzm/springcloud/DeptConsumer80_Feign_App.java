package com.wzm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @description
 * @author wzm
 * @date 2020-05-18 22:47
 * @since
 */

@SpringBootApplication
@EnableEurekaClient
/**
 * Feign集成了Ribbon的客户端轮询算法的负载均衡
 */
@EnableFeignClients
public class DeptConsumer80_Feign_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_Feign_App.class, args);
	}
}
