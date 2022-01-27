package factwhile;
class A1 
{
	void A1()
	{
		System.out.println("1st method");
	}

	void A1(int a)
	{
		System.out.println("2nd method");
	}
}

public class Compiletime
{

	public static void main(String[] args)
	{
		A a1=new A();
		a1.A1();
		a1.A1(10);

	}

}
