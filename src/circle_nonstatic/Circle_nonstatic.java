package circle_nonstatic;

public class Circle_nonstatic
{

	public static void main(String[] args)
	{
		new Sample().area1();
		System.out.println(new Sample().area);
	}
}
	
	class Sample
	{
		double r=4.5;
		double pi=3.14;
		double area=pi*r*r;
		void area1()
		{
			System.out.println(area);
		}
	}


