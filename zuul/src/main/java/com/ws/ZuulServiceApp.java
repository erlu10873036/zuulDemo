package com.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: wangshao
 * @date:2019年11月9日 下午1:00:58
 * @version :
 * 
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(ZuulServiceApp.class, args);
	}
}
