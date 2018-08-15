package com.hermes.datasource.manage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SecKillController
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/8/14
 */
@RestController
@RequestMapping("/sec_kill")
public class SecKillController {

    protected static final Jedis jedis = new Jedis("182.61.42.218", 5268);


    @RequestMapping("/kill")
    public String doSKill() {
        doCheck();
        return null;
    }

    private Boolean doCheck() {
        List<String> keys = new ArrayList<>();
        keys.add("SECKILL:TEST:4");
        List<String> argv = new ArrayList<>();
        argv.add("990");
        System.out.println(jedis.evalsha("fb113538d3cbb8af21ccb91e7d52001ab7f69037", keys, argv));
        return null;
    }

    public static void main(String[] args) {
        SecKillController a = new SecKillController();
        for (int i = 0; i < 1000; i++) {
            a.doCheck();
        }
    }

}
