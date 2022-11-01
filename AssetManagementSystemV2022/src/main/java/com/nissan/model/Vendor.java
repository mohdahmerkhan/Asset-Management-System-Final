package com.nissan.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Vendor")
public class Vendor {

	//Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendorId;
	
	@Column(nullable=false)
	private String vendorName;
	private Date validFrom;
	private Date validTo;
	private String address;
	private int vendortypeId;
	private int assetTypeId;
	
	@JoinColumn(name ="vendortypeId" ,insertable=false,updatable=false)
	@ManyToOne
	private VendorType vendorType;
	
	@JoinColumn(name ="assetTypeId" ,insertable=false,updatable=false)
	@ManyToOne
	private AssetType assetType;

	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendor(int vendorId, String vendorName, Date validFrom, Date validTo, String address, int vendortypeId,
			int assetTypeId) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.address = address;
		this.vendortypeId = vendortypeId;
		this.assetTypeId = assetTypeId;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getVendortypeId() {
		return vendortypeId;
	}

	public void setVendortypeId(int vendortypeId) {
		this.vendortypeId = vendortypeId;
	}

	public int getAssetTypeId() {
		return assetTypeId;
	}

	public void setAssetTypeId(int assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public VendorType getVendorType() {
		return vendorType;
	}

	public void setVendorType(VendorType vendorType) {
		this.vendorType = vendorType;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", validFrom=" + validFrom + ", validTo="
				+ validTo + ", address=" + address + ", vendortypeId=" + vendortypeId + ", assetTypeId=" + assetTypeId
				+ ", vendorType=" + vendorType + ", assetType=" + assetType + "]";
	}
	
	
	
	
}
