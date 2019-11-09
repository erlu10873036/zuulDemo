package com.ws.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * @author: wangshao
 * @date:2019年11月9日 下午1:05:19
 * @version :
 * 
 */
@Component
public class Lulu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	private String date;

	private String status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Lulu(String name, String date) {
		super();
		this.name = name;
		this.date = date;
		this.status = "lulu love achun forever";
	}

	public Lulu() {
	}

}
