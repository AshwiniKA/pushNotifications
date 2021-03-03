package com.springboot.pushNotifications.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.pushNotifications.model.NotificationStatus;
import com.springboot.pushNotifications.model.RestResponse;
import com.springboot.pushNotifications.service.AnalyticsService;

@RestController
public class AnalyticsController {
	@Autowired
	private AnalyticsService service;
	
	
		// endpoint for notification status updation.
		@RequestMapping(value="updateNotificationStatus",method=RequestMethod.POST)
		public RestResponse updateNotification(NotificationStatus notificationStatus) { 
			
			return service.saveStatusForAnalytics(notificationStatus);
		}
}
