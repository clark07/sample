package com.cs.springboot.sample.redis;

import com.cs.springboot.sample.redis.RedisManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by admin on 2016/11/2.
 */
@Component
@Path("/redis")
public class RedisApi {

	@Autowired
	private RedisManager redisManager;

	@GET
	@Path("/get")
	public Response getKey(@QueryParam(("key")) String key){
		String value = redisManager.getStringValue(key);
		return Response.ok(value).build();
	}

	@GET
	@Path("/set")
	public Response setKey(@QueryParam(("key")) String key, @QueryParam("value") String value){
		redisManager.setSringValue(key, value);
		return Response.ok("ok").build();
	}

}
