package factwhile;

public class Consructor_ovr
{
	Consructor_ovr(int a)
	{
		System.out.println(a);
	}
	
	Consructor_ovr(double b,String c)
	{
		System.out.println(b+ " "+c);
	}

	Consructor_ovr(String a,double b)
	{
		System.out.println(a+ " "+b);
	}

	Consructor_ovr(double a,int b)
	{
		System.out.println(a+ " "+b);
	}



	public static void main(String[] args) 
	{
		Consructor_ovr a1=new Consructor_ovr(10);
		Consructor_ovr a2=new Consructor_ovr(10.5,"10.0");
		Consructor_ovr a3=new Consructor_ovr("10",10.4);
		Consructor_ovr a4=new Consructor_ovr(10.5,10);

	}

}
