package Package2;
import Package1.First;
import Package1.Second;
public class Third extends First
{
	private Third(){
		super();
	}
	private Third(int a) {
		super(10);
	}
	static {
		System.out.println("I am parent block");
	}

	public static void main(String[] args) {
		Second s = new Second();
		s.setname("Dhoni");
		s.setroll(07);
		s.setcode('I');
		s.setnumber(7013213123l);
		System.out.println(s.getname());
		System.out.println(s.getroll());
		System.out.println(s.getcode());
		System.out.println(s.getnumber());
		System.out.println(s.getcode());
		Third t = new Third(10);
		t.m1();
		System.out.println(t.a);
	}
}
