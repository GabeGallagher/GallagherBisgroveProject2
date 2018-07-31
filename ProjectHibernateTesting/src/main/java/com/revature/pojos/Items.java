package com.revature.pojos;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="ITEMS")
public class Items {
	
	@Id
	@Column(name = "ITEMID")
	@SequenceGenerator(name="SEQ_ITEMID", sequenceName="SEQ_ITEMID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ITEMID")
	private int itemID;
	
	@Column(name = "ITEMNAME")
	private String itemName;
	
	@Column(name = "SELLERID")
	private int sellerID;
	
	@Column(name = "ITEMDESCRIPTION")
	private String itemDescription;
	
	@Column(name = "PRICE")
	private double price;
	
	@Column(name = "QUANTITY")
	private int quantity;
	
	@Column(name="DATEPOSTED")
	//@Temporal(TemporalType.DATE)
	private LocalDate datePosted;
	
	@Column(name="TIMEPOSTED")
	//@Temporal(TemporalType.TIMESTAMP)
	private Timestamp timePosted;
	
	@Column(name="DATELASTUPDATED")
	//@Temporal(TemporalType.DATE)
	private LocalDate dateLastUpdated;
	
	@Column(name="TIMELASTUPDATED")
	//@Temporal(TemporalType.TIMESTAMP)
	private Timestamp timeLastUpdated;
	

	public Items() {
		// TODO Auto-generated constructor stub
	}


	public Items(int itemID, String itemName, int sellerID, String itemDescription, double price, int quantity,
			LocalDate datePosted, Timestamp timePosted, LocalDate dateLastUpdated, Timestamp timeLastUpdated) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.sellerID = sellerID;
		this.itemDescription = itemDescription;
		this.price = price;
		this.quantity = quantity;
		this.datePosted = datePosted;
		this.timePosted = timePosted;
		this.dateLastUpdated = dateLastUpdated;
		this.timeLastUpdated = timeLastUpdated;
	}


	public int getItemID() {
		return itemID;
	}


	public void setItemID(int itemID) {
		this.itemID = itemID;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public int getSellerID() {
		return sellerID;
	}


	public void setSellerID(int sellerID) {
		this.sellerID = sellerID;
	}


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public LocalDate getDatePosted() {
		return datePosted;
	}


	public void setDatePosted(LocalDate datePosted) {
		this.datePosted = datePosted;
	}


	public Timestamp getTimePosted() {
		return timePosted;
	}


	public void setTimePosted(Timestamp timePosted) {
		this.timePosted = timePosted;
	}


	public LocalDate getDateLastUpdated() {
		return dateLastUpdated;
	}


	public void setDateLastUpdated(LocalDate dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}


	public Timestamp getTimeLastUpdated() {
		return timeLastUpdated;
	}


	public void setTimeLastUpdated(Timestamp timeLastUpdated) {
		this.timeLastUpdated = timeLastUpdated;
	}

}
