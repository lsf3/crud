package com.sf.helloworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
	/*
	public void addViewControllers(ViewControllerRegistry registry) {
		
		registry.addViewController("/sf").setViewName("success");
		
	}
	*/
	@Bean
	public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
		WebMvcConfigurerAdapter adapter= new WebMvcConfigurerAdapter() {

			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("login");
				registry.addViewController("/suc").setViewName("success");
				registry.addViewController("/success").setViewName("success");
				
				
				
				// TODO Auto-generated method stub
				super.addViewControllers(registry);
			}
			
		};
		
		return adapter;
		
	}

}
