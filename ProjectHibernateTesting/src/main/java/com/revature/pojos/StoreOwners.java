package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STOREOWNERS")
public class StoreOwners {
	
	@Column(name="STOREID")
	private int storeID;
	
	@Column(name="OWNERID")
	private int ownerID;

	
	public StoreOwners() {
		// TODO Auto-generated constructor stub
	}


	public StoreOwners(int storeID, int ownerID) {
		super();
		this.storeID = storeID;
		this.ownerID = ownerID;
	}


	public int getStoreID() {
		return storeID;
	}


	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}


	public int getOwnerID() {
		return ownerID;
	}


	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}

}
