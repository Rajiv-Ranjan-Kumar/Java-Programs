import java . util . Scanner ;
class ThisKeywordUseArgumentInMethods
{
	String name , department;
	int rollNo;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Department Name : ");
		department = sc.nextLine();
		System.out.println("Enter Roll No. : ");
		rollNo = sc.nextInt();
		
		DisplayData.disp(this); // call Disp method and send Argument refrence id
	}
	
	
	public static void main(String args[])
	{
		new ThisKeywordUseArgumentInMethods().getdata();
	}
}

class DisplayData
{
	//Static disp method
	static void disp(ThisKeywordUseArgumentInMethods rajiv)
	{
		System.out.println(rajiv.name+"\t"+rajiv.rollNo+"\t"+rajiv.department);
	}
}