package com.cs.springboot.sample.jersey;

/**
 * Created by admin on 2016/11/2.
 */

import com.cs.springboot.sample.redis.RedisApi;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig{

	private final static Logger logger = LoggerFactory.getLogger(JerseyConfig.class);

	public JerseyConfig() {
		logger.info("init JerseyConfig...");
		register(PreMatchFilter.class);
		register(PreMatchFilter1.class);
		register(PreMatchFilter2.class);
		register(ResponseFilter.class);
		register(ResponseFilter1.class);
		register(ResponseFilter2.class);
/*		register(ClientPreFilter.class);
		register(ClientPreFilter1.class);
		register(ClientPreFilter2.class);*/
		register(DemoApi.class);
		register(RedisApi.class);
	}
}
