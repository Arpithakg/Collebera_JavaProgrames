package factwhile;

public class methodoverriding
{

	public static void main(String[] args) 
	{
	Method_B b1=new Method_B();
	b1.Light();
	
	Method_A a1=new Method_A();
	a1.Light();
	
	Method_A a2=b1;
	a2.Light();



	}

}
