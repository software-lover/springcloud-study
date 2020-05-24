package com.wzm.springcloud.service;

import com.wzm.springcloud.entities.Dept;

import java.util.List;

/**
 * @description 
 * @author wangzhimin
 * @date 2020-05-18 20:57
 * @since 
 */
public interface DeptService {

	/**
	 * 添加
	 * @param dept
	 * @return
	 */
	boolean add(Dept dept);

	/**
	 * 单个查询
	 * @param id
	 * @return
	 */
	Dept get(Long id);

	/**
	 * 查询所有
	 * @return
	 */
	List<Dept> list();
}
