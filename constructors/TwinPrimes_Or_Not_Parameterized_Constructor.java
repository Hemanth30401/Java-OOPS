package constructors;
import java.util.Scanner;
public class TwinPrimes_Or_Not_Parameterized_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b values");
		int a=sc.nextInt(),b=sc.nextInt(),x=0,y=0;
		TwinsP p = new TwinsP(a,b);
		x=p.n1;
		y=p.n2;
		int r1=p.callTwins(x);
		int r2=p.callTwins(y);
		if(y-x==2) {
			if(r1==2 && r2==2)
				System.out.println(x + " is Twin Primes of " + y);
			else
				System.out.println("Not Primes");
		}
		else
			System.out.println(x+ " is Not Twin Primes of " + y);
	}
		
}
class TwinsP{
	int n1,n2;
	TwinsP(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	public int callTwins(int n1) {
		int count=0;
		for(int x=1;x<=n1;x++) {
			if(n1%x==0) {
				count++;
			}
		}
		return count;
	}
}