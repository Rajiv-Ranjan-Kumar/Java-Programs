import java.util.Scanner;
class ForLoop
{
	public static void main(String args[])
	{
		System.out.print("Enter a Number For Prit Table : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i<=10; i++)
			System.out.println(i*num);
	}
}