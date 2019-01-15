package com.zhouyu.dmutex.redlock;

import javax.annotation.PostConstruct;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 获取RedissonClient连接类
 */
@Component
public class RedissonConnector {

    @Autowired
    RedissonConfig redissonConfig;

    
    RedissonClient redisson;
    @PostConstruct
    public void init(){
        redisson = redissonConfig.getRedisson();
    }

    public RedissonClient getClient(){
        return redisson;
    }

}