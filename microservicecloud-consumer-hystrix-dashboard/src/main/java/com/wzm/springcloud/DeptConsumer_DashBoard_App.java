package com.wzm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @description
 * @author wzm
 * @date 2020-05-23 22:06
 * @since
 */

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
	}
}
