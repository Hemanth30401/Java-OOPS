package deadLocksAndLocks;

public class DeadLocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1= new A();
	}

}
class A
{
	static int a=10;
	A(){
		this(32);
		System.out.println(a);
	}
	A(int b){
		System.out.println(b);
	}
}
