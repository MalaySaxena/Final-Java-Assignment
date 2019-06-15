package user;

import org.hibernate.Session;

import util.HibernateUtil;

import entity.Customer;
import entity.Product;



public class useredit {

	private static void customeredit(String name, int id, Session ses)
	{
		Customer cus = (Customer)ses.get(Customer.class,id );
		cus.setname(name);
		
	}
	private static void productedit(String name, int id, double price, int quant, Session ses)
	{
		Product pro = (Product)ses.get(Product.class,id );
		pro.setname(name);
		pro.setprice(price);
		pro.setquant(quant);
	}
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
			session.beginTransaction();
			customeredit("max",1,session);
			productedit("pen",1,22.22,10,session);
			
			
			session.getTransaction().commit();
			session.close();

}}


