package constructors;
import java.util.Scanner;
public class ConstructorsParameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter ");
		String n=sc.next();
		char code=sc.next().charAt(0);
		int q = sc.nextInt();
		double pr=sc.nextDouble();
		Product p = new Product(n,code,q,pr);
		p.callTotal();
		System.out.println(p.printData());
		Product p1=new Product("Mango",'M',3,133.33);
		p1.callTotal();
		System.out.println(p1.printData());
	}

}
class Product{
	String name;
	char code;
	int quantity;
	double total,price;
	Product(String n,char c,int q,double p){
		name=n;code=c;quantity=q;price=p;
	}
	public void callTotal() {
		total=price*quantity;
	}
	public String printData() {
		return name+" " +code+" " + quantity + " " + price + " " + total;
	}
}