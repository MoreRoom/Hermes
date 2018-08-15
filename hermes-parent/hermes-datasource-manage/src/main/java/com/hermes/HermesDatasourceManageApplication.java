package com.hermes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.hermes.core",
        "com.hermes"
})
@EnableAutoConfiguration
@MapperScan(basePackages = {
        "com.hermes.core.datasource.dao",
        "com.hermes.core.market.dao"
})
public class HermesDatasourceManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(HermesDatasourceManageApplication.class, args);
    }

}
