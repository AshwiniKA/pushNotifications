


package com.springboot.pushNotifications.model;

public enum NotificationType {
	BROADCAST("Broadcast"),
	MULTICAST("multicast"),
	SINGLE_USER("singleUser");
	
	private String name;

	private NotificationType(String name) {
		this.name = name;
	}
}
