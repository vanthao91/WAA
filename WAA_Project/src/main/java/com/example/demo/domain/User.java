package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.demo.validation.UserName;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@JsonIgnore
	private Integer id;
	
	@NotBlank
	@Size(min = 4, max = 50, message = "{user.username.size}")
	@UserName
	private String username;
	
	@NotBlank
	private String password;
	private Boolean active;
	
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "person_id")//, nullable = false) 
	private Person person;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;
	
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
