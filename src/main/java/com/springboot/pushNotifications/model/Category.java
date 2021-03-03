package com.springboot.pushNotifications.model;

public enum Category {
	SPORTS("sports"),
	ADVERTISEMENT("advertisement"),
	POLITICS("politics");
	
	private String name;

	private Category(String name) {
		this.name = name;
	}
}
