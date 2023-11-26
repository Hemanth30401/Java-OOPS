package inheritance;

public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedBy c = new OrderedBy();//has-a relation
		c.print();
	}

}
class Product
{
	String name;int quantity;double price,total=0;
	Product(){
		name="Laptop";quantity=3;price=155555.20;
	}
	public void add() {
		total=quantity*price;
		System.out.println("Ordered Product is : " + name + " " + (float)total);
	}
}
class OrderedBy extends Product//is-a relation
{
	String fname,address;
	int cid;
	OrderedBy(){
		super();
		fname="Raj";
		address="Hyderabad,India";
		cid=121412;
	}
	public void print() {
		
		System.out.println("Ordered by: " + fname+ " " + address + " " + cid);
		add();
	}
}