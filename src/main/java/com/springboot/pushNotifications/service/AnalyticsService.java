package com.springboot.pushNotifications.service;

import org.springframework.stereotype.Service;

import com.springboot.pushNotifications.model.NotificationStatus;
import com.springboot.pushNotifications.model.RestResponse;

//exposes a method that saves the notifiction status to the DB for analytics purposes
@Service
public interface AnalyticsService {
	RestResponse saveStatusForAnalytics(NotificationStatus notificationStatus);
}
