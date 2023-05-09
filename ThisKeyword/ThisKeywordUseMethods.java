import java.util.Scanner;
class ThisKeywordUseMethods
{
	String name , email , department , cource , collegeName;
	int rollNo ;
	
	ThisKeywordUseMethods()
	{
		this.disp(); //using this keyword in first line of constractor so first-time call disp method and print default values
		name = "Rajiv Ranjan Kumar";
		rollNo = 1234;
		cource = "MCA";
		department = "Computer Since";
		email = "rrks.195@gmail.com";
		collegeName = "SRMIST";
		this.get(); //using this keyword in last line of constractor so first-time call get method and get data by user
		}
	
	void get()
	{
		this.disp(); //using this keyword in first line of get method so second-time call disp method and print set values

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter RollNo. : ");
		rollNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Cource Name : ");
		cource = sc.nextLine();
		System.out.println("Enter Department Name : ");
		department = sc.nextLine();
		System.out.println("Enter Email Id : ");
		email = sc.nextLine();
		System.out.println("Enter College Name : ");
		collegeName = sc.nextLine();
		
		this.disp(); //using this keyword in last line of get method so Third-time call disp method and print User Input values
	}
	void disp()
	{
		System.out.println(name+"\t"+rollNo+"\t"+cource+"\t"+department+"\t"+email+"\t"+collegeName);
	}
	
	public static void main(String args[])
	{
		ThisKeywordUseMethods tkum = new ThisKeywordUseMethods();
	}
}