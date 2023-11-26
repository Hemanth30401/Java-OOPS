package Package1;

public class abimpli {

	public static void main(String[] args) {
	mike m = new mike();
	m.Gt();m.Vmax();
	m.ola();
	}

}
abstract class Bike
{
	public abstract void Gt();
	public abstract void Vmax();
	public void ola()
	{
		System.out.println("Hi i'm ola");
	}
}
class mike extends Bike
{
	public void Gt()
	{
		System.out.println("Hi i'm GT 650");
	}
	public void Vmax()
	{
		System.out.println("Hi i'm Yahmaha Vmax");
	}
}