package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STOREFRONT")
public class StoreFront {

	@Id
	@Column(name = "STOREID")
	@SequenceGenerator(name="SEQ_USERID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_USERID")
	private int storeID;
	
	@Column(name="STORENAME")
	private String storeName;
	
	@Column(name="ACCOUNTBAL")
	private double accountBal;
	
	@Column(name="STREET")
	private String street;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="ZIP")
	private int zip;
	
	public StoreFront() {
		// TODO Auto-generated constructor stub
	}

	public StoreFront(int storeID, String storeName, double accountBal, String street, String city, String state,
			int zip) {
		super();
		this.storeID = storeID;
		this.storeName = storeName;
		this.accountBal = accountBal;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public int getStoreID() {
		return storeID;
	}

	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public double getAccountBal() {
		return accountBal;
	}

	public void setAccountBal(double accountBal) {
		this.accountBal = accountBal;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

}
