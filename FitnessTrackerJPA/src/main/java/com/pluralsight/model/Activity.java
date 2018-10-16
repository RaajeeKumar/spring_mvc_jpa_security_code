package com.pluralsight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Activity {

	private Long id;
	
	private String desc;

	public String getDesc() {
		return desc;
	}

	public Long getId() {
		return id;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
