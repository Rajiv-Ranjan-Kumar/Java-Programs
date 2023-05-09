import java.util.Scanner;
class SwitchCase
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();
		System.out.println("1. For Add\t2. For Subtract \n3. For Multiply\t 4. For Divide\t5. For Exit");
		System.out.println("Enter Your Choice : ");
		int c = sc.nextInt();
		switch(c)
		{
			case 1:
				System.out.println("Sum = "+(num1+num2));
				break;
			case 2:
				System.out.println("Sub = "+(num1-num2));
				break;
			case 3:
				System.out.println("Mul = "+(num1*num2));
				break;
			case 4:
				if(num2==0)
				{
					System.out.println("Division is not Posible");
					break;
				}
				else if(num1<num2)
				{
					System.out.println("Div = "+(num1/(num2+0.0f)));
					break;
				}
				else
					System.out.println("Div = "+(num1/num2));
					break;
			case 5:
				break;
			default:
				System.out.println("Invalid Choice");
		}
	}
	
}