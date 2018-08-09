package com.hermes.datasource.manage;

import org.springframework.stereotype.Component;

/**
 * @ClassName ComponentA
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/8/7
 */
@Component
public class ComponentA {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
