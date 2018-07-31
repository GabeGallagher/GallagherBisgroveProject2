package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Users {
	@Id
	@Column(name = "USERID")
	@SequenceGenerator(name="SEQ_USERID", sequenceName="SEQ_USERID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_USERID")
	private int usersID;
	
	@Column(name = "")
	private String fName;
	
	@Column(name = "")
	private String lName;
	
	@Column(name = "")
	private String street;
	
	@Column(name = "")
	private String city;
	
	@Column(name = "")
	private String state;
	
	@Column(name = "")
	private int zip;
	
	@Column(name = "")
	private String email;
	
	@Column(name = "")
	private double accountBal;
	
	public int getUsersID() {
		return usersID;
	}

	public void setUsersID(int usersID) {
		this.usersID = usersID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAccountBal() {
		return accountBal;
	}

	public void setAccountBal(double accountBal) {
		this.accountBal = accountBal;
	}

	public Users(int usersID, String fName, String lName, String street, String city, String state, int zip,
			String email, double accountBal) {
		super();
		this.usersID = usersID;
		this.fName = fName;
		this.lName = lName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
		this.accountBal = accountBal;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
