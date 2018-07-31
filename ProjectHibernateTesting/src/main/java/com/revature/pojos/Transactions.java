package com.revature.pojos;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

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
@Table(name="TRANSACTIONS")
public class Transactions {

	
	@Id
	@Column(name="TRANSACTIONID")
	@SequenceGenerator(name="SEQ_TRANSACTIONID", sequenceName="SEQ_TRANSACTIONID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_TRANSACTIONID")
	private int transactionID;
	
	@Column(name="ITEMID")
	private int itemID;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="BUYERID")
	private int buyerID;
	//@Temporal(TemporalType.DATE)
	@Column(name="DATEPURCHASED")
	private java.sql.Date datePurchased;
	
	@Column(name="TIMEPURCHASED")
	//@Temporal(TemporalType.TIMESTAMP)
	private Timestamp timePurchased;
	
	@Column(name="PRICEPERITEM")
	private double pricePerItem;

	public Transactions(int i, int j, int k, int l, java.sql.Date utilDate, Timestamp sq, int m) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transactions(int transactionID, int itemID, int quantity, int buyerID, java.sql.Date datePurchased,
			Timestamp timePurchased, double pricePerItem) {
		super();
		this.transactionID = transactionID;
		this.itemID = itemID;
		this.quantity = quantity;
		this.buyerID = buyerID;
		this.datePurchased = datePurchased;
		this.timePurchased = timePurchased;
		this.pricePerItem = pricePerItem;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getBuyerID() {
		return buyerID;
	}

	public void setBuyerID(int buyerID) {
		this.buyerID = buyerID;
	}

	public java.sql.Date getDatePurchased() {
		return datePurchased;
	}

	public void setDatePurchased(java.sql.Date localDate) {
		this.datePurchased = localDate;
	}

	public Timestamp getTimePurchased() {
		return timePurchased;
	}

	public void setTimePurchased(Timestamp sq) {
		this.timePurchased = sq;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
}
