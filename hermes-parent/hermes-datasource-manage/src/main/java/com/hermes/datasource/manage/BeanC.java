package com.hermes.datasource.manage;

import javax.annotation.Resource;

/**
 * @ClassName BeanC
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/8/7
 */
public class BeanC {
    @Resource
    private ComponentA componentA;

    public void showComponent() {
        System.out.println(componentA.hashCode());
    }
}
