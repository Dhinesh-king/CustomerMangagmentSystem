package com.employee.web.entity;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users_tab")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	@Column
	private String name;
	@Column
	@Size(min=5,message="required")
	private String username;
	@Column
	private String password;
	@Column
	private String email;
	@Column
	private String gender;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "roles_tab", joinColumns = @JoinColumn(name = "uid"))
	@Column(name = "role")
	private Set<String> urole;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Set<String> getUrole() {
		return urole;
	}

	public void setUrole(Set<String> urole) {
		this.urole = urole;
	}

	public User(Integer uid, String name, String username, String password, String email, String gender,
			Set<String> urole) {
		super();
		this.uid = uid;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.urole = urole;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
