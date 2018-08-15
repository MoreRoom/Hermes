package com.hermes.core.common.utils;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @ClassName JedisPoolFactory
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/8/15
 */
public class JedisPoolFactory {

    private static JedisPool jedisPool;
    private static JedisPoolConfig poolConfig;

    private static final int DEFAULT_MAX_TOTAL = 1000;
    private static final String REDIS_HOST = "182.61.42.218";
    private static final int REDIS_PORT = 5268;

    /**
     * 获取JedisPool
     *
     * @return
     */
    public static JedisPool getPool() {
        if (null == jedisPool) {
            initPool();
        }
        return jedisPool;
    }

    private static void initPool() {
        if (null == poolConfig) {
            poolConfig = new JedisPoolConfig();
            poolConfig.setMaxTotal(DEFAULT_MAX_TOTAL);
            poolConfig.setMaxIdle(100);
            poolConfig.setMinIdle(10);
            poolConfig.setMaxWaitMillis(1000L * 10);
        }
        jedisPool = new JedisPool(poolConfig, REDIS_HOST, REDIS_PORT);
    }

    public static void setPoolConfig(JedisPoolConfig jedisPoolConfig) {
        poolConfig = jedisPoolConfig;
    }


}
