package com.cs.springboot.sample.jersey;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Priority;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import java.io.IOException;

/**
 * Created by admin on 2016/11/2.
 */

@PreMatching
@Priority(Priorities.USER)
public class PreMatchFilter implements ContainerRequestFilter {

	private final static Logger log = LoggerFactory.getLogger(PreMatchFilter.class);

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		log.info("PreMatchFilter...");

		String redirectMethod = requestContext.getHeaderString("redirectMethod");

		if(StringUtils.isNotBlank(redirectMethod)){
			log.info(String.format("redirect url:%s [%s-->%s]", requestContext.getUriInfo().getPath(),requestContext.getMethod(), redirectMethod));

			requestContext.setMethod(redirectMethod);
		}

	}
}
