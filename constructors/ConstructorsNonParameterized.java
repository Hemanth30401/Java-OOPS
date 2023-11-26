package constructors;
import java.util.Scanner;

public class ConstructorsNonParameterized {
	public static void main(String[] args) {
			Add a = new Add();
			System.out.println(a.isadd());
			Add a1= new Add();
			System.out.println(a1.isadd());
			
	}
}
class Add{
	int a,b;
	Scanner sc = new Scanner(System.in);
	Add(){
		
		System.out.println("Enter a and b ");
		a = sc.nextInt();b=sc.nextInt();
		
			
	}
	public int isadd() {
		return a+b;
	}
}
