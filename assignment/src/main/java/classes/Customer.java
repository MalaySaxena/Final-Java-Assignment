  package classes;

public class Customer {
 int id;
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
String Name = new String();
public String getName() {
	return Name;
}
public void setName(String name) {
	this.Name = name;
}
 
@Override
public String toString() {
	return "Customer [id=" + id + ", text=" + Name + "]";
}	
}
 