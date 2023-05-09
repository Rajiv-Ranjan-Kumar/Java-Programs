class P
{
	public static void main(String args[])
	{
		int temp = 40 , c = 1;
		for(int i = 1 ; i <=4; i++)
		{
			for(int j = 1 ; j <= 4 ; j++)
			{
				if(i<=j)
				{
					System.out.print(" "+(temp+c));
					c++;
				}
				else
					System.out.print("   ");
			}
			System.out.print("\n");
			temp = temp-10 ;
			c = 1 ;
		}
	}
}