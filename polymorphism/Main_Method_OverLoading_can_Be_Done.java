package polymorphism;

public class Main_Method_OverLoading_can_Be_Done {

	public static void main() {
		System.out.println("I m Default");
	}
	public static void main(String a) {
		System.out.println("I m single parameter");
	}
	public static void main(String a,int b) {
		System.out.println("I m doubled parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_Method_OverLoading_can_Be_Done m = new Main_Method_OverLoading_can_Be_Done();
		m.main();m.main("Hello");m.main("Hi");
	}

}
