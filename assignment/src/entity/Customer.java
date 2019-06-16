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
		private int cussid;
	

		@Column(name="CUSTOMER_NAME")	
		private String cussname;
		
		public Customer() {}
		public Customer(int id, String text)
		{
			this.cussid=id;
			this.cussname=text;
		}
		
		  public int getUserid() {
		        return cussid;
		    }
		 
		    public void setUserid(int userid) {
		        this.cussid = userid;
		    }
		 
		    public String getUsername() {
		        return cussname;
		    }
		 
		    public void setUsername(String username) {
		        this.cussname = username;
		    }
		
		@Override
		public String toString() {
			return "Message [id=" + cussid + ", text=" + cussname + "]";
		}	
		
	}

