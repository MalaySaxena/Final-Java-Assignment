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
		@Column(name="id")	
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
			this.prid = id;
			this.prtext = text;
			this.prprice = price;
			this.prquant = quantity;
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

