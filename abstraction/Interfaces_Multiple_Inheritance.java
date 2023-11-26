package abstraction;

public class Interfaces_Multiple_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1= new C();
		c1.m1();c1.m2();
	}

}
interface x{
	public void m1();
}
interface y{
	public void m2();
}
class C implements x,y
{
	@Override
	public void m1() {
		System.out.println("I am m1");
	}
	@Override
	public void m2() {
		System.out.println("I am m2");
	}
}