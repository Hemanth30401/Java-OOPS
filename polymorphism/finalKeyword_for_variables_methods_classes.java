package polymorphism;

public class finalKeyword_for_variables_methods_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1] Final Variable[Constant,it is not changeable]
//		final int a= 10;
//		a=a+1;
//		System.out.println(a);
		
		//2] Final Method[We cannot override]
//		N n = new N();
//		n.m1();
		
		//3]Final Class[We cannot inherit] 
//		N n = new N();
//		n.m1();
		
	}

}
//2]
//class M{
//	public final void m1() {
//		System.out.println("I am m1");
//	}
//}
//class N extends M{
//	public void m1(){
//		System.out.println("I am m1");
//	}
//}

//3]Final Class
//final class M{
//	public final void m1() {
//		System.out.println("I am m1");
//	}
//}
//class N extends M{
//	public void m1(){
//		System.out.println("I am m1");
//	}
//}