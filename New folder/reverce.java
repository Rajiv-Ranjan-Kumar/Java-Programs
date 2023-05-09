import java.util.*;
public class reverce{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter Number : ");
int num = sc.nextInt();

int r , rev = 0 ;
while(num != 0)
{
  r = num % 10 ;
rev = rev * 10 + r ;
num = num / 10 ;
}

System.out.println("Reverce Number = " + rev);
}
}