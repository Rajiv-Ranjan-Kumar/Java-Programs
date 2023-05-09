import java.util.*;
class DefaultDetails
{
	String name , college , department ;
	int rollNo ;
	
	//without parameterized constructor for set default value
	DefaultDetails()
	{
		name = "Rajiv Rajan Kumar";
		college = "SRM Univercity";
		department = "MCA";
		rollNo = 123;
	}
	
	//parameterized constructor for set value of get by User 
	DefaultDetails(String n , String c , String d , int r )
	{
		name = n;
		college = c;
		department= d;
		rollNo = r;
	}	
}

class InputDetails
{
	String name = "" ,  college = "" , department = "";
	int rollNo = 0;
	
	//No return without parameterized member fuction\method for get details by user
	void inputDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		System.out.print("Enter College Name : ");
		college=sc.nextLine();
		System.out.print("Enter Department Name : ");
		department=sc.nextLine();
		System.out.print("Enter roll Number : ");
		rollNo=sc.nextInt();
	}
}


class DisplayDetails
{
	//no return without parameterized member fuction\method for display Details for default and parameterized constructor
	void displayDetails(DefaultDetails d)
	{
		String name = "" , college = "" , department = "";
		int rollNo = 0 ;
		
		System.out.println(d.name+"\t"+d.rollNo+"\t"+d.college+"\t"+d.department);
	}
}

class ClassReturnTypeMethod2
{
	//Class return type member function\method for return refrence id of default class
	DefaultDetails returnMethod()
	{
		return new DefaultDetails();//Object creation of DefaultDetails class and return refrence id for show default constructor details
	}
	
	
	public static void main(String args[])
	{
		String name = "" ,  college = "" , department = "";
		int rollNo = 0;
		
		InputDetails id = new  InputDetails();
		id.inputDetails(); // calling of inputDetails member function\method for get details by user
		
		ReturnTypeMethod2 rtm = new ReturnTypeMethod2();//object creation of ReturnTypeMethod2 class for calling returnMethod member function\method
		DisplayDetails dsp = new DisplayDetails();//object creation of DisplayDetails class for calling displayDetails member function\method
		
		System.out.println("\nDefault value");
		dsp.displayDetails(rtm.returnMethod());//calling default constructor and displayDetails member fuction\method for show default details
		
		DefaultDetails d = new DefaultDetails(id.name , id.college , id.department , id.rollNo);//object creation DefaultDetails class for parameterized constructor and send argument
		System.out.println("\nBy user input value");
		dsp.displayDetails(d);//calling displayDetails member function\method for display parameterized constructor details
		
	}
}