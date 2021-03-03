package com.springboot.pushNotifications.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.pushNotifications.model.NotificationType;
import com.springboot.pushNotifications.model.PushMessage;
import com.springboot.pushNotifications.model.RestResponse;
import com.springboot.pushNotifications.model.User;
import com.springboot.pushNotifications.service.NotificationService;
import com.springboot.pushNotifications.service.NotificationServiceFactory;

/*
 * These endpoints will be called by the other Modules when they want to send a push notification to the user.
 */

@RestController
public class PublishController {
	
	@Autowired
	NotificationServiceFactory factory;
	
	@RequestMapping(value="publishToAll",method=RequestMethod.POST)
	public RestResponse publishNoticeToAll(PushMessage newsObj) { 
		
		NotificationService service = factory.getNotificationService(NotificationType.BROADCAST);
		RestResponse response = service.sendNotification(newsObj, null);
		
		return response;
	}
	
	// endpoint for publishing news i.e. multicast news to users based on their subscriptions.
	@RequestMapping(value="publishNews",method=RequestMethod.POST)
	public RestResponse publishNews(PushMessage newsObj) { 
		
		NotificationService service = factory.getNotificationService(NotificationType.MULTICAST);
		RestResponse response = service.sendNotification(newsObj, null);
		
		return response;
	}
	
	// endpoint for notifying single user.
	@RequestMapping(value="publishToUser",method=RequestMethod.POST)
	public RestResponse publishNoticeForUser(PushMessage newsObj, User user) {
		NotificationService service = factory.getNotificationService(NotificationType.SINGLE_USER);
		RestResponse response = service.sendNotification(newsObj, user);
		
		return response;
	}

}
