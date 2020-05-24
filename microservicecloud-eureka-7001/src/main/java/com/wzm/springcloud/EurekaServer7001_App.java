package com.wzm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description
 * @author wzm
 * @date 2020-05-18 21:53
 * @since
 */

@SpringBootApplication
/**
 * EurekaServer服务器端启动类,接受其它微服务注册进来
 */
@EnableEurekaServer
public class EurekaServer7001_App {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001_App.class, args);
	}
}
