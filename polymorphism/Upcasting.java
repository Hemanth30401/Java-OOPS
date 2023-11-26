package polymorphism;

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.m1();p.m2();p.m3();p.m4();
	}

}
class Parent
{
	public void m1() {
		System.out.println("M1-Parent");
	}
	public void m2() {
		System.out.println("M2-Parent");
	}
	public void m3() {
		System.out.println("M3-Parent");
	}
	public void m4() {
		System.out.println("M4-Parent");
	}
}
class Child extends Parent
{
	public void m1() {
		System.out.println("M1-Child");
	}
	public void m4() {
		System.out.println("M4-Child");
	}
	public void m5() {
		System.out.println("M5-Child");
	}
	public void m6() {
		System.out.println("M6-Child");
	}
}