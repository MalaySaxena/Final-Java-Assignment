package user;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Customer;
import entity.Product;
import java.util.Scanner;


public class del_cp {
	static Session session = HibernateUtil.getSessionFactory().openSession();

	public static void main(String[] args) {
				Transaction txn = session.getTransaction();
				@SuppressWarnings("resource")
				Scanner in = new Scanner(System.in);
		
		try {
			txn.begin();
			
			System.out.println("To delete select option from the list");
			System.out.println("1. Customer");
			System.out.println("2. Product");
	        int ch = in.nextInt();
	        switch(ch) {
	        case 1: System.out.println("Enter Customer ID to be deleted");
	        		int c = in.nextInt();
	        		delCustomer(c);
	        		break;
	        case 2: System.out.println("Enter Product ID to be deleted");
	        		int p = in.nextInt();
	        		delProduct(p);
	        		break;
	        }
    
    		txn.commit();
		}	catch(Exception e) {
    			if(txn != null) { txn.rollback(); }
    			e.printStackTrace();
		}	finally {
				if(session != null) { session.close(); }
		}
		
	}
	private static void delCustomer(int n) {
		//Finding customer
		
		Customer customer = (Customer) session.get(Customer.class, n);
		
		
		//Deleting customer info
		 if(customer!=null){
	        session.delete(customer);
	        System.out.println("Customer"+n+" is deleted");
	     }

	}
	private static void delProduct(int n) {
		//Finding product
		
		Product product = (Product) session.get(Product.class, n);
		
		
		//Deleting product info
		
		if(product!=null){
            session.delete(product);
            System.out.println("Product "+n+" is deleted");
         }
	
	}
		

}
