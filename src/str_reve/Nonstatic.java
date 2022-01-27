package str_reve;

class Nonstatic
{
	int a=30;
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello"); /* first main method will be */
		Nonstatic a1=new Nonstatic ();
	}

}
