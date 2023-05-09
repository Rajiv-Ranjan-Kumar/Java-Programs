import java.util.Scanner;
class WhileLoop
{
	public static void main(String args[])
	{
		int i = 1 ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number For Print Table : ");
		int num = sc.nextInt();
		while(i<=10)
		{
			System.out.println(i*num);
			i++;
		}
	}
}