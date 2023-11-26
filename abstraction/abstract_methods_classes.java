package abstraction;

public class abstract_methods_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prod o = new Ord();
		o.m1();o.m2();o.m3();
	}

}
abstract class Prod{
	int a=10;
	public abstract void m1();//abstract method
	public void m2() {
		System.out.println("I am in Prod m2");
	}
	public abstract void m3();
	
}
class Ord extends Prod{
	int a=100;
	@Override
	public void m1() {
		System.out.println("I am in Ord m1");
	}
	public void m2() {
		System.out.println("I am in Ord m2");
	}
	@Override
	public void m3() {
		System.out.println("I am in Ord m3");
	}
	public void m4() {
		System.out.println("I am in Ord m4");
	}
}