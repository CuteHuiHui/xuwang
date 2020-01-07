package com.xw.xuwang.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * 重写redisTemplate方法，注解必须使用@Autowired,并且名字必须为redisTemplate
 * @author huixia.hu
 * Date:     2019/12/17 11:36
 * @version 1.0
 */
@Configuration
public class RedisConfig {
    @Autowired
    private RedisTemplate redisTemplate;

    @Bean
    public RedisTemplate<String, Object> redisTemplate(){
        RedisSerializer<String> stringRedisSerializer = new StringRedisSerializer();
        RedisSerializer<Object> objectRedisSerializer = new GenericToStringSerializer<>(Object.class);
        redisTemplate.setKeySerializer(stringRedisSerializer);
        redisTemplate.setHashKeySerializer(stringRedisSerializer);
        redisTemplate.setValueSerializer(objectRedisSerializer);
        redisTemplate.setHashValueSerializer(objectRedisSerializer);
        return  redisTemplate;
    }

}
