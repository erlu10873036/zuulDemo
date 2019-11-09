package com.ws.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * @author: wangshao
 * @date:2019年11月9日 下午1:25:37
 * @version :
 * 
 */
public class ErrorFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Route Filter");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "ErrorFilter";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
