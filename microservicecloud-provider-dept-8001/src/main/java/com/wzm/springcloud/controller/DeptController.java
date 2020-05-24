package com.wzm.springcloud.controller;

import java.util.List;

import com.wzm.springcloud.entities.Dept;
import com.wzm.springcloud.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * @description 
 * @author wangzhimin
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
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@GetMapping(value = "/dept/list")
	public List<Dept> list() {
		return service.list();
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
