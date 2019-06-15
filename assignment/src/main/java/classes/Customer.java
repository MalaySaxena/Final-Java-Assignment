package classes;

 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "customer_table")
public class Customer {
	 
    @Id
    @Column(name = "user_id")
    private int userid;
 
    @Column(name = "user_name")
    private String username;

    public int getUserid() {
        return userid;
    }
 
    public void setUserid(int userid) {
        this.userid = userid;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
	@Override
	public String toString() {
		return "Customer [id=" + userid + ", text=" + username + "]";
	}	
}
 