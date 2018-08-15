package com.hermes.market.controller;

import com.hermes.core.market.biz.ActiveManageBiz;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName MarketController
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/8/15
 */
@RequestMapping("/market")
@RestController
public class MarketController {

    @Resource
    private ActiveManageBiz activeManageBiz;

    @RequestMapping(value = "/init/active", method = RequestMethod.GET)
    public String initActive(Long number) {
        activeManageBiz.initActive("test01", number);
        return "SUCCESS";
    }


}
