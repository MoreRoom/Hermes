package com.hermes.core.datasource.service.impl;

import com.hermes.core.datasource.entity.DataSourceInfoEntity;
import com.hermes.core.datasource.service.IDataSourceInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceInfoServiceImplTest {

    @Resource
    private IDataSourceInfoService dataSourceInfoService;

    @Test
    public void insertNewDataSource() {
        DataSourceInfoEntity entity = new DataSourceInfoEntity();
        entity.setAddress("localhost");
        entity.setPort("3306");
        entity.setUsername("root");
        entity.setPassword("123456");
        dataSourceInfoService.insertNewDataSource(entity);
    }
}