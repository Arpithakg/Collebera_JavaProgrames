package Rectstatic;

public class Rect_static
{

	public static void main(String[] args) 
	{
		Sample.area1();
		System.out.println(Sample.area);

	}

}


class Sample
{
	static int l=14;
	static int b=10;
   static int area=l*b;
   public static void area1()
      
   	{
	   System.out.println(area);
    }
 }
