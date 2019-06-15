package user;

import java.util.Scanner;

import org.hibernate.Session;

import util.HibernateUtil;
import entity.Customer;
import entity.Product;

public class add_cp {
	static Session session = HibernateUtil.getSessionFactory().openSession();
	
	public static void main(String[] args) {
		session.beginTransaction();
		Scanner in = new Scanner(System.in);
		
		System.out.println("To add select option from the list");
		System.out.println("1. Customer");
		System.out.println("2. Product");
        int ch = in.nextInt();
        switch(ch) {
        case 1: System.out.println("Enter Customer ID to be added");
        			int ci = in.nextInt();
        		System.out.println("Enter Customer name to be added");
        			String cn = in.nextLine();
        		addCustomer(ci,cn);
        		break;
        case 2: System.out.println("Enter Product ID to be added");
					int pi = in.nextInt();
				System.out.println("Enter Product Name to be added");
					String pn = in.nextLine();
				System.out.println("Enter Product Price to be added");
					float pp = in.nextInt();
				System.out.println("Enter Product quantity to be added");
					int pq = in.nextInt();
				addProduct(pi,pn,pp,pq);
        		break;
        }
		Customer customer = new Customer(1, "Ram");
		Product product = new Product(1,"Fridge",1000.55,50);
		
		
		session.getTransaction().commit();
		session.close();
	}
	private static void addCustomer( int id, String name)
	{
		Customer cus = (Customer)session.get(Customer.class,id );
		cus.setUsername(name);
		session.save(cus);    
		
	}
	private static void addProduct( int id, String name, double price, int quant)
	{
		Product pro = (Product)session.get(Product.class,id );
		pro.setPrName(name);
		pro.setPrice(price);
		pro.setQuantity(quant);
	
		session.save(pro);
        }
	

}
