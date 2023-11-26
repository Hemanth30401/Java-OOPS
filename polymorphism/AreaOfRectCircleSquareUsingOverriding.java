package polymorphism;

public class AreaOfRectCircleSquareUsingOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.area();
		Circle c = new Circle();
		c.area();
		Square s = new Square();
		s.area();
	}

}
class Shape
{
	String color;
	int area,radius,l,b,sides;
	Shape()
	{
		this.color=null;
		this.area=0;
		this.radius=3;
		this.l=5;
		this.b=6;
		this.sides=4;
	}
	public void setColor() {
		color="Blue";
	}
	public String getColor() {
		setColor();
		return color;
	}
	public void area() {
		System.out.println(area);
	}
}
class Rectangle extends Shape
{
	Rectangle(){
		super();
		area=0;
	}
	public void area() {
		area=l*b;
		System.out.println("Rectangle is of " + getColor()); 
		System.out.println("Area of Rectangle: "+area);
	}
}
class Circle extends Shape
{
	Circle(){
		super();
		area=0;
	}
	public String getColor() {
		color="red";
		return color;
	}
	public void area() {
		area=(int)Math.PI*(radius*radius);
		System.out.println("Circle is of " + getColor());
		System.out.println("Area of Circle: "+area);
	}
}
class Square extends Shape
{
	Square(){
		super();
		area=0;
	}
	public String getColor() {
		color="Orange";
		return color;
	}
	public void area() {
		area=0;
		area=sides*sides;
		System.out.println("Square is of " + getColor());
		System.out.println("Area of Square: "+area);
	}
}
