package classes;


public class Product {
int PrId, Price, Quantity;
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
public int getPrId() {
	return PrId;
}
public void setPrId(int prId) {
	PrId = prId;
}
String PrName = new String();
public String getPrName() {
	return PrName;
}
public void setPrName(String prName) {
	PrName = prName;
}

@Override
public String toString() {
	return "Product [id=" + PrId + ", name=" + PrName + ", price=" + Price + ", quantitiy=" + Quantity +"]";
}	mm
}
