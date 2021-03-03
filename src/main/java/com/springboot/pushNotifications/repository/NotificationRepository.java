package com.springboot.pushNotifications.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.pushNotifications.entity.Notification;

public interface NotificationRepository extends CrudRepository<Notification, Long>{

}
