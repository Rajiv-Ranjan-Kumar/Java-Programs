import java.util.Scanner;
class UnaryOperator
{
	void postfix(int a , int b)
	{
		int num1 = a++; //First Assign a in num1 Then Increment Value of a
		int num2 = b++; //First Assign b in num2 Then Increment Value of b	
		System.out.println("\nPost Increment");
		System.out.println("Num1 = " + num1 + "\tNum2 = " + num2);
		System.out.println("Num1 = " + a + "\tNum2 = " + b);
		
		a = num1--; //First Assign num1 in a Then Decrement Value Of num1
		b = num2--; //First Assign num2 in b Then Decrement Value Of num2
		System.out.println("\nPost Decrement");
		System.out.println("Num1 = " + a + "\tNum2 = " + b);
		System.out.println("Num1 = " + num1 + "\tNum2 = " + num2);
	}
	
	void prefix(int a , int b)
	{
		int t1 = a , t2 = b , t3 = a , t4 = b;
		
		int num1 = ++a ; // First Increment Value of a Then Assign a in Num1
		int num2 = ++b ; // First Increment Value of b Then Assign b in Num2
		
		System.out.println("\npre Incriment");
		System.out.println("Num1 = " + num1 + "\tNum2 = " + num2);
		System.out.println("Num1 = " + a + "\tNum2 = " + b);
		
		num1 = --t1; // First Increment Value of t1 Then Assign t1 in Num1
		num2 = --t2; // First Increment Value of t2 Then Assign t2 in Num2
		System.out.println("\npre Decrement");
		System.out.println("Num1 = " + num1 + "\tNum2 = " + num2);
		System.out.println("Num1 = " + t1 + "\tNum2 = " + t2);
		
		int temp1 = +t3 ; // Store of Value t3 in temp1 With Sign
		int temp2 = -t4 ; // Store of Value t4 in temp2 With Sign
		System.out.println("\nStore Value With Sign");
		System.out.println("Num1 = " + temp1 + "\tNum2 = " + t3);
		System.out.println("Num1 = " + temp2 + "\tNum2 = " + t4);
		
		temp1 = ~t3; // First The Value of t3 Increment 1 Then Assign in temp1 With Apposite Sign
		boolean x = !true ; // Assign Boolean Apposite Value in x (for ex:- !true , Assign x = false or !false Assign x = true)
		System.out.println("\n(~) Operator");
		System.out.println("Num1 = " + temp1 + "\tNum2 = " + t3);
		System.out.println("\n(!) Operator");
		System.out.println(x);
	}
}

class ArthmeticOperator
{
	void addNumbers(int a , int b)
	{
		int add = a + b;
		System.out.println("Addition of Numbers "+a+" And "+b+" = "+add);
	}
	
	void subtractNumbers(int a , int b)
	{
		int sub = a - b;
		System.out.println("Subtraction of Numbers "+a+" And "+b+" = "+sub);
	}
	
	void multiplyNumbers(int a , int b)
	{
		int mul = a * b;
		System.out.println("Multiplication of Numbers "+a+" And "+b+" = "+mul);
	}
	
	void devideNumbers(int a , int b)
	{
		int dev = 0 ;
		if(a >= b && b != 0 ) 
		{
			dev = a / b ;
			System.out.println("Devision of Numbers "+a+" And "+b+" = "+dev);
		}
		else if(b >= a && a != 0)
		{
			dev = b / a ;
			System.out.println("Devision of Numbers "+b+" And "+a+" = "+dev);
		}
		else
			System.out.println("Devision is Not Possible");
	}
	
	void modulationNumber(int a , int b)
	{
		int mod = 0 ;
		if(a >= b && b != 0)
		{
			mod = a % b;
			System.out.println("Modulation of Numbers "+a+" And "+b+" = "+mod);
		}
		else if(b >= a && a != 0)
		{
			mod = b % a;
			System.out.println("Modulation of Numbers "+b+" And "+a+" = "+mod);
		}
		else
			System.out.println("Modulation is Not Possible");
	}
}

