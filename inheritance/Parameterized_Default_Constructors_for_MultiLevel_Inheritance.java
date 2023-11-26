package inheritance;

public class Parameterized_Default_Constructors_for_MultiLevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add3 a = new Add3();
		for(int i=0;i<2;i++) {
		a.add();a.add2();a.add3();}
	}

}
class Add
{
	int x,y;
	Add(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void add() 
	{
		System.out.println(this.x+" " +this.x);
	}
}
class Add2 extends Add
{
	int x,y;
	Add2(int x,int y){
		super(10,20);
		this.x=x;this.y=y;
		
	}
	public void add2() {
		System.out.println(this.x+" "+super.x);
	}
}
class Add3 extends Add2
{
	int x,y;
	Add3(){
		super(100,200);
		this.x=1000;this.y=2000;
	}
	public void add3() {
		System.out.println(this.x + " " + super.x);
		System.out.println(this.y=this.y + super.y);
		System.out.println(this.y);
	}
	
}