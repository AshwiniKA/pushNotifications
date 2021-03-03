package com.springboot.pushNotifications.model;


public class PushMessage {
	private Long id;
	private String Type;	// News (multicast)/  Notice (can be broadcast or sent to single user)
	private Category category;
	public PushMessage(Long id, String type, Category category) {
		super();
		this.id = id;
		Type = type;
		this.category = category;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