class SiftOperator
{
	void leftShift(int a , int b)
	{
		int num1 = a << 2; // num1=a*2^2=a*4 (4 bit is leftshifting)
		int num2 = b << 2; // num2=b*2^2=b*4 (4 bit is leftshifting)
		int num3 = a << 3; // num3=a*2^3=a*8 (8 bit is leftshifting)
		int num4 = b << 5; // num4=b*2^5=b*32 (32 bit is leftshifting)
		
		System.out.println("Num1 = " + num1 + "\tNum2 = " + num2);
		System.out.println("Num3 = " + num3 + "\tNum4 = " + num4);
	}
	
	
	void rightShift(int a , int b)
	{
		int num1 = a >> 2; // num1=a/2^2=a/4 (4 bit is rightshifting)
		int num2 = b >> 2; // num2=b/2^2=b/4 (4 bit is rightshifting)
		int num3 = a >> 3; // num3=a/2^3=a/8 (8 bit is rightshifting)
		int num4 = b >> 5; // num4=b/2^5=b/32 (32 bit is rightshifting)
		int num5 = a >>>2; // (+ve) number same work but (-ve) number change parity bit (msb) to 0
		int num6 = b >>>3; // (+ve) number same work but (-ve) number change parity bit (msb) to 0
		
		System.out.println("Num1 = " + num1 + "\tNum2 = " + num2);
		System.out.println("Num3 = " + num3 + "\tNum4 = " + num4);
		System.out.println("Num5 = " + num5 + "\tNum6 = " + num6);
	}
}

class RelationalOperator
{
	void lessThen(int a , int b)
	{
		if(a < b)
			System.out.println("Lessthen True");
		else
			System.out.println("Lessthen False");
	}
	
	void greaterThen(int a , int b)
	{
		if(a > b)
			System.out.println("greaterthen True");
		else
			System.out.println("greaterthen False");
	}
	
	void lessThenEqualTo(int a , int b)
	{
		if(a <= b)
			System.out.println("Lessthen Equalsto True");
		else
			System.out.println("Lessthen Equalsto False");
	}
	
	void greaterThenEqualTo(int a , int b)
	{
		if(a >= b)
			System.out.println("greaterthen Equalsto True");
		else
			System.out.println("greaterthen Equalsto False");
	}
	
	void equalTo(int a , int b)
	{
		if(a == b)
			System.out.println("Equal to True");
		else
			System.out.println("Equal to False");
	}
	
	void notEqualTo(int a , int b)
	{
		if(a != b)
			System.out.println("Not Equal to True");
		else
			System.out.println("Not Equal to False");
	}
	
	void instanceof1()
	{
		B b = new B();
		System.out.println(b instanceof A);
	}
}

class A{}
class B extends A{}

class BitwiseOperater
{
	void bitwiseAnd(int a , int b)
	{
		System.out.println(a&b);
	}
	
	void bitwiseInclusiveOr(int a, int b)
	{
		System.out.println(a|b);
	}
	
	void bitwiseExclusiveOr(int a, int b)
	{
		System.out.println(a^b);
	}
}

class LogicalOperator
{
	void logicalAnd(int a , int b)
	{
		if(a>=0 && b>=0)
			System.out.println("Logical AND True");
		else
			System.out.println("Logical AND False");
	}
	
	void logicalOr(int a , int b)
	{
		if(a>=0 || b<=0)
			System.out.println("Logical OR True");
		else
			System.out.println("Logical OR False");
	}
}

class TernaryOperator
{
	void ternaryOperator(int a , int b)
	{
		String s = (a>b)?("Ternary Operator True"):("Ternary Operator False");
		System.out.println(s);
	}
}

