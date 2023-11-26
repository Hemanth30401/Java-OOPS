package abstraction;

public class Thread_Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.start();
		for(int x=0;x<10;x++)
			System.out.println("Main Thread");
	}

}
class Demo extends Thread
{
	public void run() {
		for(int x=0;x<10;x++)
		System.out.println("Thread");
	}
}