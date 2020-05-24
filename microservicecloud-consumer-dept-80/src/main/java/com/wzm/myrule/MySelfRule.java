package com.wzm.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzm
 * @description 自定义负载均衡算法
 * @date 2020-05-23 12:43
 */
@Configuration
public class MySelfRule  {

    @Bean
    public IRule myRule() {
        return new RandRule_ZDY();
    }
}
