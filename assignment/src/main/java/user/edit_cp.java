package user;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Customer;
import entity.Product;

public class edit_cp {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();

		
		try {
			txn.begin();
	
			Scanner in = new Scanner(System.in);
			
			System.out.println("To edit select option from the list");
			System.out.println("1. Customer");
			System.out.println("2. Product");
	        int ch = in.nextInt();
	        switch(ch) {
	        case 1: System.out.println("Enter Customer ID to be edited");
	        			int ci = in.nextInt();
	        		System.out.println("Enter Customer name to be edited");
	        			String cn = in.nextLine();
	        		customeredit(cn,ci,session);
	        		break;
	        case 2: System.out.println("Enter Product ID to be edited");
						int pi = in.nextInt();
					System.out.println("Enter Product Name to be edited");
						String pn = in.nextLine();
					System.out.println("Enter Product Price to be edited");
						float pp = in.nextInt();
					System.out.println("Enter Product quantity to be edited");
						int pq = in.nextInt();
					productedit(pn,pi,pp,pq,session);
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
	
	private static void customeredit(String name, int id, Session ses)
	{
		Customer cus = (Customer)ses.get(Customer.class,id );
		cus.setUsername(name);
		
	}
	private static void productedit(String name, int id, double price, int quant, Session ses)
	{
		Product pro = (Product)ses.get(Product.class,id );
		pro.setPrName(name);
		pro.setPrice(price);
		pro.setQuantity(quant);
	}
	

}
