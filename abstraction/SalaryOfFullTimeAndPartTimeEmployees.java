package abstraction;

public class SalaryOfFullTimeAndPartTimeEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parttime_Employee p = new Parttime_Employee();
		p.calSal();
		Fulltime_Employee f = new Fulltime_Employee();
		f.calSal();
	}

}
abstract class Employee
{
	public abstract void calSal();
}
class Employee1 extends Employee
{
	@Override
	public void calSal() {
		
	}
}
class Parttime_Employee extends Employee1
{
	double salary1;int hours_per_Day,wage1;
	Parttime_Employee(){
		double salary1=0;
		hours_per_Day=5;
		wage1=500;
	}
	@Override
	public void calSal() {
		salary1=hours_per_Day*wage1;
		System.out.println("Part-time employee salary is: " + salary1);
	}
}
class Fulltime_Employee extends Employee1
{
	double salary2;int Days,wage2;
	Fulltime_Employee(){
		double salary2=0;
		Days=30;
		wage2=1500;
	}
	@Override
	public void calSal() {
		salary2=Days*wage2;
		System.out.println("Full-time employee salary is: " + salary2);
	}
}