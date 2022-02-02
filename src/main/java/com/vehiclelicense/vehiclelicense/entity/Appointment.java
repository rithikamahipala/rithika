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

@Entity(name="Appointment")
public class Appointment {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="Appointment_Id")
     private int appointmentId;
     @Column(name="Appointment_Number")
     @NotNull(message="Appointment Number should be mandatory")
     private String appointmentNumber;
     @Temporal(value=TemporalType.DATE)
     @Column(name="Test_Date")
     @NotNull(message="Test Date should be mandatory")
     private Date testDate;
     @Column(name="Time_Slot")
     @NotNull(message="Time Slot should be mandatory")
     private String timeSlot;
     @Column(name="Test_Result")
     @NotNull(message="Test Result should be mandatory")
     private String testResult;
     
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(int appointmentId, String appointmentNumber, Date testDate, String timeSlot, String testResult) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentNumber = appointmentNumber;
		this.testDate = testDate;
		this.timeSlot = timeSlot;
		this.testResult = testResult;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getAppointmentNumber() {
		return appointmentNumber;
	}
	public void setAppointmentNumber(String appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public String getTestResult() {
		return testResult;
	}
	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentNumber=" + appointmentNumber
				+ ", testDate=" + testDate + ", timeSlot=" + timeSlot + ", testResult=" + testResult + "]";
	}
	
}
