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
import javax.validation.constraints.NotNull;

@Entity(name="Application")
public class Application {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Application_Id")
	private int applicationId;
	@Enumerated(value=EnumType.STRING)
	private ApplicationType applicationType;
	@Column(name="Application_Number")
	@NotNull(message="Application Number should be mandatory")
     private String applicationNumber;
	@Temporal(value=TemporalType.DATE)
	@Column(name="Application_Date")
	@NotNull(message="Application Date should be mandatory")
     private Date applicationDate;
    @Column(name="Mode_Of_Payment")
	@NotNull(message="Mode Of Payment should be mandatory")
     private String modeOfPayment;
     @Column(name="Amount_Paid")
	@NotNull(message="Amount Paid should be mandatory")
     private double amountPaid;
     @Column(name="Payment_Status")
	@NotNull(message="Payment Status should be mandatory")
     private String paymentStatus;
     @Enumerated(value=EnumType.STRING)
 	private ApplicationStatus applicationStatus;
     @Column(name="Remarks")
     private String remarks;
	
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Application(int applicationId, ApplicationType applicationType, String applicationNumber, Date applicationDate, String modeOfPayment, double amountPaid,
			String paymentStatus, ApplicationStatus applicationStatus, String remarks) {
		super();
		this.applicationId = applicationId;
		this.applicationType = applicationType;
		this.applicationNumber = applicationNumber;
		this.applicationDate = applicationDate;
		this.modeOfPayment = modeOfPayment;
		this.amountPaid = amountPaid;
		this.paymentStatus = paymentStatus;
		this.applicationStatus = applicationStatus;
		this.remarks = remarks;
	}
	
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public ApplicationType getApplicationType() {
		return applicationType;
	}
	public void setApplicationType(ApplicationType applicationType) {
		this.applicationType = applicationType;
	}
	public ApplicationStatus getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(ApplicationStatus applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", applicationType=" + applicationType
				+ ", applicationNumber=" + applicationNumber + ", applicationDate=" + applicationDate
				+ ", modeOfPayment=" + modeOfPayment + ", amountPaid=" + amountPaid + ", paymentStatus=" + paymentStatus
				+ ", applicationStatus=" + applicationStatus + ", remarks=" + remarks + "]";
	}
	
}
