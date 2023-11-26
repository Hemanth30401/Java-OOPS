package constructors;

public class this_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add1 b =new Add1();
		Add1 a = new Add1(10);
	}

}
class Add1{
	int a;
	Add1(){
		
		System.out.println("Default");
	}
	Add1(int a) {
		this();
		this.a=a;
		System.out.println("Constructor");
	}
	
}