package com.springboot.pushNotifications.model;

public enum Status {
	SENT("Sent"),
	RECEIVED("Received"),
	IGNORED("Ignored"),
	DELETED("Deleted");
	
	private String name;

	private Status(String name) {
		this.name = name;
	}
}
