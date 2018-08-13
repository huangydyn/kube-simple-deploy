package com.thoughtworks;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class CountController {
    private final ValueOperations<String, Integer> opsForValue;
    private final RedisTemplate redisTemplate;
    private final String KEY = "count";

    public CountController(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.opsForValue = redisTemplate.opsForValue();
    }

    @GetMapping("/count")
    public ClickCounter countOn() {
        if (redisTemplate.hasKey(KEY)) {
            Integer count = opsForValue.get(KEY) + 1;
            opsForValue.set(KEY, count);
            return new ClickCounter(count);
        } else {
            opsForValue.set(KEY, 1, 10, TimeUnit.MINUTES);
            return new ClickCounter(1);
        }
    }
}
