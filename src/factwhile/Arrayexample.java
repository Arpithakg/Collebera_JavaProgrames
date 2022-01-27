package factwhile;

public class Arrayexample
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		System.out.println(a.length);
		System.out.println(a[a.length-3]);
		System.out.println(a[2]);

		for(int i=0;i<a.length;i++) /*for all values in a[]*/
		{
			System.out.println(a[i]);
		}
		
	}

}
