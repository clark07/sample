package com.cs.springboot.sample.jersey;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by admin on 2016/11/2.
 */
@Component
@Path("/demo")
public class DemoApi {

	@GET
	@Path("/echo")
	public Response hello(@QueryParam(("message")) String message){
		String res = String.join(" ", "echo", message);
		return Response.ok(res).build();
	}

}
