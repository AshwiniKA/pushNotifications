package com.springboot.pushNotifications.service;

import com.springboot.pushNotifications.model.PushMessage;
import com.springboot.pushNotifications.model.RestResponse;
import com.springboot.pushNotifications.model.User;

/*implemented by different kinds of notification services like Broadcast/ single user / multicast
//exposes method to send the given object to users*/

public interface NotificationService {
	RestResponse sendNotification(PushMessage pushObj, User user);
}
