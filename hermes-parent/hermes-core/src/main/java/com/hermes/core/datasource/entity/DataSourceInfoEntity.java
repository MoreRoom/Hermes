package com.hermes.core.datasource.entity;

/**
 * @ClassName DataSourceInfoEntity
 * @Description 数据源信息实体
 * @Author MoreRoom
 * @Since 2018/7/27
 */
public class DataSourceInfoEntity extends BaseEntity {

    /**
     * 连接地址
     */
    private String address;

    /**
     * 端口号
     */
    private String port;

    /**
     * 用户名
     */
    private String username;

    /**
     * 登录密码 (AES128+base64加密)
     */
    private String password;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
