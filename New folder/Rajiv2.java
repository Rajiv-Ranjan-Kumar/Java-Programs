import java.util.*;

public class Rajiv2{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("\nEnter First Number : ");
int num1 = sc.nextInt();

System.out.print("\nEnter Second Number : ");
int num2 = sc.nextInt();

int sum = num1 + num2 ;
System.out.print("\nSum = " + sum);

try{
	int div = num1 / num2 ;
	System.out.print("\nDiv = " + div);
}
catch(Exception e){
	System.out.print("\n"+e);

}

int mul = num1 * num2 ;
System.out.print("\nMul = " + mul);

int sub = num1 - num2 ;
System.out.print("\nSub = " + sum);

}
}