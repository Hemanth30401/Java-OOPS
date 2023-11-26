package inheritance;

public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeliveryCharges d = new DeliveryCharges();
		d.printDechg();
	}

}
class Product2
{
	String name;int quantity;double price,total=0;
	Product2()
	{
		name="Laptop";quantity=3;price=155555.20;
	}
	public void add() {
		total=quantity*price;
		System.out.println("Ordered Product is : " + name + " " + (float)total);
	}
}
class OrderedBy2 extends Product2//is-a relation
{
	String fname,address;
	int cid;
	OrderedBy2()
	{
		super();
		fname="Raj";
		address="Hyderabad,India";
		cid=121412;
	}
	public void print() {
		System.out.println("Ordered by: " + fname+ " " + address + " " + cid);
		
	}
}
class DeliveryCharges extends OrderedBy2
{
	int km,rupees;
	DeliveryCharges(){
		super();
		km=5;
		rupees=50;
		
	}
	public void delivery() {
		if(km>5) {
			rupees=100;
		}
		else if(km==5)
			rupees=50;
		else if(km==3)
			rupees=30;
		else
			rupees=0;
	}
	public void printDechg() {
		print();add();
		System.out.print("Delivery charages are: " + km + "km " + rupees + "rupees");
	}
}