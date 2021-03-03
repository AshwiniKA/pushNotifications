package com.springboot.pushNotifications.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Message")
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="cateogory")
	private String cateogory;
	
	@Column(name="title")
	private String title;
	
	@Column(name="body")
	private String body;

	public Message(Long id, String cateogory, String title, String body) {
		super();
		this.id = id;
		this.cateogory = cateogory;
		this.title = title;
		this.body = body;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCateogory() {
		return cateogory;
	}

	public void setCateogory(String cateogory) {
		this.cateogory = cateogory;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
