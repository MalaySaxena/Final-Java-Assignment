package user;

import org.hibernate.Session;

import util.HibernateUtil;
import entity.Customer;
import entity.Product;

public class userfunc {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Customer customer = new Customer(1, "Ram");
		Product product = new Product(1,"Fridge",1000.55,50);
		
		session.save(customer);    
		session.save(product);
        
		session.getTransaction().commit();
		session.close();
		

		
		
		
		
		
		
		
		
	}

}
