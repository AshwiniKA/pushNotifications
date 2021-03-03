package com.springboot.pushNotifications.service;

import com.springboot.pushNotifications.service.NotificationService;

import org.springframework.stereotype.Service;

import com.springboot.pushNotifications.model.PushMessage;
import com.springboot.pushNotifications.model.RestResponse;
import com.springboot.pushNotifications.model.User;

@Service
public class MulticastNotificationService implements NotificationService {

	@Override
	public RestResponse sendNotification(PushMessage pushObj, User user) {
		// TODO Auto-generated method stub
		
		// 1. find all users from the category and from that, find all distinct device ids.
		// 2. Save notification with status "Sent"
	    // 3. send notification to all the selected devices
		
		//user can be assumed null
		return new RestResponse();
	}

}
