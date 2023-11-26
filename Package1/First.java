package Package1;
import Package2.Third;
public class First
{
	public int a=10;
	protected First(){
		a=100;
		System.out.println("I am default constructor");
	}
	protected First(int a){
		a=10;
		System.out.println("I am parameterized constructor");
	}
	protected void m1() {
		System.out.println("Good night");
	}
	public static void main(String[] args)
	{
		Second s = new Second();
		s.setname("Dhoni");
		s.setroll(07);
		s.setcode('I');
		s.setnumber(7013213123l);
		System.out.println(s.getname());
		System.out.println(s.getroll());
		System.out.println(s.getcode());
		System.out.println(s.getnumber());
		
		
		
		int n=8;
		Integer n1= new Integer(n); //boxing[primitive value storing in primitive object[wrappper object]
		Integer n2 = n1;//auto-boxing[n1 becomes convert into object automatically](or)[If you directly assign primitve value to the object type]
		
		int n3=n2.intValue();//unboxing
		int n4=n2;//auto-unboxing -> When you want to fetch the value automatically]
		System.out.println(n3);
		System.out.println(n1);
		
		
		String st = "124";
		int n5 = Integer.parseInt(st);
		System.out.println(n5*4);
	}
}
