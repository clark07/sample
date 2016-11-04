package com.cs.springboot.sample.jersey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import java.io.IOException;

/**
 * Created by admin on 2016/11/3.
 */
@Priority(Priorities.USER+1)
public class ResponseFilter2 implements ContainerResponseFilter {

	private final static Logger log = LoggerFactory.getLogger(ResponseFilter2.class);

	@Override
	public void filter(ContainerRequestContext requestContext,
					   ContainerResponseContext responseContext) throws IOException {
		log.info("ResponseFilter2");
	}
}
