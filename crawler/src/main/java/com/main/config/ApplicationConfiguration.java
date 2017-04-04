package com.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration 
@EnableWebMvc
@ComponentScan(basePackages = "com.main")
public class ApplicationConfiguration extends WebMvcConfigurerAdapter {
		@Override
	    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	        configurer.enable();
	    }
	 	@Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	 		// set welcome file to index.html 
	        registry.addViewController("/").setViewName("forward:/index.html");
	    }	
	 
	    @Bean
	    public InternalResourceViewResolver jspViewResolver() {
	        InternalResourceViewResolver bean = new InternalResourceViewResolver();
	        bean.setPrefix("/WEB-INF/jsp/");
	        bean.setSuffix(".jsp");
	        return bean;
	    }
	    
	    


}
