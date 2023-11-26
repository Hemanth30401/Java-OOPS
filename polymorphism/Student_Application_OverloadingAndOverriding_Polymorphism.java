package polymorphism;

public class Student_Application_OverloadingAndOverriding_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Shiv",12,97,99,91,300);
		System.out.println(s);
		Education e= new Education();
		System.out.println(e.callEd());
		System.out.println(e.callT());
	}

}
class Student 
{
	String name;int roll,s1,s2,s3;double total,max,per;
	Student(String name,int roll,int s1,int s2,int s3,double max){
		this.name=name;
		this.roll=roll;
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.max=max;
	}
	public double callT() {
		total=0;
		total=s1+s2+s3;
		return total;
	}
	public double callT(double total) {
		per=0;
		per=total/max*100;
		return per;
	}
	public String toString() {
		return name+" " + roll + " " + this.callT() + " " + this.callT(total);
	}
}
class Education extends Student{
	String s_name,s_class;int age;double fees;
	Education(){
		super("Shiv1",12,97,99,91,300);
		s_name="Sr digi school";
		s_class="5th class";
		age=13;
		fees=10000.50;
	}
	public String callEd() {
		return s_name + " " + s_class + " " + age;
	}
	public double callT() {
		if(age==10)
			return fees;
		else if(age>10 && age<=15)
			return fees=15000.90;
		else
			return 0;
	}
}
