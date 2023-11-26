package abstraction;

public class Interfaces_Classes_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic_Operations a =new Arithmetic_Operations();
		a.add(11.123, 12.231);a.sub(10.500, 4.000);a.mul(5.30, 6.50);a.div(22, 7);
	}

}
interface Calc1
{
	public void add(double a,double b);
	public void sub(double x,double y);
}
interface Calc2 extends Calc1
{
	public void mul(double c,double d);
	public void div(double i,double j);
}
class Arithmetic_Operations implements Calc2
{
	double a,b,c,d,x,y,i,j;
	@Override
	public void add(double a,double b)
	{
		System.out.println("Addition of " + a + " & " + b + " is: " + (a+b));
	}
	@Override
	public void sub(double x,double y)
	{
		System.out.println("Subtraction of " + x + " & " + y + "  is: " + (x-y));
	}
	@Override
	public void mul(double c,double d)
	{
		System.out.println("Multiplication " + c + " & " + d + " is: " + (c*d));
	}
	@Override
	public void div(double i,double j)
	{
		System.out.println("Division " + i + " & " + j + " is: " + (i/j));
	}
	
}