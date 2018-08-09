package com.hermes.datasource.manage;

import javax.annotation.Resource;

/**
 * @ClassName BeanA
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/8/7
 */
public class BeanA {

    @Resource
    private ComponentA componentA;

    public void showComponent() {
        System.out.println(componentA.hashCode());
    }

}
