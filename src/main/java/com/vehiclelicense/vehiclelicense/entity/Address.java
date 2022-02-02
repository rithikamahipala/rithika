package com.vehiclelicense.vehiclelicense.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity(name="Address")
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Address_Id")
    private int addressId;
    @NotNull(message="State name should be mandatory")
    //@Column(name="State_Name")
    private String state;
    //@Column(name="City_Name")
    @NotNull(message="City name should not be null")
    private String city;
    //@Column(name="House_Name")
    @NotNull(message="House name should not be null")
    private String house;
    @Column(name="Land_Mark")
    @NotNull(message="LandMark should not null")
    private String landmark;
    @Column(name="Pincode")
    @NotNull(message="PinCode should not be null")
    @Pattern(regexp="^[1-9]{1}[0-9]{5}$",message="pincode number should not contain letters")
    private String pincode;
    
	public Address() {
		super();
	}
	public Address(int addressId, String state, String city, String house, String landmark, String pincode) {
		super();
		this.addressId=addressId;
		this.state = state;
		this.city = city;
		this.house = house;
		this.landmark = landmark;
		this.pincode = pincode;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", state=" + state + ", city=" + city + ", house=" + house
				+ ", landmark=" + landmark + ", pincode=" + pincode + "]";
	}
	
    
}
