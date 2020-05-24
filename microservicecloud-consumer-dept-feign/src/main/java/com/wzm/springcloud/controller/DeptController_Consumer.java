package com.wzm.springcloud.controller;

import com.wzm.springcloud.entities.Dept;
import com.wzm.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description 
 * @author wzm
 * @date 2020-05-20 22:11
 * @since 
 */
@RestController
public class DeptController_Consumer {

	@Autowired
	private DeptClientService service;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		return service.add(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List list() {
		return service.list();
	}
}
