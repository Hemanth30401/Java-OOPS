package inheritance;

public class This_super_keywords_in_Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c= new Child1();
		
	}

}
class Par{
	Par(){
		this(10,20);
		System.out.println("I am Parent Constructor");
	}
	public void m1() {
		System.out.println("I am m1-P");
	}
	int a,b;
	Par(int a,int b){
		System.out.println(a+b);
	}
	public void m2() {
		System.out.println("I am m2-P");
	}
}
class Child1 extends Par{
	int x,y;
	Child1(){
		this(20, 111);
		System.out.println("I am child constructor");
	}
	Child1(int x,int y){
		System.out.println(x+ y);
	}
	public void m4() {
		System.out.println("M4");
	}
}