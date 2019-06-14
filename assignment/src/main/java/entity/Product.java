package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Product {
	@Entity
	@Table(name="product")
	public class Message {


		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO) 
		@Column(name="PR_ID")	
		private Long id;
	

		@Column(name="PR_NAME")	
		private String text;
		
		@Column(name="PRICE")	
		private Long price;
		
		@Column(name="QUANTITY")
		private int quantity;
		
		//to understand
		public Message() {}
		public Message(String text) {
			this.text = text;
		}
		
		@Override
		public String toString() {
			return "Message [id=" + id + ", text=" + text + "]";
		}	
		
	}
}