package com.vehiclelicense.vehiclelicense.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name="Doocuments")
public class Documents {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Documents_Id")
	private int documentsId;
	@Column(name="Photo")
	@NotNull(message="Photo should not null")
     private String photo;
	@Column(name="Id_Proof")
	@NotNull(message="Id Proof should not null")
     private String idProof;
	@Column(name="Address_Proof")
	@NotNull(message="Addrerss Proof should not null")
     private String addressProof;
	
	public Documents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Documents(int documentsId, String photo, String idProof, String addressProof) {
		super();
		this.documentsId = documentsId;
		this.photo = photo;
		this.idProof = idProof;
		this.addressProof = addressProof;
	}
	public int getDocumentsId() {
		return documentsId;
	}
	public void setDocumentsId(int documentsId) {
		this.documentsId = documentsId;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	public String getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}
	@Override
	public String toString() {
		return "Documents [documentsId=" + documentsId + ", photo=" + photo + ", idProof=" + idProof + ", addressProof="
				+ addressProof + "]";
	}
	
	
}
