package com.sajal.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Authorize implements Serializable{

	private String id;
	
	private String Role;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}
	
}
