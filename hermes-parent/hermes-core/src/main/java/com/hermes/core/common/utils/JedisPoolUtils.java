package com.hermes.core.common.utils;

import redis.clients.jedis.Jedis;

/**
 * @ClassName JedisPoolUtils
 * @Description 提供获取jedis以及关闭jedis的方法
 * @Author MoreRoom
 * @Since 2018/8/15
 */
public class JedisPoolUtils {

    public static Jedis getConnection() {
        return JedisPoolFactory.getPool().getResource();
    }

    public static void close(Jedis jedis) {
        if (null != jedis) {
            jedis.close();
        }
    }


}
