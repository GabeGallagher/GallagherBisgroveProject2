package com.revature.driver;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.pojos.Transactions;
import com.revature.util.ConnectionUtil;

public class test {

	public static void main(String[] args) {
		System.out.println("running");
		Session s = ConnectionUtil.getSession();
		System.out.println("Connection Made");
		
		Date utilDate = new Date(System.currentTimeMillis());
		System.out.println(utilDate);
		System.out.println("or");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(dateFormat.format(utilDate));
		String myDate = dateFormat.format(utilDate);
		Timestamp sq = new Timestamp(System.currentTimeMillis());
		Transactions deal = new Transactions(1, 2, 3, 4, utilDate, sq, 5);
		Transaction tx = s.beginTransaction();
		System.out.println("Transaction began");
		s.save(deal);
		System.out.println("saved");
		s.persist(deal);
		System.out.println("persisted");
		tx.commit();
		System.out.println("commited");
		s.disconnect();
		System.out.println("disconnected");
		s.close();
	}
}
