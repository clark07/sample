package com.cs.springboot.sample.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by admin on 2016/11/3.
 */
@Service
public class RedisManager {

	@Autowired
	private StringRedisTemplate template;


	public String getStringValue(String key){
		return template.opsForValue().get(key);
	}


	public void setSringValue(String key, String value) {
		template.opsForValue().set(key, value);
	}
}
