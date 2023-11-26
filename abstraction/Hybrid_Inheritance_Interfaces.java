package abstraction;

public class Hybrid_Inheritance_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1();
		c.m1();c.m4();c.m5();
	}

}
interface GrandParent
{
	public void m1();
}

interface P11 extends GrandParent
{
	public void m4();
	
}
interface P22 extends GrandParent
{
	public abstract void m5();
}
class C1 implements P11,P22
{
	@Override
	public void m1() {
		System.out.println("I am m1 - C1");
	}
	@Override
	public void m4() {
		System.out.println("I am m4 - C1");
	}
	@Override
	public void m5() {
		System.out.println("I am m5 - C1");
	}
}