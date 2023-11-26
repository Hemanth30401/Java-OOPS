package inheritance;

public class Hiearchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedBy3 o = new OrderedBy3();
		o.print();
		System.out.println();
		OrderedBy4 b = new OrderedBy4();
		b.print1();
	}

}
class Product3
{
	String name,n1;int quantity,q1;double price,p1,total=0;
	Product3()
	{
		name="TV";quantity=2;price=45555.20;
		n1="Mobile";q1=3;p1=23947.05;
	}
	public void add() {
		total=quantity*price;
		System.out.println("Ordered Product is : " + name + " " + (float)total);
	}
	public void add1() {
		total=q1*p1;
		System.out.println("Ordered Product is: " + n1 + " " + (float)total);
	}
}
class OrderedBy3 extends Product3//is-a relation
{
	String fname,address;
	int cid;
	OrderedBy3()
	{
		super();
		fname="Kohli";
		address="Dehli,India";
		cid=2346237;
	}
	public void print() {
		add();
		System.out.println("Ordered by: " + fname+ " " + address + " " + cid);
		
	}
}
class OrderedBy4 extends Product3
{
	String fname,address;
	int cid;
	OrderedBy4()
	{
		super();
		fname="Dhoni";
		address="Ranchi,India";
		cid=1236237;
	}
	public void print1() {
		add1();
		System.out.println("Ordered by: " + fname+ " " + address + " " + cid);
		
	}
}