package str_reve;

public class Nonstatic1 
{
	int a;
	{
		a=10;
		System.out.println(a);
	}
	{
		System.out.println(a);
	}


 public static void main(String args[])
{
	Nonstatic1  a1=new Nonstatic1();
	System.out.println("Main ");
	Nonstatic1  a2=new Nonstatic1();
}
}
