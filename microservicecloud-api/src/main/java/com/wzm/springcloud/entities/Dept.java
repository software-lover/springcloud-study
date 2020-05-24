package com.wzm.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @description 部门
 * @author wzm
 * @date 2020-05-17 20:47
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private static final long serialVersionUID = -8643311487440952791L;

    /**
     * 主键
     */
    private Long deptno;

    /**
     * 部门名称
     */
    private String dname;

    /**
     * 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
     */
    private String db_source;
}
