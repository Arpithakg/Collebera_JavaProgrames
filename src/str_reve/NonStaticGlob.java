package str_reve;

class NonStaticGlob
{
	int a=10;//Global variable//
	{
		int a=20;//local variable 
		System.out.println(a);//output 20//
	}
	{
		int a=30;
		System.out.println(a);//30//
		System.out.println(this.a);//calling global variable useing this keyword//10
		
	}
	public static void main(String[] args)
	{
		NonStaticGlob a1=new NonStaticGlob();

	}

}
