package abstraction;

public class Default_Abstract_Methods_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.m1();
		b.m2();
		A1 a = new B();
		a.m1();a.m2();
	}

}
interface A1{
	default void m1() {
		System.out.println("I am m1");
	}
	public void m2();
}
class B implements A1{
	@Override
	public void m2() {
		System.out.println("I am m2");
	}
}