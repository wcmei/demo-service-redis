package com.wcmei.demo.service.redis.service.impl;

import com.sun.org.apache.regexp.internal.RE;
import com.wcmei.demo.service.redis.service.RedisService;
import org.apache.commons.lang.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @author wcmei
 * @date 2019-12-13
 * @description
 */
@Service(version = "1.0.0", protocol = "dubbo")
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void set(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public void set(String key, Object value, int seconds) {
        redisTemplate.opsForValue().set(key, value, seconds, TimeUnit.SECONDS);
    }

    @Override
    public void delete(String key) {
        redisTemplate.delete(key);
    }

    @Override
    public String get(String key) {
        if (StringUtils.isBlank(key))
            return null;
        Object o = redisTemplate.opsForValue().get(key);
        return null == o ? null : o.toString();
    }

    public boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }
}
