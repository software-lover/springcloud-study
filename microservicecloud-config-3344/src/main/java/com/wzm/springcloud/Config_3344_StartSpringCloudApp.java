package com.wzm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @description
 * @author wzm
 * @date 2020-05-24 11:56
 * @since
 */

/**
 * 浏览器访问读取git仓库的配置文件的规则：
 * 	1   http://config-3344.com:3344/{application}-{profile}.yml
 * 	2   http://config-3344.com:3344/{application}/{profile}[/{label}]     其中 label 是分支名称
 * 	3   http://config-3344.com:3344/{label}/{application}-{profile}.yml   其中 label 是分支名称
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {

	public static void main(String[] args) {
		SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);
	}
}
