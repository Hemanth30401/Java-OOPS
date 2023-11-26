package inheritance;

public class Case_Studies_Object_Class_SingleIsOfMultilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AUS a = new AUS();
		a.m1();a.m2();
		
	}

}
class WC//Parent have object class
{
	String team,captain;
	int won,loss,pts;
	WC(){
		this.team="IND";
		captain="Kohli";
		won=7;
		loss=6;
		pts=14;
	}
	public void m1() {
		System.out.println(team + " " + captain + " " + won + " " +pts );
	}
}
class AUS extends WC{
	String team,captain;
	int won,loss,pts;
	AUS(){
		this.team="austraila";
		captain="Cummins";
		won=6;
		loss=7;
		pts=12;
	}
	public void m2() {
		System.out.println(getClass());
		System.out.println(hashCode());
		System.out.println(team.equals("austraila"));
		System.out.println(team + " "  + " " + won + " " +pts );
	}
}
