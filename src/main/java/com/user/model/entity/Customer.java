package com.user.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "CUSTOMER")
public class Customer  implements Serializable {

	//==========================
	//   Class variables
	//==========================

	private static final long serialVersionUID = 1L;

	//==========================
	//   instance variables
	//==========================

	private Long customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNumber;
	private Character gender;
	private boolean enabled;
	private String customerPrefernces;
	
	@Id
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	@Column(name = "enabled")
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getCustomerPrefernces() {
		return customerPrefernces;
	}
	public void setCustomerPrefernces(String customerPrefernces) {
		this.customerPrefernces = customerPrefernces;
	}

	@Override
	public String toString() {
		return "Customer [" + (customerId != null ? "customerId=" + customerId + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ (email != null ? "email=" + email + ", " : "")
				+ (password != null ? "password=" + password + ", " : "")
				+ (phoneNumber != null ? "phoneNumber=" + phoneNumber + ", " : "")
				+ (gender != null ? "gender=" + gender + ", " : "") + "enabled=" + enabled + ", "
				+ (customerPrefernces != null ? "customerPrefernces=" + customerPrefernces + ", " : "") + "]";
	}
	
}
