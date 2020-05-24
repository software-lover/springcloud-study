package com.wzm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description
 * @author wzm
 * @date 2020-05-24 10:52
 * @since
 */

@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp {

	public static void main(String[] args) {
		SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
	}
}
