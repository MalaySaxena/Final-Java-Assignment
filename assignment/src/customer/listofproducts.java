package customer;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

import entity.Product;

public class listofproducts {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
		         @SuppressWarnings("rawtypes")
				List products = session.createQuery("FROM product").list(); 
		         for (@SuppressWarnings("rawtypes")
				Iterator iterator = products.iterator(); iterator.hasNext();){
		            Product product = (Product) iterator.next(); 
		            System.out.println("---------------------------------------------");
		            System.out.print("Product Id: " + product.getPrId()); 
		            System.out.print("  Product Name: " + product.getPrName()); 
		            System.out.println("  Product Price: " + product.getPrice()); 
		            System.out.println("  Product Quantity: " + product.getQuantity()); 
		            System.out.println("---------------------------------------------"); 
			      }
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
			
		}

}
