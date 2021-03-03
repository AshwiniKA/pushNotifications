package com.springboot.pushNotifications.service;

import org.springframework.stereotype.Component;

import com.springboot.pushNotifications.model.NotificationType;

@Component
public class NotificationServiceFactory {
public NotificationService getNotificationService(NotificationType type) {
		
		if(NotificationType.BROADCAST.equals(type)) {
			return new BroadcastNotificationService();
		}
		else if(NotificationType.MULTICAST.equals(type)) {
			return new MulticastNotificationService();
		}
		else {
			return new SingleUserNotificationService();
		}
		
	}
}
