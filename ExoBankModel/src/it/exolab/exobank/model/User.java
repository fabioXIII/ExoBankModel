package it.exolab.exobank.model;

import java.io.Serializable;

public class User implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userID;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Role roleID;
	private String taxID;
	
	

	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
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
	public Role getRoleID() {
		return roleID;
	}
	public void setRoleID(Role roleID) {
		this.roleID = roleID;
	}
	public String getTaxID() { 
		return taxID;
	}
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}
	
	
}
