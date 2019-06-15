package customer;

import org.hibernate.Session;

import util.HibernateUtil;

import entity.Customer;

public class viewprodet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Customer customobj = new Customer();
		

	}

}
