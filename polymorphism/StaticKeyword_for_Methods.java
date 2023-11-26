package polymorphism;

public class StaticKeyword_for_Methods {

	public static void m1() {
		System.out.println("I'm in Main");
	}
	static int c;
	
	static {
		c=100;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S s=new S();
		s.b =19;
		c=3;
		main(10);
		S.s1();
		m1();
		System.out.println(c);
	}
	static {
		c=110;
		System.out.println(c);
	}
	public static void main(int b)
	{
		System.out.println(c);
		System.out.println("Overloading supported");
	}

}
class S{
	int b;
	static {
		System.out.println("S static");
	}
	public static void s1() {
		System.out.println("Super class");
	}
}