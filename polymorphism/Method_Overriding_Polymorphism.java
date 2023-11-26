package polymorphism;

public class Method_Overriding_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		s.add();s.sub();
	}

}
class Add
{
	int a,b;
	Add()
	{
		a=10;b=20;
	}
	public void add() {//Load
		System.out.println("Parent add " + a+" " + b);
	}
}
class Sub extends Add
{
	int a,b;
	Sub(){
		super();
		a=100;b=200;
	}
	public void add() {//JVM
		System.out.println("Child add " + a + " " + b);
	}
	public void sub() {
		System.out.println("Child sub" + (a-b));
	}
}