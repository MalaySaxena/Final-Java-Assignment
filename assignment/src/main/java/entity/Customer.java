package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer")

public class Customer {
	
	


		@Id
		@GeneratedValue(strategy=GenerationType.AUTO) 
		@Column(name="ID")	
		private int id;
	

		@Column(name="CUSTOMER_NAME")	
		private String text;
		
		public Customer() {}
		public Customer(int id, String text)
		{
			this.id=id;
			this.text=text;
		}
		
		public void setname(String t)
		{
			this.text=t;
		}
		
		
		@Override
		public String toString() {
			return "Message [id=" + id + ", text=" + text + "]";
		}	
		
	}

