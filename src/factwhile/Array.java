package factwhile;

import java.util.Scanner;

public class Array 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();

		}
		System.out.println("The elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}


	}

}
