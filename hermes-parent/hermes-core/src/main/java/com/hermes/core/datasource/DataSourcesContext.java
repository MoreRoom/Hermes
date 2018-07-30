package com.hermes.core.datasource;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class DataSourcesContext implements ApplicationListener<ContextRefreshedEvent> {

    private static final ConcurrentMap<String, DataSource> c3p0DataSourcesMap = new ConcurrentHashMap<>();

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        // 从数据库中读出对应的连接配置 初始化数据库连接池

    }

}
