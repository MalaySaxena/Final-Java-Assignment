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
		private int prid;
	

		@Column(name="PR_NAME")	
		private String prtext;
		
		@Column(name="PRICE")	
		private double prprice;
		
		@Column(name="QUANTITY")
		private int prquant;
		
		public Product() {}
		public Product(int id, String text, double price, int quantity )
		{
<<<<<<< HEAD
			this.id = id;
			this.text = text;
			this.price = price;
			this.quantity = quantity;
		}
		
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
=======
			this.prid = id;
			this.prtext = text;
			this.prprice = price;
			this.prquant = quantity;
>>>>>>> 29b62a51a7c620b2e21b9196141147eedf849dc9
		}
		public int getQuantity() {
	    	return prquant;
	    }
	    public void setQuantity(int quantity) {
	    	prquant = quantity;
	    }
	    public double getPrice() {
	    	return  prprice;
	    }
	    public void setPrice(double price) {
	    	prprice = price;
	    }
	    public int getPrId() {
	    	return prid;
	    }
	    public void setPrId(int prId) {
	    	prid = prId;
	    }
	    public String getPrName() {
	    	return prtext;
	    }
	    public void setPrName(String prName) {
	    	prtext = prName;
	    }


		
		@Override
		public String toString() {
			return "Message [id=" + prid + ", text=" + prtext + "]";
		}	
		
	}

