package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="order")
public class Order {
	

	

		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO) 
		@Column(name="id")	
		private int purid;
	

		@Column(name="PR_NAME")	
		private String purtext;
		
		@Column(name="PRICE")	
		private double purprice;
		
		@Column(name="QUANTITY")
		private int purquant;
		
		public Order() {}
		public Order(int id, String text, double price, int quantity )
		{
			this.purid = id;
			this.purtext = text;
			this.purprice = price;
			this.purquant = quantity;
		}
		public int getQuantity() {
	    	return purquant;
	    }
	    public void setQuantity(int quantity) {
	    	purquant = quantity;
	    }
	    public double getPrice() {
	    	return  purprice;
	    }
	    public void setPrice(double price) {
	    	purprice = price;
	    }
	    public int getPrId() {
	    	return purid;
	    }
	    public void setPrId(int prId) {
	    	purid = prId;
	    }
	    public String getPrName() {
	    	return purtext;
	    }
	    public void setPrName(String prName) {
	    	purtext = prName;
	    }


		
		@Override
		public String toString() {
			return "Message [id=" + purid + ", text=" + purtext + "]";
		}	
		
	}

