package com.springboot.pushNotifications.service;

import org.springframework.stereotype.Service;

import com.springboot.pushNotifications.model.NotificationStatus;
import com.springboot.pushNotifications.model.RestResponse;

@Service
public class AnalyticsServiceImpl implements AnalyticsService{

	@Override
	public RestResponse saveStatusForAnalytics(NotificationStatus notificationStatus) {
		// TODO Auto-generated method stub
		// use jpa repository to save the notification status object.
		
		return null;
	}
	

	
}
