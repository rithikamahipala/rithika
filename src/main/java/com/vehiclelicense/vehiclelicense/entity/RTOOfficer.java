package com.vehiclelicense.vehiclelicense.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity(name="RTO_Officer")
public class RTOOfficer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RTO_Officer_Id")
	private int rtoOfficerId;
	@Column(name="User_Name")
	@NotNull(message="User name should be mandatory")
	@Size(min=2,max=20)
    private String userName;
	@Column(name="Password")
	@NotNull(message="Password should be mandatory")
	@Pattern(regexp="^[A-Za-z0-9@*#!]{6,}$")
    private String password;
	@Column(name="Email_Id")
	@NotNull(message="Email Id should be mandatory")
	@Email(message="Invalid Email")
    private String email;
	
	public RTOOfficer() {
		super();
	}
	public RTOOfficer(int rtoOfficerId, String userName, String password, String email) {
		super();
		this.rtoOfficerId = rtoOfficerId;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public int getRtoOfficerId() {
		return rtoOfficerId;
	}
	public void setRtoOfficerId(int rtoOfficerId) {
		this.rtoOfficerId = rtoOfficerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	@Override
	public String toString() {
		return "RTOOfficer [rtoOfficerId=" + rtoOfficerId + ", userName=" + userName + ", password=" + password
				+ ", email=" + email + "]";
	}
	
	
}
