package factwhile;

import java.util.Scanner;

public class Array1
{

	public static void main(String[] args) 
	{   
		int sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();

		}

		for(int i=0;i<a.length;i++)
		 sum=sum+a[i];
		{
			System.out.println("Sum of the elements are;"+sum);
		}


	}

}
