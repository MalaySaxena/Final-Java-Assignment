package customer;

import org.hibernate.Session;

import util.HibernateUtil;

import entity.Product;

public class orderdetails {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
			session.beginTransaction();
			
			
}

}
