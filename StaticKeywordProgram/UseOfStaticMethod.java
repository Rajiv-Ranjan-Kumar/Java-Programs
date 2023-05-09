import java.util.Scanner;
class StaticMethod
{
    static float x = 0.0f; //This is a Static Data Member
	
	//This is a Static member Function of Without return with Argument
    static void calculation(int c , int num1 , int num2)
    {
        switch(c)
        {
            case 1:
                x = num1 + num2 ;
                break ;
            case 2:
                x = num1 - num2 ;
                break ;
            case 3:
                x = num1 * num2 ;
                break ;
            case 4:
                x = num1 / (num2 + 0.0f) ;
                break ;
            default:
                break ; 
        }
    }
}

class UseOfStaticMethod
{

    void disp(int c , int num2)
    {
        if(c == 1)
            System.out.println("Sum = "+StaticMethod.x); //call of Static variable with refrence of class name this is the Standard Approch
        else if(c == 2)
            System.out.println("Sub = "+StaticMethod.x); //call of Static variable with refrence of class name this is the Standard Approch
        else if(c == 3)
            System.out.println("Mul = "+StaticMethod.x); //call of Static variable with refrence of class name this is the Standard Approch
        else if(c == 4 && num2 != 0)
            System.out.println("Div = "+StaticMethod.x); //call of Static variable with refrence of class name this is the Standard Approch
		else if(c == 4 && num2 == 0)
			System.out.println("Division is not posible"); 
		else
			System.out.println("Wrong Choice");
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();

        System.out.println("1. Add \t\t 2. Substract\n3. Multiply\t 4. Divide");
        System.out.println("Enter Your Choice : ");
        int c = sc . nextInt();

        StaticMethod.calculation(c, num1, num2); //call of Static member function with refrence of class name this is the Standard Approch
        UseOfStaticMethod uosm = new UseOfStaticMethod();
        uosm.disp(c,num2); ////call of Non Static Member Function with refrence of class variable this is the Standard Approch
    }
}