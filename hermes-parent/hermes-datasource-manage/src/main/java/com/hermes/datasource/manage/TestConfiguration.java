package com.hermes.datasource.manage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName TestConfiguration
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/8/7
 */
@Configuration
public class TestConfiguration {

    @Bean
    public BeanA getBeanA() {
        return new BeanA();
    }

    @Bean
    public BeanB getBeanB() {
        return new BeanB();
    }

    @Bean
    public BeanC getBeanC() {
        return new BeanC();
    }


}
