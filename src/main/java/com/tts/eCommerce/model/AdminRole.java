package com.tts.eCommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminRole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "adminRole_id")
	private Long id;
	private String role;
	
	public AdminRole () {}

	public AdminRole(Long id, String role) {
		this.id = id;
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "AdminRole [id=" + id + ", role=" + role + "]";
	}
	
	
}
