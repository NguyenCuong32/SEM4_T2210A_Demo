package org.fai.example.demo_redis.controller;

import org.fai.example.demo_redis.entity.StringEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/v1")
public class RedisController {
    @Autowired
    RedisTemplate<String,String> redisTemplate;
    private final String KEY_PREFIX = "com.fai.demo_redis";
    @PostMapping("/addkey")
    public void addKey(@RequestBody StringEntity entity){
        String fullKey = KEY_PREFIX + entity.getKey();
        redisTemplate.expire(fullKey,3, TimeUnit.MINUTES);
        redisTemplate.opsForValue().set(entity.getKey(),entity.getValue());
    }
    @GetMapping("/getkey")
    public void GetKey(@RequestParam String key){
        String fullKey = KEY_PREFIX + key;
    }
}
