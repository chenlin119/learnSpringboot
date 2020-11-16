package com.example.demo.service.impl;

import com.example.demo.dao.master.BaseUserDao;
import com.example.demo.domain.BaseUser;
import com.example.demo.service.BaseUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class BaseUserServiceImpl implements BaseUserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseUserServiceImpl.class);
    @Autowired
    private BaseUserDao userDao;

    @Autowired
    private RedisTemplate redisTemplate;

    
    public BaseUser getUserById(int id) {
        // 从缓存中获取城市信息
        String key = "user_" + id;
        ValueOperations<String, BaseUser> operations = redisTemplate.opsForValue();

        // 缓存存在
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            BaseUser user = operations.get(key);

            LOGGER.info("BaseUserServiceImpl.findCityById() : d从缓存中获取了城市 >> " + user.toString());
            return user;
        }

        // 从 DB 中获取城市信息
        BaseUser user = userDao.getUserById(id);

        // 插入缓存

        operations.set(key, user);
        LOGGER.info("BaseUserServiceImpl.findCityById() : 城市插入缓存 >> " + user.toString());
        return user;
    }
}
