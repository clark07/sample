package com.cs.springboot.sample.jersey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Created by admin on 2016/11/3.
 */
@Priority(Priorities.USER)
public class ClientPreFilter implements ClientRequestFilter {
	
	private final static Logger log = LoggerFactory.getLogger(ClientPreFilter.class);
		
	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {
		log.info("ClientPreFilter...");
		if (requestContext.getHeaders().get("Client-Name") == null) {
			requestContext.abortWith(Response.status(Response.Status.BAD_REQUEST)
											 .entity("Client-Name header must be defined.").build());
		}
	}
}
