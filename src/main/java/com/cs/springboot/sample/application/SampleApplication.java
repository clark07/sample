package com.cs.springboot.sample.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * Created by admin on 2016/11/2.
 */
@SpringBootApplication
@ComponentScans({@ComponentScan("com.cs.springboot.sample.*")})
public class SampleApplication extends SpringBootServletInitializer {

	private final static Logger log = LoggerFactory.getLogger(SampleApplication.class);
	
	public static void main(String[] args) {
		log.info("execute main method...");

		new SampleApplication().configure(new SpringApplicationBuilder(SampleApplication.class)).run(args);
	}

/*	@Bean
	public ServletRegistrationBean jerseyServlet() {
		ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "");
		// our rest resources will be available in the path /rest
		registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
		return registration;
	}*/
}
