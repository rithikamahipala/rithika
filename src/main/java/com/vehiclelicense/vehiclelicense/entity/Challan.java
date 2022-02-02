package com.vehiclelicense.vehiclelicense.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity(name="Challan")
public class Challan {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Challan_Id")
	private int challanId;
	@Column(name="Challan_Number")
	@NotNull(message="Challan Number should be mandatory")
	private String challanNumber;
	@Column(name="Vehicle_Number")
	@NotNull(message="Vehicle Number should be mandatory")
	@Pattern(regexp="^[A-Z]{2}[0-9]{2}[A-Z]{1,2}[0-9]{4}$")
	private String vehicleNumber;
	@Column(name="Amount")
	private double amount;
	
	public Challan() {
		super();
	}
	public Challan(int challanId, String challanNumber, String vehicleNumber, double amount) {
		super();
		this.challanId = challanId;
		this.challanNumber = challanNumber;
		this.vehicleNumber = vehicleNumber;
		this.amount = amount;
	}
	public int getChallanId() {
		return challanId;
	}
	public void setChallanId(int challanId) {
		this.challanId = challanId;
	}
	public String getChallanNumber() {
		return challanNumber;
	}
	public void setChallanNumber(String challanNumber) {
		this.challanNumber = challanNumber;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Challan [challanId=" + challanId + ", challanNumber=" + challanNumber + ", vehicleNumber="
				+ vehicleNumber + ", amount=" + amount + "]";
	}
	
	
}
