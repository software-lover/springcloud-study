package com.wzm.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wzm.springcloud.entities.Dept;
import com.wzm.springcloud.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description 
 * @author wzm
 * @date 2020-05-18 20:56
 * @since 
 */
@RestController
@Slf4j
public class DeptController {

	@Autowired
	private DeptService service;

	@Autowired
	private DiscoveryClient client;

	@PostMapping(value = "/dept/add")
	public boolean add(@RequestBody Dept dept) {
		return service.add(dept);
	}

	@GetMapping(value = "/dept/get/{id}")
	/**
	 * 服务熔断： 一旦调用服务方法失败并抛出异常信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中指定的方法
	 *
	 * 问题(缺点)：没一个业务逻辑方法都得对应一个降级方法
	 * 	主干业务逻辑和处理异常的方法高度耦合在一起
	 *
	 * 	解决办法：实现FallbackFactory接口
	 */
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = service.get(id);
		if (null == dept) {
			throw new RuntimeException("该ID: " + id + "没有对应的信息");
		}
		return dept;
	}

	@GetMapping(value = "/dept/list")
	public List<Dept> list() {
		return service.list();
	}

	/**
	 * Hystrix熔断方法
	 * @param id
	 * @return
	 */
	public Dept processHystrix_Get(@PathVariable("id") Long id) {
		return new Dept().setDeptno(id).setDname("该ID: " + id + "没有对应的信息, null--@HystrixCommand")
				.setDb_source("no this database in MySQL");
	}

	/**
	 * 服务发现信-服务信息描述
	 * @return
	 */
	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	public Object discovery() {
		List<String> list = client.getServices();
		log.info("--->list={}", list);

		List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
		for (ServiceInstance element : srvList) {
			log.info("serviceId={}, host={}, port={}, uri={}",
					element.getServiceId(), element.getHost(), element.getPort(), element.getUri());
		}
		return this.client;
	}
}
