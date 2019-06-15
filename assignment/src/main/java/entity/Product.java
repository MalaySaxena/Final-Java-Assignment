package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="product")
public class Product {
	

	

		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO) 
		@Column(name="PR_ID")	
		private int id;
	

		@Column(name="PR_NAME")	
		private String text;
		
		@Column(name="PRICE")	
		private double price;
		
		@Column(name="QUANTITY")
		private int quantity;
		
		public Product() {}
		public Product(int id, String text, double price, int quantity )
		{
			this.id = id;
			this.text = text;
			this.price = price;
			this.quantity = quantity;
		}
		Product p = new Product
		public void setname(String t)
		{
			this.text=t;
		}
		public void setprice(double p)
		{
			this.price=p;
		}
		public void setquant(int q)
		{
			this.quantity=q;
		}
		
		@Override
		public String toString() {
			return "Message [id=" + id + ", text=" + text + "]";
		}	
		
	}

