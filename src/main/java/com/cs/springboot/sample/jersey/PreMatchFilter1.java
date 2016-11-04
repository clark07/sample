package com.cs.springboot.sample.jersey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import java.io.IOException;

/**
 * Created by admin on 2016/11/2.
 */

@PreMatching
@Priority(Priorities.USER-1)
public class PreMatchFilter1 implements ContainerRequestFilter {

	private final static Logger log = LoggerFactory.getLogger(PreMatchFilter1.class);

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		log.info("PreMatchFilter1...");
	}
}
