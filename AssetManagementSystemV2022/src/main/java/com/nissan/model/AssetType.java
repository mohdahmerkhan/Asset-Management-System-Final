package com.nissan.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="AssetType")
public class AssetType {
	
	//declare variables
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int assetTypeId;
	
	private String assetTypeName;
	
	//for AssetType to  many Assets
	@JsonIgnore      //Avoid recursive
	@OneToMany(mappedBy="assetType")
	private List<Asset> assets;
	
	@JsonIgnore
	@OneToMany(mappedBy="assetType")
	private List<Vendor> vendors;
	
	//default constructor
	public AssetType() {
		
	}

	//parametrized constructor
	public AssetType(int assetTypeId, String assetTypeName) {
		super();
		this.assetTypeId = assetTypeId;
		this.assetTypeName = assetTypeName;
	}

	//getters and setters
	public int getAssetTypeId() {
		return assetTypeId;
	}

	public void setAssetTypeId(int assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public String getAssetTypeName() {
		return assetTypeName;
	}

	public void setAssetTypeName(String assetTypeName) {
		this.assetTypeName = assetTypeName;
	}

	public List<Asset> getAssets() {
		return assets;
	}

	public void setAssets(List<Asset> assets) {
		this.assets = assets;
	}
	
	

	public List<Vendor> getVendors() {
		return vendors;
	}

	public void setVendors(List<Vendor> vendors) {
		this.vendors = vendors;
	}

	//override toString
	@Override
	public String toString() {
		return "AssetType [assetTypeId=" + assetTypeId + ", assetTypeName=" + assetTypeName + ", assets=" + assets
				+ "]";
	}
	
	
		
		

}
