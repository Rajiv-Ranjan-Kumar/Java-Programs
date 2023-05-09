class Level
{
	public static void main(String args[])
	{
		lable:
		for(int i = 1 ; i <= 10 ; i++)
		{
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.println("Value of I = "+i+"\t\tValue of j = "+j);
				if(j == 3)
					break lable;
				else
					continue lable;
			}
		}
	}
}