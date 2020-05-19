package com.inn.myapp.base.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.inn.myapp.base.abstracts.entity.AbstractEntity;

@Table(name="User")
@Entity
public class User extends AbstractEntity<Integer> {

	@Basic
	@Column(name="username")
	private String userName;
	
	@Basic
	@Column(name="mobileno")
	private String mobileNo;
	
	@Basic
	@Column(name="firstname")
	private String firstName;
	
	@Basic
	@Column(name="lastname")
	private String lastName;
	
	@Basic
	@Column(name="middlename")
	private String middleName;
	
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Basic
	@Column(name="username")
	private Integer age;

	
	@Basic
	@Column(name="username")
	private String email;
	
	
}
