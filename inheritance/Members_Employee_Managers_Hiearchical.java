package inheritance;
import java.util.Scanner;
public class Members_Employee_Managers_Hiearchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E =new Employee();
		
		E.specialization1();
		E.department1();
		E.callSalaryE();
		E.printSalary();
		System.out.println();
		E.printSalaryE();
		System.out.println();
		Manager M = new Manager();
		M.specialization2();
		M.department2();
		M.callSalaryM();
		System.out.println();
		M.printSalaryM();
	}

}
class Member
{
	Scanner sc = new Scanner(System.in);
	String name,address;
	int age,salary;
	long phone_num;
	Member()
	{
		System.out.println("Enter member details: ");
		System.out.println("Enter name: ");
		this.name=sc.next();
		System.out.println("Enter age: ");
		this.age=sc.nextInt();
		System.out.println("Enter phone number: ");
		this.phone_num=sc.nextLong();
		System.out.println("Enter address: ");
		sc.nextLine();
		this.address = sc.nextLine();
		System.out.println("Enter Salary: ");
		this.salary=sc.nextInt();
	}
	public void printSalary() {
		System.out.println(name + " " + age + " " + phone_num + " " + address);
		System.out.println("Salary of the member " + salary );
	}
}
class Employee extends Member
{
	Scanner sc = new Scanner(System.in);
	String name1,address1,specialization1,department1;
	int age1,salary1;
	long phone_num1;
	Employee()
	{
		super();
		System.out.println("Enter Employee details: ");
		System.out.println("Enter name:");
		this.name1=sc.next();
		System.out.println("Enter age: ");
		this.age1=sc.nextInt();
		System.out.println("Enter Phone number: ");
		this.phone_num1=sc.nextLong();
		System.out.println("Enter address: ");
		sc.nextLine();
		this.address1 = sc.nextLine();
		this.salary1=0;
		this.specialization1=null;
		this.department1=null;
		
	}
	public void specialization1() {
		System.out.println("Specializations:");
		System.out.println("Software Engineer");
		System.out.println("Software Developer");
		System.out.println("Full Stack Developer");
		System.out.println("Front Side Developer");
		System.out.println("Analyast Trainee");
		System.out.println("Enter your specs: ");
		String n = sc.nextLine();
		specialization1=n;
	}
	public void department1() {
		if(specialization1.equals("Software Engineer"))
			department1="Department is: HR";
		else if(specialization1.equals("Software Developer"))
			department1="Department is: IT services";
		else if(specialization1.equals("Full Stack Developer")) 
			department1="Department is: Product development";
		else if(specialization1.equals("Front Side Developer"))
			department1="Department is: R&D";
		else
			department1="Department is: HR";
	}
	public void callSalaryE() {
		if(department1.equals("Department is: HR"))
			salary1=100000;
		else if(department1.equals("Department is: IT services"))
			salary1=200000;
		else if(department1.equals("Department is: Product development"))
			salary1=500000;
		else
			salary1=1200000;
	}
	public void printSalaryE() {
		
		System.out.println(name1 + " " + age1 + " " + phone_num1 + " " + address1 + " " + specialization1 + " " + department1);
		System.out.println("Salary of the Employeee " + salary1 );
	} 
}
class Manager extends Member
{
	Scanner sc = new Scanner(System.in);
	String name2,address2,specialization2,department2;
	int age2,salary2;
	long phone_num2;
	Manager()
	{
		
		System.out.println("Enter Manager details: ");
		System.out.println("Enter name: ");
		this.name2=sc.next();
		System.out.println("Enter age: ");
		this.age2=sc.nextInt();
		System.out.println("Enter phone number: ");
		this.phone_num2=sc.nextLong();
		System.out.println("Enter address: ");
		sc.nextLine();
		this.address2 = sc.nextLine();
		this.salary2=0;
		this.specialization2=null;
		this.department2=null;
	}
	public void specialization2() {
		System.out.println("Specializations:");
		System.out.println("Software Manager");
		System.out.println("Marketing Developer");
		System.out.println("Full Stack Developer");
		System.out.println("Front Side Developer");
		System.out.println("Analyast Manager");
		System.out.println("Enter your specs: ");
		sc.nextLine();
		String n = sc.nextLine();
		specialization2=n;
	}
	public void department2() {
		if(specialization2.equals("Software Manager"))
			department2="Department is: IT Department";
		else if(specialization2.equals("Marketing Developer"))
			department2="Department is: HR";
		else if(specialization2.equals("Full Stack Developer"))
			department2="Department is: Product development";
		else if(specialization2.equals("Front Side Developer"))
			department2="Department is: Marketing Development";
		else 
			department2="Department is: IT Department";
	}
	public void callSalaryM() {
		if(department2.equals("Department is: IT Department"))
			salary2=100000;
		else if(department2.equals("Department is: HR"))
			salary2=200000;
		else if(department2.equals("Department is: Product development"))
			salary2=500000;
		else if(department2.equals("Department is: Marketing Development"))
			salary2=700000;
		else
			salary2=1000000;
	}
	public void printSalaryM() {
		System.out.println(name2 + " " + age2 + " " + phone_num2 + " " + address2 + " " + specialization2 + " " + department2);
		System.out.println("Salary of the Manager " + salary2 );
	} 
}