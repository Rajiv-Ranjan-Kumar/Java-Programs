import java . util . Scanner;
class ThisKeywordUseMethodsChaining
{
	String name , email , department;
	int rollNo;
	
	void dispData()
	{
		System.out.println("\n"+name+"\t"+email+"\t"+department+"\t"+rollNo);
	}
	
	ThisKeywordUseMethodsChaining getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Roll No. : ");
		rollNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Department Name : ");
		department=sc.nextLine();
		System.out.println("Enter Email : ");
		email=sc.nextLine();
		return this;
	}
	
	public static void main(String args[])
	{
		new ThisKeywordUseMethodsChaining().getData().dispData(); //calling All methods by Method Chaining
	}
}