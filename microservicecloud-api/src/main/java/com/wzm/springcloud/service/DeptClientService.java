package com.wzm.springcloud.service;

import com.wzm.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @description 部门服务接口
 * @author wangzhimin
 * @date 2020-05-23 17:50
 */
//@FeignClient("MICROSERVICECLOUD-DEPT")

/**
 * 这里针对某个服务，设置对应该服务异常时的降级机制
 * 服务降级处理是在客户端实现的，与服务端没有关系
 *
 *
 * 【服务熔断】：一般是某个服务故障或者异常引起，类似现实世界中的“保险丝”，当某个条件被触发，直接熔断整个服务，而不是一直等到此服务超时
 * 【服务降级】：所谓降级，一般是从整体负荷考虑，就是当某个服务熔断之后，服务器将不再被调用，此时【客户端】可以自己准备一个本地的fallback回调，
 *             返回一个缺省值，这样做虽然服务水平下降，但是好歹可用，比直接挂掉要强。
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @PostMapping(value = "/dept/add")
    boolean add(@RequestBody Dept dept);

    @GetMapping(value = "/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

    @GetMapping(value = "/dept/list")
    List<Dept> list();
}
