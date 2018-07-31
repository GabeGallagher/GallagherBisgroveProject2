package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNTS")
public class Accounts {

	@Id
	@Column(name="ACCOUNTID")
	@SequenceGenerator(name="SEQ_ACCOUNTID", sequenceName="SEQ_ACCOUNTID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ACCOUNTID")
	private int accountID;
	
	@Column(name="USERNAME")
	private String userName;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ISADMIN")
	private boolean isAdmin;

	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accounts(int accountID, String userName, String password, boolean isAdmin) {
		super();
		this.accountID = accountID;
		this.userName = userName;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	
}
