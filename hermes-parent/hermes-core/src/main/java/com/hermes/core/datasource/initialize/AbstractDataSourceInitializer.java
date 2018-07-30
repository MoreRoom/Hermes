package com.hermes.core.datasource.initialize;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * TODO 还需要监听Spring 容器启动完成的事件 以便于从数据库中恢复已存在的数据库连接池
 */
public abstract class AbstractDataSourceInitializer {

    /**
     * url<|AND|>user = key
     */
    private static final ConcurrentMap<String, DataSource> dataSourceMap = new ConcurrentHashMap<>();

    private static final String AND = "<|AND|>";

    /** 连接串 */
    protected String connectionUrl;
    /** 用户名 */
    protected String user;
    /** 密码 */
    protected String password;
    /** 初始化数据库连接数量 */
    protected int initialPoolSize;
    /** 连接时间 */
    protected int maxIdleTime;
    /** 最大连接数 */
    protected int maxPoolSize;

    public abstract void init();

    public static void main(String[] args) {
        // 创建连接池核心工具类
        try {
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            dataSource.setJdbcUrl("jdbc:mysql://bj-cdb-kfxut7i1.sql.tencentcdb.com:63640");
            dataSource.setDriverClass("");
            dataSource.setUser("root");
            dataSource.setPassword("20180313@PayPlus");
            dataSource.setInitialPoolSize(10);
            dataSource.setMaxPoolSize(15);
            dataSource.setMaxIdleTime(6000);

            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select table_name from information_schema.tables where table_schema='dev_payplus' and table_type='base table'");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("table_name"));
            }
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
