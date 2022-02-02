package com.vehiclelicense.vehiclelicense.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity(name="Driving_License")
public class DrivingLicense {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Driving_License_Id")
	private int drivingLicenseId;
	@Column(name="Driving_License_Number")
	@NotNull(message="Driving License Number should be mandatory")
	@Pattern(regexp="^[a-zA-Z]{2}-\\d\\d-(19\\d\\d|20[01][0-9])-\\d{7}$")
	private String drivingLicenseNumber;
	@Temporal(value=TemporalType.DATE)
	@Column(name="Date_Of_Issue")
	@NotNull(message="Date of Issue should be mandatory")
	private Date dateOfIssue;
	@Temporal(value=TemporalType.DATE)
	@Column(name="Valid_Till")
	@NotNull(message="Valid Date should be mandatory")
	private Date validTill;
	
	public DrivingLicense() {
		super();
	}
	public DrivingLicense(int drivingLicenseId, String drivingLicenseNumber, Date dateOfIssue, Date validTill) {
		super();
		this.drivingLicenseId = drivingLicenseId;
		this.drivingLicenseNumber = drivingLicenseNumber;
		this.dateOfIssue = dateOfIssue;
		this.validTill = validTill;
	}
	public int getDrivingLicenseId() {
		return drivingLicenseId;
	}
	public void setDrivingLicenseId(int drivingLicenseId) {
		this.drivingLicenseId = drivingLicenseId;
	}
	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}
	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public Date getValidTill() {
		return validTill;
	}
	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}
	@Override
	public String toString() {
		return "DrivingLicense [drivingLicenseId=" + drivingLicenseId + ", drivingLicenseNumber=" + drivingLicenseNumber
				+ ", dateOfIssue=" + dateOfIssue + ", validTill=" + validTill + "]";
	}
	

}
