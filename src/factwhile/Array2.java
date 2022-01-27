package factwhile;
import java.util.Scanner;
public class Array2
{
	public static int sum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;

	}
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the 5 number");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		int add=sum(a);
		System.out.println("sum is:"+add);
	}

}

