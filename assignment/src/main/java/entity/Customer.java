package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import classes.Customer;

public class Customer {
	@Entity
	@Table(name="customer")
	public class Message {


		@Id
		@GeneratedValue(strategy=GenerationType.AUTO) 
		@Column(name="ID")	
		private Long id;
	

		@Column(name="CUSTOMER_NAME")	
		private String text;
		
		Customer customer = new Customer();
		
		
		@Override
		public String toString() {
			return "Message [id=" + id + ", text=" + text + "]";
		}	
		
	}
}
