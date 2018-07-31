package com.revature.dao;

import java.util.List;

import com.revature.pojos.Transactions;

public interface Dao {

	
	public Transactions getTransaction(int id);
	
	public List<Transactions> getUsersTransactions(int id);
	
	public List<Transactions> getAllTransactions();
	
	public void createTransaction(int itemID, int quantity, int buyerID, double pricePerItem);
}
