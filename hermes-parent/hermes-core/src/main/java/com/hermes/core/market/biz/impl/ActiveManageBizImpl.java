package com.hermes.core.market.biz.impl;

import com.hermes.core.common.utils.JedisPoolUtils;
import com.hermes.core.market.biz.ActiveManageBiz;
import com.hermes.core.market.dao.IActiveDao;
import com.hermes.core.market.entity.ActiveEntity;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ActiveManageBizImpl
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/8/15
 */
@Component
public class ActiveManageBizImpl implements ActiveManageBiz {

    private static final int LENGTH = 10000;

    @Resource
    private IActiveDao activeDao;

    @Override
    public void initActive(String activeName, Long number) {
        long a = System.currentTimeMillis();
        Jedis jedis = JedisPoolUtils.getConnection();
        Long sequence = jedis.incr("active:number:sequence");
        JedisPoolUtils.close(jedis);
        String activeNo = "active:" + sequence;
        int loops = (int) (number / LENGTH);
        for (int i = 0; i < loops; i++) {
            doJedisEvalSha(i, 0, activeNo);
        }
        int endCount = 0;
        if ((endCount = (int) (number % LENGTH)) != 0) {
            doJedisEvalSha(loops, endCount, activeNo);
        }
        long b = System.currentTimeMillis() - a;
        System.out.println(b + " ms");

        ActiveEntity entity = new ActiveEntity();
        entity.setActiveNo(activeNo);
        entity.setActiveName(activeName);
        entity.setActiveStatus("INIT");
        activeDao.insertNewActive(entity);
    }


    private void doJedisEvalSha(int loops, int endCount, String activeNo) {
        Jedis jedis = JedisPoolUtils.getConnection();
        long start = loops * LENGTH + 1;
        long end = endCount == 0 ? (loops + 1) * LENGTH : endCount;
        List<String> keys = new ArrayList<>();
        keys.add(activeNo);
        List<String> argv = new ArrayList<>();
        argv.add(start + "");
        argv.add(end + "");
        jedis.evalsha("d182ccfb30e8ff14cbe51ab76ef45e474a17eb76", keys, argv);
        JedisPoolUtils.close(jedis);
    }


}
