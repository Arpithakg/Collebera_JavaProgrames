package factwhile;

class upcasting 
{

	public static void main(String[] args)
	{
		
		UpcastingB b1=new UpcastingB();
		System.out.println(b1.i);
		System.out.println(b1.j);
		System.out.println(b1);
		
		upcastingA a1=new upcastingA();
		System.out.println(a1.i);
		// System.out.println(a1.j);//CTE//
		System.out.println(a1);
		
		upcastingA a2=b1;
		System.out.println(a2);
		System.out.println(b1);
		System.out.println(a2.i);
		/*System.out.println(a2.j);*/
	}
}


