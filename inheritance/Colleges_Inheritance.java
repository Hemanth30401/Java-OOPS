package inheritance;
import java.util.Scanner;
public class Colleges_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c = new College();
		c.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want UG or PG?");
		String n = sc.next();
		System.out.println("Enter your name and mobile number");
		sc.nextLine();
		String m=sc.nextLine();
		long m1=sc.nextLong();
		switch(n) {
		case "UG":
			UG u = new UG();
			u.Branch_details();
			u.Stream_details();
			u.fee_details();
			u.pD();
			break;
		case "PG":
			PG p = new PG();
			p.Branch_details1();
			p.Stream_details1();
			p.fee_details();
			p.pD1();
			break;
		default:
			System.out.println("Invalid Input");
		}
		System.out.println("Student Details are: " + m + " " + m1);
		
	}

}
class College
{
	Scanner sc = new Scanner(System.in);
	String name,code,PName;
	long Mobile;
	College()
	{
		this.name="Nalla Malla Reddy UG & PG College";
		this.code="NMREC";
		this.PName=null;
		this.Mobile=0;
	}
	public void display() {
		System.out.println("Welcome to " + name + ", " + code);
		
	}
}
class UG extends College
{
	String ug_Branch,ug_stream;
	int ug_fee;
	UG(){
		this.ug_stream=null;
		this.ug_stream=null;
		this.ug_fee=0;
	}
	public void Branch_details() {
		System.out.println("We have 3 Branches: ");
		System.out.println("B.Tech");
		System.out.println("B.Com");
		System.out.println("B.Sc");
		String n=sc.next();
		ug_Branch=n;
	}
	public void Stream_details() {
		
		if(ug_Branch.equals("B.Tech"))
		{
			System.out.println("We have 5 Streams in B.Tech");
			System.out.println("CSE");
			System.out.println("ECE");
			System.out.println("EEE");
			System.out.println("MECH");
			System.out.println("IT");
			System.out.println("Streams Choose");
			String q=sc.next();
			ug_stream=q;
		}
		else if(ug_Branch.equals("B.Com")) 
		{
			System.out.println("We have 2 Streams in B.Com");
			System.out.println("Economics");
			System.out.println("Finance");
			System.out.println("Streams Choose");
			String q1 = sc.next();
			ug_stream=q1;
		}
		else 
		{
			System.out.println("We have 2 Streams in B.Sc");
			System.out.println("Mathematics");
			System.out.println("Chemistry");
			System.out.println("Streams Choose");
			String q2 = sc.next();
			ug_stream=q2;
		}
	}
	public void fee_details() {
		if(ug_stream.equals("CSE"))
			ug_fee=500000;
		else if(ug_stream.equals("ECE"))
			ug_fee=400000;
		else if(ug_stream.equals("EEE"))
			ug_fee=300000;
		else if(ug_stream.equals("MECH"))
			ug_fee=200000;
		else if(ug_stream.equals("IT"))
			ug_fee=450000;
		else if(ug_stream.equals("Economics"))
			ug_fee=75000;
		else if(ug_stream.equals("Finance"))
			ug_fee=70000;
		else if(ug_stream.equals("Mathematics"))
			ug_fee=55000;
		else
			ug_fee=45000;
	}
	public void pD() {
		display();
		System.out.println("Branch: " + ug_Branch + "\nStream: " + ug_stream + "\n" +  "Fees: " + ug_fee);
	}
}

class PG extends College
{
	String pg_Branch1,pg_stream1;
	int pg_fee1;
	PG(){
		super();
		String pg_Branch1=null;
		String pg_stream1=null;
		int pg_fee1=0;
	}
	public void Branch_details1() {
		System.out.println("We have 3 Branches: ");
		System.out.println("M.Tech");
		System.out.println("MCA");
		System.out.println("MSC");
		String n=sc.next();
		pg_Branch1=n;
	}
	public void Stream_details1() {
		
		if(pg_Branch1.equals("M.Tech"))
		{
			System.out.println("We have 5 Streams in B.Tech");
			System.out.println("CSE");
			System.out.println("ECE");
			System.out.println("EEE");
			System.out.println("MECH");
			System.out.println("IT");
			System.out.println("Streams Choose:");
			String q=sc.next();
			pg_stream1=q;
		}
		else if(pg_Branch1.equals("M.Com")) 
		{
			System.out.println("We have 2 Streams in B.Com");
			System.out.println("Business");
			System.out.println("Marketing");
			System.out.println("Streams Choose");
			String q1 = sc.next();
			pg_stream1=q1;
		}
		else 
		{
			System.out.println("We have 2 Streams in MSC");
			System.out.println("Mathematics");
			System.out.println("Chemistry");
			System.out.println("Streams Choose:");
			String q2 = sc.next();
			pg_stream1=q2;
		}
	}
	public void fee_details() {
		if(pg_stream1.equals("CSE"))
		pg_fee1=500000;
		else if(pg_stream1.equals("ECE"))
			pg_fee1=400000;
		else if(pg_stream1.equals("EEE"))
			pg_fee1=300000;
		else if(pg_stream1.equals("MECH"))
			pg_fee1=200000;
		else if(pg_stream1.equals("IT"))
			pg_fee1=450000;
		else if(pg_stream1.equals("Business"))
			pg_fee1=75000;
		else if(pg_stream1.equals("Marketing"))
			pg_fee1=70000;
		else if(pg_stream1.equals("Mathematics"))
			pg_fee1=55000;
		else
			pg_fee1=45000;
	}
	public void pD1() {
		display();
		System.out.println("Branch: " + pg_Branch1 + "\nStream: " + pg_stream1 + "\n" +  "Fees: " + pg_fee1);
	}
}