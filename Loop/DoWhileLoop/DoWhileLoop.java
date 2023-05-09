import java.util.Scanner;
class DoWhileLoop
{
	public static void main(String args[])
	{
		int i = 1;
		System.out.print("Enter a Number For Print Table : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		do
		{
			System.out.println(i*num);
			i++;
		}while(i<=10);
	}
}