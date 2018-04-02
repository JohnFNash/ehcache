package com.johnfnash.study.ehcache.entity;

import java.io.Serializable;

public class Dog implements Serializable {
	private static final long serialVersionUID = 5789849946153025346L;
	
	private long id;
	private String type;

	public Dog() {
		super();
	}

	public Dog(long id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "[id: " + this.id + ", type:" + type + "]";
	}
	

}
