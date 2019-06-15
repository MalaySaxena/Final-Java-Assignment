package user;

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
	
			//Finding customer
			
			Customer customer = (Customer) session.get(Customer.class, 2L);
			
			
			//Updating customer info
			
			Message msg = (Message) session.get(Message.class, 2L);
			msg.setText( �Hello Automatic Dirty Checking� );
			
			//Finding product
			
			Customer customer = (Customer) session.get(Customer.class, 2L);
			
			
			//Updating product info
			
			Message msg = (Message) session.get(Message.class, 2L);
			msg.setText( �Hello Automatic Dirty Checking� );
			
			
    
    		txn.commit();
		}	catch(Exception e) {
    			if(txn != null) { txn.rollback(); }
    			e.printStackTrace();
		}	finally {
				if(session != null) { session.close(); }
		}

        
				
	}

}
