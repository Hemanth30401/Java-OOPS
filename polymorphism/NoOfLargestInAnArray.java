package polymorphism;

public class NoOfLargestInAnArray {

	static public void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,2,3,7,5,3,6,4,2,8,9,0};
		boolean[] b = new boolean[a.length];
		int temp=1,k=9,count=1;
		for(int x=0;x<a.length-1;x++)
		{
			if(a[x]<a[x+1]) {
				temp=a[x+1];
				a[x+1]=a[x];
				a[x]=temp;
				x=-1;
			}
		}
		System.out.println("Sorted array is: ");
		for(int v:a)
			System.out.print(v + " ");
		System.out.println();
		System.out.println("Unique elements are: ");
		for(int x=0;x<a.length;x++)
		{
			count=1;
			if(b[x]==true)
				continue;
			for(int y=x+1;y<a.length;y++) {
				if(a[x]==a[y]) {
					count++;
					b[y]=true;
				}
			}
			if(count>0) {
				System.out.print(a[x] + " ");
			}
			
		}
		System.out.println();
		System.out.println(k+ "th largest number is: ");
		System.out.println(a[k+1]);
	}
}
