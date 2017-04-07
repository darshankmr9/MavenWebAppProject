package com.sajal.shoppingcart.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;

@Entity
@Component("user")
public class User implements Serializable {

	@Id
	private String id;
	@NotNull
	private String username;
	@NotNull
	private String password;
	@Email
	private String email;
	@NumberFormat
	private String contact;
	private boolean Enabled;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public boolean getEnabled() {
		return Enabled;
	}

	public void setEnabled(Boolean enabled) {
		Enabled = enabled;
	}

	public User() {
	}

}