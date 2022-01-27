package factwhile;

public class Exce 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int i,j,k;
		i=5;
		j=0;

		int[] arr= {5,10,15,20};
		try {
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}

	}


