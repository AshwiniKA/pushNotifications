package com.springboot.pushNotifications.model;

import java.time.LocalDateTime;

import com.springboot.pushNotifications.model.Status;

public class NotificationStatus {
	private Long id;
	private Status status;
	private LocalDateTime timestamp;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
}
