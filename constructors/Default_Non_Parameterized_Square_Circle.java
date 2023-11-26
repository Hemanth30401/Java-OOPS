package constructors;

import java.util.Scanner;


public class Default_Non_Parameterized_Square_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sides and color of square: ");
		int s1=sc.nextInt();
		String c1=sc.next();
		Shape square = new Shape(s1,c1);
		Shape circle = new Shape();
		int x=square.s1;
		String y=circle.color;
		System.out.print("Sides of square is " + x + " Color of circle is " +y);
	}

}
class Shape
{
	Scanner sc = new Scanner(System.in);
	int sides,s1;
	String color,c1;
	Shape(){
		System.out.println("Enter sides and color of circle: ");
		this.sides=sc.nextInt();
		this.color=sc.next();
				
	}
	Shape(int s1,String c1){
		this.s1=s1;
		this.c1=c1;
	}
			
}

