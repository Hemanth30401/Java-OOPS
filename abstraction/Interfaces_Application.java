package abstraction;


public class Interfaces_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child i = new Child();
		i.m1();i.m2();
	}

}
interface A
{
	int a=10;
	public void m1();
	public void m2();
}
abstract class I implements A
{
	int a;
	I(int a){
		this.a=a;
	}
	@Override
	public void m1() {
		System.out.println("I-m1 " + this.a);
	}
	
}
class Child extends I{
	int a;
	Child(){
		super(1000);
	}
	@Override
	public void m2() {
		System.out.println("Child-m2 " + " " + super.a);
	}
}