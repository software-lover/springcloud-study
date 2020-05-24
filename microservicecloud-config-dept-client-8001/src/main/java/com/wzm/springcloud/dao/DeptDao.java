package com.wzm.springcloud.dao;

import com.wzm.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description 部门dao
 * @author wangzhimin
 * @date 2020-05-18 20:47
 */
@Mapper
public interface DeptDao {

    /**
     * 添加
     * @param dept
     * @return
     */
    boolean addDept(Dept dept);

    /**
     * 单个查询
     * @param id
     * @return
     */
    Dept findById(Long id);

    /**
     * 查询所有
     * @return
     */
    List<Dept> findAll();
}
