package com.giriarte.hellodevops.hellodevops.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Student")
public class CacheElement {
	private String id;
	private Integer quantity;

	public CacheElement() {
	}

	public CacheElement(String id, Integer quantity) {
		this.id = id;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
