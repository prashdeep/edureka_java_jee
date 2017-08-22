package com.edureka.java_j2ee.module8.onetomany;

import java.util.Date;

import org.hibernate.Session;

public class Client {

	public static void main(String[] args) {

		System.out.println("Hibernate one to many (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Stock stock = new Stock();
		stock.setStockCode("7052");
		stock.setStockName("PADINI");
		session.save(stock);

		StockDailyRecord stockDailyRecords = new StockDailyRecord();
		stockDailyRecords.setPriceOpen(new Float("1.2"));
		stockDailyRecords.setPriceClose(new Float("1.1"));
		stockDailyRecords.setPriceChange(new Float("10.0"));
		stockDailyRecords.setVolume(3000000L);
		stockDailyRecords.setDate(new Date());
		
		StockDailyRecord stockDailyRecords2 = new StockDailyRecord();
		stockDailyRecords2.setPriceOpen(new Float("1.2"));
		stockDailyRecords2.setPriceClose(new Float("1.1"));
		stockDailyRecords2.setPriceChange(new Float("10.0"));
		stockDailyRecords2.setVolume(3000000L);
		stockDailyRecords2.setDate(new Date());

		stockDailyRecords.setStock(stock);
		stockDailyRecords2.setStock(stock);
		
		stock.getStockDailyRecords().add(stockDailyRecords);
		stock.getStockDailyRecords().add(stockDailyRecords2);

		session.getTransaction().commit();
		
		//System.out.println(((Stock)session.get(Stock.class, 1)).getStockDailyRecords());
		//session.close();
		System.out.println("Done");
	}

}
