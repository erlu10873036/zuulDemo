package com.ws.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ws.entity.Achun;

/**
 * @author: wangshao
 * @date:2019年11月9日 下午1:04:35
 * @version :
 * 
 */
@RestController
public class AchunController {

	@RequestMapping(value = "/echoAchunName/{name}")
	public String echoAchunName(@PathVariable(name = "name") String name) {
		return "Hello " + name + ", Nice to meet you! with time:"
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

	@RequestMapping(value = "/getAchunDetails/{name}")
	public Achun getAchunDetails(@PathVariable(name = "name") String name) {
		return new Achun(name, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
