package factwhile;

class A
{
	public static void A1()
	{
		System.out.println("Super_calss method");
	}
}
 class B extends A
 {
	 public static void A1()
	 {
		 System.out.println("Sub class method");
	 }
 }



public class Methodshadowing {

	public static void main(String[] args) 
	{
		B b1=new B();
		b1.A1();
		A obj=b1;
		obj.A1();

	}

}
