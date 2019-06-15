package classes;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "product_table")


public class Product {
	 
    @Id
    @Column(name = "product_id")
    private int prid;

    @Column(name = "product_name")
    private String prname;

    @Column(name = "product_price")
    private long prprice;

    @Column(name = "product_quantity")
    private int prquant;
    
    public int getQuantity() {
    	return prquant;
    }
    public void setQuantity(int quantity) {
    	prquant = quantity;
    }
    public long getPrice() {
    	return prprice;
    }
    public void setPrice(long price) {
    	prprice = price;
    }
    public int getPrId() {
    	return prid;
    }
    public void setPrId(int prId) {
    	prid = prId;
    }
    public String getPrName() {
    	return prname;
    }
    public void setPrName(String prName) {
    	prname = prName;
    }

    @Override
    public String toString() {
    	return "Product [id=" + prid + ", name=" + prname + ", price=" + prprice + ", quantitiy=" + prquant +"]";
    }	
}
