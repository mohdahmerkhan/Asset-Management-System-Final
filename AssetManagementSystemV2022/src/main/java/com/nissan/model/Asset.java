package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Asset")
public class Asset {
	
	//fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int assetID;
	
	@Column(nullable=false)
	private String assetName;
	
	private boolean ishardware;
	
	private int assetTypeId;
	
	@JoinColumn(name="assetTypeId",insertable=false,updatable=false)   
	@ManyToOne
	private AssetType assetType;
	
	//For One Asset Many AssetMaster
	@JsonIgnore
	@OneToMany(mappedBy = "asset", cascade = CascadeType.ALL)
	private List<AssetMaster> assetMaster;

	
    //default constructor
	public Asset() {
		
	}
	
	//parametrized constructor
	public Asset(int assetID, String assetName, boolean ishardware, int assetTypeId, AssetType assetType,
			List<AssetMaster> assetMaster) {
		super();
		this.assetID = assetID;
		this.assetName = assetName;
		this.ishardware = ishardware;
		this.assetTypeId = assetTypeId;
		this.assetType = assetType;
		this.assetMaster = assetMaster;
	}

	

	//getters and setters
	public int getAssetID() {
		return assetID;
	}

	
	public List<AssetMaster> getAssetMaster() {
		return assetMaster;
	}

	public void setAssetMaster(List<AssetMaster> assetMaster) {
		this.assetMaster = assetMaster;
	}

	public void setAssetID(int assetID) {
		this.assetID = assetID;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public boolean isIshardware() {
		return ishardware;
	}

	public void setIshardware(boolean ishardware) {
		this.ishardware = ishardware;
	}

	public int getAssetTypeId() {
		return assetTypeId;
	}

	public void setAssetTypeId(int assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	//overide tostring
	@Override
	public String toString() {
		return String.format(
				"Asset [assetID=%s, assetName=%s, ishardware=%s, assetTypeId=%s, assetType=%s, assetMaster=%s]",
				assetID, assetName, ishardware, assetTypeId, assetType, assetMaster);
	}
}
