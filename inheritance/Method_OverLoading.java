package inheritance;

public class Method_OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.m1();
		t.m1("Kohli",745);
		t.m1(454,"Warner");
		t.m1("Root",854,54.43);
		t.m1(545,"B Azam",45.21);
	}

}
class Test{
	String name;int runs;double avg;
	Test(){
		this.name=null;
		runs=0;
		avg=0.0;
	}
	public void m1() {
		name="Smith";
		runs=545;
		avg = 45.23;
		System.out.println(name + " " + runs + " " + avg);
	}
	public void m1(String name,int runs) {
		name="Kohli";
		runs=854;
		System.out.println(name + " " + runs);
	}
	public void m1(int runs, String name) {
		this.runs=runs;
		this.name=name;
		System.out.println(runs + " " + name);
	}
	public void m1(String name,int runs,double avg) {
		this.name=name;
		this.runs=runs;
		this.avg = avg;
		System.out.println(name + " " + runs + " " + avg);
	}
	public void m1(int runs,String name,double avg) {
		this.name=name;
		this.runs=runs;
		this.avg = avg;
		System.out.println(name + " " + runs + " " + avg);
	}
}