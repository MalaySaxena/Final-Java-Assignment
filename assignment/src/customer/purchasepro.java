package customer;

import org.hibernate.Session;

import util.HibernateUtil;

import entity.Product;

public class purchasepro {
	static Session session = HibernateUtil.getSessionFactory().openSession();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		session.beginTransaction();
		
		System.out.println("To add product select option from the list");
		
	}

}