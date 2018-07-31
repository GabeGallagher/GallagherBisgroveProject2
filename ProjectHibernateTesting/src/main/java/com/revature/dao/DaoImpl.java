package com.revature.dao;

import java.util.List;

import org.hibernate.Session;

import com.revature.pojos.Transactions;
import com.revature.util.ConnectionUtil;

public class DaoImpl implements Dao {

	public Transactions getTransaction(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Transactions> getUsersTransactions(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Transactions> getAllTransactions() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createTransaction(int itemID, int quantity, int buyerID, double pricePerItem) {
		// TODO Auto-generated method stub
		Session sess = ConnectionUtil.getSession();
		sess.beginTransaction();
		/**
		Transactions tx = new Transactions();
		tx.setBuyerID(buyerID);
		tx.setItemID(itemID);
		tx.setQuantity(quantity);
		tx.setPricePerItem(pricePerItem);
		tx.setDatePurchased(java.time.LocalDate.now());
		java.util.Date utilDate = new java.util.Date();
		java.sql.Timestamp sq = new java.sql.Timestamp(utilDate.getTime());
		tx.setTimePurchased(sq);
		**/
		
	}

}
