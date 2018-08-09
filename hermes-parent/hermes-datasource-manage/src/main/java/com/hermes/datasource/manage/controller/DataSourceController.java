package com.hermes.datasource.manage.controller;

import com.hermes.core.datasource.entity.DataSourceInfoEntity;
import com.hermes.core.datasource.service.IDataSourceInfoService;
import com.hermes.datasource.manage.BeanA;
import com.hermes.datasource.manage.BeanB;
import com.hermes.datasource.manage.BeanC;
import com.hermes.datasource.manage.vo.DataSourceInfoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName DataSourceController
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/7/30
 */
@Controller

public class DataSourceController {

    @Resource
    private IDataSourceInfoService dataSourceInfoService;

    @Resource
    private BeanA beanA;
    @Resource
    private BeanB beanB;
    @Resource
    private BeanC beanC;

    @RequestMapping("/manage")
    public String toPage_Manage() {
        beanA.showComponent();
        beanB.showComponent();
        beanC.showComponent();

        return "datasource/datasource_manage";
    }


    @RequestMapping(value = "/datasource", method = RequestMethod.POST)
    public String insertNewDataSource(HttpServletRequest servletRequest, HttpServletResponse ServletResponse, DataSourceInfoVO vo) {
        DataSourceInfoEntity entity = new DataSourceInfoEntity();
        BeanUtils.copyProperties(vo, entity);
        if (null != dataSourceInfoService.insertNewDataSource(entity)) {
            return "success";
        }
        return "error";

    }

}
