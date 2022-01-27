package factwhile;
import java.util.Scanner;
public class Customexception
{

	public static void main(String[] args) throws UnderAgeException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();

		try
		{
			if(age<21)
			{
				throw new UnderAgeException(" 'Under Age Exception':age is under age");
			}
			else
			{
				System.out.println("show profiles");
			}
		}
		catch (UnderAgeException U) {
			System.out.println("Exception occured it is handled"+U.getMessage());
		}

	}
}
		class UnderAgeException extends Exception
		{
			String ErrorMessage;

			UnderAgeException(String Errormessage)
			{
				this.ErrorMessage=Errormessage;
			}
			public String getMessage()
			{
				return ErrorMessage;
			}
		}
	
		


	


