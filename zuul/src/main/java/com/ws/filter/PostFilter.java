package com.ws.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * @author: wangshao
 * @date:2019年11月9日 下午1:25:37
 * @version :
 * 
 */
public class PostFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "PostFilter";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		System.out.println("Inside Response Filter");

		return null;
	}

}
