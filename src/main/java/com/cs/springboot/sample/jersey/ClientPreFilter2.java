package com.cs.springboot.sample.jersey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import java.io.IOException;

/**
 * Created by admin on 2016/11/3.
 */
@Priority(Priorities.USER+1)
public class ClientPreFilter2 implements ClientRequestFilter {
	
	private final static Logger log = LoggerFactory.getLogger(ClientPreFilter2.class);
		
	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {
		log.info("ClientPreFilter2...");
	}
}
