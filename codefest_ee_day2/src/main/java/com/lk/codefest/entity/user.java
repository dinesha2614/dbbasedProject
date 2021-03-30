package com.lk.codefest.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class user implements Serializable  {
	
	private static final long serialVersionUID=1L;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public user(int id, String name, int telephone, String username, String password, int age) {
		super();
		this.id = id;
		Name = name;
		this.telephone = telephone;
		Username = username;
		Password = password;
		this.age = age;
	}
	
	public user(){
		
	}

	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String Name;
	int telephone;
	String Username;
	String Password;
	int age;
	
	
}
