package constructors;
import java.util.Scanner;
public class This_Keyword_Constructors_ParaAndNonParameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Double d=s.callMarks();
		s.checkGrades(d);
		System.out.println(s.pD());
		Student s1=new Student("Rohit",12,'M',100000);
		Double d1=s1.callMarks();
		s1.checkGrades(d1);
		System.out.println(s1.pD());
		Student s2=new Student("Kohli",'M',21,100000);
		Double d2=s2.callMarks();
		s2.checkGrades(d2);
		System.out.println(s2.pD());
	}

}
class Student{
	Scanner sc = new Scanner(System.in);
	String name;
	int roll,fee;
	char gen;
	int s1,s2,s3,s4,s5,s6;
	double per,total,max=600;
	Student()
	{
		
		System.out.println("Enter student details");
		this.name=sc.next();
		this.roll =sc.nextInt();
		this.gen=sc.next().charAt(0);
		this.fee=sc.nextInt();
		System.out.println("Enter Marks");
		this.s1=sc.nextInt();this.s2=sc.nextInt();this.s3=sc.nextInt();this.s4=sc.nextInt();this.s5=sc.nextInt();this.s6=sc.nextInt();
		
	}
	Student(String name,int roll, char gen,int fee){
		this.name=name;this.roll=roll;this.gen=gen;this.fee=fee;
		System.out.println("Enter marks");
		this.s1=sc.nextInt();this.s2=sc.nextInt();this.s3=sc.nextInt();this.s4=sc.nextInt();this.s5=sc.nextInt();this.s6=sc.nextInt();
	}
	Student(String name, char gen,int roll,int fee){
		this.name=name;this.roll=roll;this.gen=gen;this.fee=fee;
		System.out.println("Enter marks");
		this.s1=sc.nextInt();this.s2=sc.nextInt();this.s3=sc.nextInt();this.s4=sc.nextInt();this.s5=sc.nextInt();this.s6=sc.nextInt();
	}
	public double callMarks() {
		total=s1+s2+s3+s4+s5+s6;
		per=total/max*100;
		return per;
	}
	public void checkGrades(double per) {
		int scholarship=0,donation=0;
		if(per>=90) 
		{
			scholarship=10000;
			System.out.println("Grade is O");
		}
		else if(per>=80 && per<90) 
		{
			scholarship=8000;donation=2000;
			System.out.println("Grade is A+");
		}
		else if(per>=70 && per<80)
		{
			scholarship=5000;donation=5000;
			System.out.println("Grade is A");
		}
		else if(per>=60 && per<70) {
			scholarship=3000;donation=7000;
			System.out.println("Grade is B+");
		}
		else {
			donation=10000;
			System.out.println("Pass");
		}
		fee=fee-scholarship+donation;
	}
	public String pD() {
		return name+" " + roll+" " +gen+" "+total + " " + per + " " +fee;
	}
	
	
}