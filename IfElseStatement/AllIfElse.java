import java.util.Scanner;
class IfStatement
{
	void ifCondition(int num)
	{
		if(num == 0)
			System.out.println("Number Is Zero");
	}
}

class IfElseStatement
{
	void ifelseCondition(int num)
	{
		if(num==0)
			System.out.println("Number Is Zero");
		else
			System.out.println("Number Is Not Zero");
	}
}

class IfElseIfStatement
{
	void ifelseifCondition(int num)
	{
		if(num==0)
			System.out.println("Number Is Zero");
		else if(num<0)
			System.out.println("-Ve Number");
		else
			System.out.println("+Ve Number");
	}
}

class NestedIfElseStatement
{
	void nestedifelseCondition(int num)
	{
		if(num >= 0)
		{
			if(num > 0)
				System.out.println("+Ve Number");
			else
				System.out.println("Number is Zero");
		}
		else
			System.out.println("-Ve Number");
	}
}

class AllIfElse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		
		System.out.println("====if Statement====");
		IfStatement is = new IfStatement();
		is.ifCondition(num);
		
		System.out.println("====if else Statement====");
		IfElseStatement ies = new IfElseStatement();
		ies.ifelseCondition(num);
		
		System.out.println("====if else if Statement====");
		IfElseIfStatement ieis = new IfElseIfStatement();
		ieis.ifelseifCondition(num);
		
		System.out.println("====Nested if rlse Statement====");
		NestedIfElseStatement nies = new NestedIfElseStatement();
		nies.nestedifelseCondition(num);
	}
}