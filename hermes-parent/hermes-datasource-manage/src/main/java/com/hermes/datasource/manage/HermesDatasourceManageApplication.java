package com.hermes.datasource.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.hermes.core.datasource",
        "com.hermes.datasource"
})
@EnableAutoConfiguration
@MapperScan(basePackages = {
        "com.hermes.core.datasource.dao"
})
public class HermesDatasourceManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(HermesDatasourceManageApplication.class, args);
    }
}
