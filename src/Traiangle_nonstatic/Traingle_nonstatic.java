package Traiangle_nonstatic;

public class Traingle_nonstatic 
{

	public static void main(String[] args)
	{
	new Sample().area1();
	System.out.println(new Sample().area);
	}
	}
	
	class Sample
	
	{
		double b=16;
		double h=2;
		double area=(b*h)/2;
		void area1()
		{
			System.out.println(area);
		}
}


