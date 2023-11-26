package LambdaExpressions;

@FunctionalInterface
interface A
{
	int iron(int i,int j);
}
//class B implements A
//{
//	public void iron()
//	{
//		System.out.println("I am iron man");
//	}
//}


public class FunctionalInterfaceForLambdaExps 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A a = (i,j) -> i+j;
		int r = a.iron(99,7);
		System.out.println(r);
	}

}

