package com.vehiclelicense.vehiclelicense.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity(name="Applicant_Tb")
public class Applicant {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="Applicant_Id")
  @NotNull(message="Applicant Id Should not null")
  private int applicantId;
  @Enumerated(value=EnumType.STRING)
  private Gender gender;
  @Column(name="First_Name")
  @NotNull(message="First_Name Should not null")
  private String firstName;
  @Column(name="Middle_Name")
  @NotNull(message="Middle_Name Should not null")
  private String middleName;
  @Column(name="Last_Name")
  @NotNull(message="Last_Name Should not null")
  private String lastName;
  @Temporal(value=TemporalType.DATE)
  @Column(name="DOB")
  @NotNull(message="Date Of Birth should not null")
  private Date dateOfBirth;
  @Column(name="Place_Of_Birth")
  @NotNull(message="Place Of Birth should not null")
  private String placeOfBirth;
  @Column(name="qualification ")
  @NotNull(message="Qualification Should not null")
  private String qualification;
  @Column(name="Mobile")
  @NotNull(message="Mobile Should not null")
  @Pattern(regexp="^[0-9]{10}$",message="mobile number should contain 10 digits")
  private String mobile;
  @Column(name="Email_Id")
  @NotNull(message="Email Should not null")
  @Email(message="Valid Email")
  private String email;
  @Column(name="Nationality")
  @NotNull(message="Nationality Should not null")
  private String nationality;
  @Column(name="Vehicle_Type")
  @NotNull(message="Vehicle Type not null")
  private String vehicleType;
  @Column(name="Vehicle_Number")
  @NotNull(message="Vehicle Number Should not null")
  @Pattern(regexp="^[A-Z]{2}[0-9]{2}[A-Z]{1,2}[0-9]{4}$")
  private String vehicleNumber;
  
public Applicant() {
	super();
}
public Applicant(int applicantId,Gender gender, String firstName, String middleName, String lastName, Date dateOfBirth,
		String placeOfBirth, String qualification, String mobile, String email, String nationality, String vehicleType,
		String vehicleNumber) {
	super();
	this.applicantId = applicantId;
	this.gender = gender;
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
	this.placeOfBirth = placeOfBirth;
	this.qualification = qualification;
	this.mobile = mobile;
	this.email = email;
	this.nationality = nationality;
	this.vehicleType = vehicleType;
	this.vehicleNumber = vehicleNumber;
}
public int getApplicantId() {
	return applicantId;
}
public void setApplicantId(int applicantId) {
	this.applicantId = applicantId;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getPlaceOfBirth() {
	return placeOfBirth;
}
public void setPlaceOfBirth(String placeOfBirth) {
	this.placeOfBirth = placeOfBirth;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public String getVehicleType() {
	return vehicleType;
}
public void setVehicleType(String vehicleType) {
	this.vehicleType = vehicleType;
}
public String getVehicleNumber() {
	return vehicleNumber;
}
public void setVehicleNumber(String vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}
@Override
public String toString() {
	return "Applicant [applicantId=" + applicantId + ", gender=" + gender + ", firstName=" + firstName + ", middleName="
			+ middleName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", placeOfBirth=" + placeOfBirth
			+ ", qualification=" + qualification + ", mobile=" + mobile + ", email=" + email + ", nationality="
			+ nationality + ", vehicleType=" + vehicleType + ", vehicleNumber=" + vehicleNumber + "]";
}

  
}
