class ThisKeywordUseMultipleConstractor
{
	int num1=10,num2=20,num3=30,num4=40;
	ThisKeywordUseMultipleConstractor()
	{
		this(2,4);
	}
	
	ThisKeywordUseMultipleConstractor(int a, int b)
	{
		this(5,4,6);
		System.out.println("num1+num2 = "+(num1+num2));
	}
	
	ThisKeywordUseMultipleConstractor(int a, int b, int c)
	{
		this(45,87,95,45);
		System.out.println("num1+num2+num3 = "+(num1+num2+num3));
	}
	
	ThisKeywordUseMultipleConstractor(int a, int b, int c, int d)
	{
		System.out.println("num1+num2+num3+num4 = "+(num1+num2+num3+num4));
	}
	
	//Init Block
	{
		System.out.println("num1 = "+num1+"\tnum2 = "+num2+"\tnum3 = "+num3+"\tnum4 = "+num4);
	}
	
	public static void main(String args[])
	{
		ThisKeywordUseMultipleConstractor tkumc = new ThisKeywordUseMultipleConstractor();
	}
}