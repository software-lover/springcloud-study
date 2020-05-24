
package com.wzm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description
 * @author wzm
 * @date 2020-05-24 12:32
 * @since
 */

/**
 * 假如 profile是dev，默认在github上对应的端口是8201，所以访问 http://client-config.com:8201/config
 * 假如 profile是test，默认在github上对应的端口是8202，所以访问 http://client-config.com:8202/config
 */
@SpringBootApplication
public class ConfigClient_3355_StartSpringCloudApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClient_3355_StartSpringCloudApp.class, args);
	}
}
