package factwhile;

import java.util.Scanner;

public class Scanneradd 
{
	public static int sum(int a,int b)
	{
		int c=(a+b);
		return c;

	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int s=sum(a,b);
		System.out.println("sum of the no is:"+s);


	}

}
