package com.wyw.springboot.service.serviceImpl;

import com.wyw.springboot.service.serviceInterface.UserService;
import com.wyw.springboot.util.RedisUtil;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public void put(String key, Object value) {
        if (redisUtil.set(key, value) == true) {
            logger.info("redis set kv success");
        }else{
            logger.info("redis set kv failed");
        }
    }

    @Override
    public Object get(String key){
        return redisUtil.get(key);
    }
}
