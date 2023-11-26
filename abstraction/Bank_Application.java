package abstraction;
import java.util.Scanner;
public class Bank_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to CIB Bank ");
		System.out.println("login for: ");
		System.out.println("Manager");
		System.out.println("Accountant");
		System.out.println("User");
		System.out.println("Clerk");
		while(true) {
			System.out.println("Enter your choice: ");
			String s = sc.next();
			switch(s) {
			case "Manager":
				Manager m = new Manager();
				System.out.println("Deposited are: ");
				m.deposit();
				System.out.println();
				System.out.println("Withdrawls are: ");
				m.withdrawl();
				System.out.println();
				System.out.println("Changes made by persons: ");
				m.changes();
			break;
			case "Accountant":
				Manager a = new Accountant();
				System.out.println("Deposited are: ");
				a.deposit();
				System.out.println();
				System.out.println("Withdrawls are: ");
				a.withdrawl();
				break;
			case "User":
				User u = new User();
				u.deposit();
				u.withdrawl();
				break;
			case "Clerk":
				Manager c = new Clerk();
				c.changes();
			}
			if(s.equals("0"))
				break;
		}
	}

}
abstract class Bank11{
	public abstract void deposit();
	public abstract void withdrawl();
	public abstract void changes();
}
class Manager extends Bank11
{	
	String s="";
	String s1="";
	Scanner sc =new Scanner(System.in);
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		s=s+User.c[User.i];
		System.out.println(", A/C: 38532323418, deposited " + s + " rupees " );
		System.out.println("Hemanth, A/C: 365548798965, deposited " + s + " rupees");
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		s1=s1+User.b[User.i];
		System.out.println("Gill, A/C: 38532323418, withdrawed " + s1+ " rupees ");
	}

	@Override
	public void changes() {
		// TODO Auto-generated method stub
		System.out.println(User.name + " A/C: 38532323418, withdrawed " + User.b+  " rupees number is: " + User.num + " mailId is: " + User.mail);
	}
}

class Accountant extends Manager
{
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Gill, A/C: 38532323418, deposited " + s + " rupees" );
	}
	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("Gill, A/C: 38532323418, withdrawed " + s1 + " rupees");
	}
}
class User
{
	Scanner sc = new Scanner(System.in);
	static int[] bal = new int[] {2000,1000,5000};
	static int[] c = new int[bal.length];
	static int[] aval_bal = new int[c.length];
	static int[] aval_bal1 = new int[c.length];
	static int i;
	static int[] b = new int[aval_bal.length];
	int d,withdraw;
	static String[] name= new String[] {"Gill","Sainath","Kohli"};
	static String[] account=new String[] {"39654789545","64145612374","21034782644"};
	static String[] num= new String[] {"9999979999","7845652456","9396599979"};
	static String[] mail=new String[] {"johnwick222@gmail.com","missionimpossible11@gmail.com","kohli111@gmail.com"};
	public void deposit() {
		for(int i=0;i<2;i++) {
			System.out.println("deposited: ");
			c[i] = sc.nextInt();
			aval_bal[i]=bal[i]+c[i];
			System.out.println("Available balance " + aval_bal[i] + " rupees");
		}
	}
	public void withdrawl() {
		for(int i=0;i<2;i++) {
				if(aval_bal[i]>=1000)
			{
				System.out.println("Withdrawl: ");
				b[i]=sc.nextInt();
				aval_bal1[i]=aval_bal[i]-b[i];
				System.out.println("Available Balance: " + aval_bal1[i] + " rupees");
			}
			else
			{
				System.out.println("Withdrawl: ");
				d=sc.nextInt();
				aval_bal1[i]=aval_bal[i]-d;
				System.out.println("Insufficient Balance you need minimum 1000 rupees in bank");
			}
		}
	}
}
class Clerk extends Manager
{
	@Override
	public void changes() {
		for(int i=0;i<2;i++) {
			System.out.println("Name: " + User.name[i] + "\nA/C: " + User.account[i] + "\nMobile number: " + User.num[i] + "\nmail" + User.mail[i]);
			
			System.out.println("Changing name,mobile,mailId");
			String s = sc.next();
			User.name = s;
		if(User.name.equals(s))
		{
			System.out.println("Changed name is " + User.name);
			System.out.println(User.name +  " A/C: 38532323418, deposited 1000, 7017389247, donbosco22@gmail.com");
		}
		else if(User.name.equals("NA")) {
			System.out.println("Name is not changed");
		}
		String s1=sc.next();
		User.num=s1;
		if(User.num.equals(s1))
		{
			System.out.println("Changed number is " + User.num);
			System.out.println("Gill, A/C: 38532323418, deposited 1000, " + User.num + " , donbosco22@gmail.com");
		}
		else if(User.name.equals("NA")) {
			System.out.println("Name is not changed");
		}
		String s2=sc.next();
		User.mail= s2;
		if(User.mail.equals(s2))
		{
			System.out.println("Changed mailId is " + User.mail);
			System.out.println("Gill, A/C: 38532323418, deposited 1000, 7017389247, " + User.mail);
		}
		else if(User.name.equals("NA")) {
			System.out.println("Name is not changed");
		}
	}
}