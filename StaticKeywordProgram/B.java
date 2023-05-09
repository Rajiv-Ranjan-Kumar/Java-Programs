class A
{
	static
	{
		System.out.println("static class loading ");
	}
}

class B
{
	static
	{
		new A();    
	}
	
	public static void main(String arg[])
	{

	}
 }