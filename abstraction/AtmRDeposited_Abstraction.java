package abstraction;

public class AtmRDeposited_Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank a = new BankA();
		a.getBalance();
		Bank b = new BankB();
		b.getBalance();
		Bank c = new BankC();
		c.getBalance();
	}

}
abstract class Bank1
{
	public abstract void getBalance();
}
class Bank extends Bank1
{
	public void getBalance() {
		System.out.println("Balance is: ");
	}
}
class BankA extends Bank
{
	int m=1000;
	public void getBalance() {
		System.out.println("Deposited " + m + " in bank A");
	}
}
class BankB extends Bank
{
	int n=5000;
	public void getBalance() {
		System.out.println("Deposited " + n + " in bank B");
	}
}

class BankC extends Bank
{
	int p=2000;
	public void getBalance() {
		System.out.println("Deposited " + p + " in bank C");
	}
}
