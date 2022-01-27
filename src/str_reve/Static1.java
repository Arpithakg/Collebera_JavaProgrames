package str_reve;

	class Static1
	{
		public static void main (String args[])
		{
			Static.a=10;
			Static.b=20;
			Static.c=30;
			System.out.println(Static.b);
			Static a1=new Static();
			System.out.println(a1.b);
			Static a2=new Static();
			System.out.println(a2.b);

		}
	}


