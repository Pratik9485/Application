package com.inn.myapp;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication(scanBasePackages = {"com.inn.myapp"})
@ComponentScan
public class Starter extends SpringBootServletInitializer implements WebApplicationInitializer{
	
	   @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return configureApplication(builder);
	    }

	    public static void main(String[] args) {
	        configureApplication(new SpringApplicationBuilder()).run(args);
	    }

	    private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
	        return builder.sources(Starter.class).bannerMode(Banner.Mode.OFF);
	    }

	
}
