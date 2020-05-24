package com.wzm.springcloud.service.impl;

import java.util.List;

import com.wzm.springcloud.dao.DeptDao;
import com.wzm.springcloud.entities.Dept;
import com.wzm.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description 
 * @author wzm
 * @date 2020-05-18 20:55
 * @since 
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}
}
