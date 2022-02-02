package com.vehiclelicense.vehiclelicense.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name="RTO_Office")
public class RTOOffice {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RTO_Id")
	@NotNull(message="Rto Id should be mandatory")
   private int rtoId;
	@Column(name="RTO_Name")
	@NotNull(message="RTO name should be mandatory")
   private String rtoName;
	
	public RTOOffice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RTOOffice(int rtoId, String rtoName) {
		super();
		this.rtoId = rtoId;
		this.rtoName = rtoName;
	}
	public int getRtoId() {
		return rtoId;
	}
	public void setRtoId(int rtoId) {
		this.rtoId = rtoId;
	}
	public String getRtoName() {
		return rtoName;
	}
	public void setRtoName(String rtoName) {
		this.rtoName = rtoName;
	}
	@Override
	public String toString() {
		return "RTOOffice [rtoId=" + rtoId + ", rtoName=" + rtoName + "]";
	}
	
}
