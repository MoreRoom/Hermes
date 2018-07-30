package com.hermes.datasource.manage.vo;

import java.io.Serializable;

/**
 * @ClassName DataSourceInfoVO
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/7/30
 */
public class DataSourceInfoVO implements Serializable {
    
    private String address;
    private String port;
    private String username;
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
