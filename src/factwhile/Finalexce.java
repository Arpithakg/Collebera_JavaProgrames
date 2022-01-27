package factwhile;

public class Finalexce
{
	
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			int i,j,k;
			i=5;
			j=0;

			try {
				k=i/j;
			}
			
			catch(ArrayIndexOutOfBoundsException e )
			{
				System.out.println(e);
			}
			/*catch(ArithmeticException e)      
			{
				System.out.println(e);
			}*/
			catch(Exception p) /* should be in last, automatically identify the exception type */
			{
				System.out.println(p);
			}
			finally//should be last statment of the class//
			{
				System.out.println("Hai" );
			}
		}

	}