class AssignmentOperator
{
	void assignment(int a , int b)
	{
		int num1 = 0 , num2 = 0;
		
		System.out.println("=");
		num1 = a;
		num2 = b;
		System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
		
		System.out.println("+=");
		num1 += a; //num1=num1+a;
		num2 += b; //num2=num2+b;
		System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
		
		System.out.println("-=");
		num1 -= a; //num1=num1-a;
		num2 -= b; //num2=num2-b;
		System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
		
		System.out.println("*=");
		num1 *= a; //num1=num1*a;
		num2 *= b; //num2=num2*b;
		System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
		
		System.out.println("/=");
		num1 /= a; //num1=num1/a;
		num2 /= b; //num2=num2/b;
		System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
		
		System.out.println("%=");
		num1 %= a; //num1=num1%a;
		num2 %= b; //num2=num2%b;
		System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
		
		System.out.println("&=");
		num1 &= a; //num1=num1&a;
		num2 &= b; //num2=num2&b;
		System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
		
		System.out.println("|=");
		num1 |= a; //num1=num1|a;
		num2 |= b; //num2=num2|b;
		System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
		
		System.out.println("^=");
		num1 ^= a; //num1=num1^a;
		num2 ^= b; //num2=num2^b;
		System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
		
		System.out.println("<<=");
		num1 <<= a; //num1=num1<<a;
		num2 <<= b; //num2=num2<<b;
		System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
		
		System.out.println(">>=");
		num1 >>= a; //num1=num1>>a;
		num2 >>= b; //num2=num2>>b;
		System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
		
		System.out.println(">>>=");
		num1 >>>= a; //num1=num1>>>a;
		num2 >>>= b; //num2=num2>>>b;
		System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
	}
}

class InputValues
{
	int num1 , num2 ;
	void inputNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		num1 = sc . nextInt();
		System.out.println("Enter Second Number : ");
		num2 = sc . nextInt();
	}
}

class AllOperator
{
	void callAllFunctionsOfAllClasses()
	{
		InputValues iv = new InputValues();
		iv.inputNumber();
		
		System.out.println("\nCalculations Of Unary Operators");
		UnaryOperator uo = new UnaryOperator();
		uo.postfix(iv.num1,iv.num2);
		uo.prefix(iv.num1,iv.num2);
		
		System.out.println("\nCalculations Of Arthmetic Operators\n");
		ArthmeticOperator ao = new ArthmeticOperator();
		ao.addNumbers(iv.num1,iv.num2);
		ao.subtractNumbers(iv.num1,iv.num2);
		ao.multiplyNumbers(iv.num1,iv.num2);
		ao.devideNumbers(iv.num1,iv.num2);
		ao.modulationNumber(iv.num1,iv.num2);
		
		System.out.println("\nCalculations of Sift Operator");
		SiftOperator so = new SiftOperator();
		System.out.println("\nleft Sift Operator");
		so.leftShift(iv.num1,iv.num2);
		System.out.println("\nRight Sift Operator");
		so.rightShift(iv.num1,iv.num2);
		
		System.out.println("\nCalculations of Relational Operator");
		RelationalOperator ro = new RelationalOperator();
		ro.lessThen(iv.num1 , iv.num2);
		ro.greaterThen(iv.num1 , iv.num2);
		ro.lessThenEqualTo(iv.num1,iv.num2);
		ro.greaterThenEqualTo(iv.num1,iv.num2);
		ro.equalTo(iv.num1,iv.num2);
		ro.notEqualTo(iv.num1,iv.num2);
		ro.instanceof1();
		
		System.out.println("\nCalculations of Bitwise Operator");
		BitwiseOperater bo = new BitwiseOperater();
		System.out.println("Bitwise AND Operator");
		bo.bitwiseAnd(iv.num1,iv.num2);
		System.out.println("Bitwise Inclusive Or Operator");
		bo.bitwiseInclusiveOr(iv.num1,iv.num2);
		System.out.println("Bitwise Exclusive Or Operator");
		bo.bitwiseExclusiveOr(iv.num1,iv.num2);
		
		System.out.println("\nCalculations of Logical Operator");
		LogicalOperator lo = new LogicalOperator();
		System.out.println("Logical AND Operator");
		lo.logicalAnd(iv.num1,iv.num2);
		System.out.println("Logical Or Operator");
		lo.logicalOr(iv.num1,iv.num2);
		
		System.out.println("\nCalculations of Ternary Operator");
		TernaryOperator to = new TernaryOperator();
		to.ternaryOperator(iv.num1,iv.num2);
		
		System.out.println("\nCalculations of Assignment Operator");
		AssignmentOperator ao1 = new AssignmentOperator();
		ao1.assignment(iv.num1,iv.num2);
	}
	
	public static void main(String args[])
	{
		AllOperator ao = new AllOperator();
		ao.callAllFunctionsOfAllClasses();
	}
}