package factwhile;

public class Driver
{

	public static void main(String[] args) 
	{
		Debitcard d=new Debitcard();
		Swipe s=new Swipe();
		s.Swipping_Machine(d);
		Creditcard c=new Creditcard();
		s.Swipping_Machine(c);

	}

}
