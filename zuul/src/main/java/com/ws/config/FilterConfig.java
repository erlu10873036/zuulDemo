package com.ws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ws.filter.ErrorFilter;
import com.ws.filter.PostFilter;
import com.ws.filter.PreFilter;
import com.ws.filter.RouteFilter;

/**
 * @author: wangshao
 * @date:2019年11月9日 下午1:27:36
 * @version :
 * 
 */
@Configuration
public class FilterConfig {

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
