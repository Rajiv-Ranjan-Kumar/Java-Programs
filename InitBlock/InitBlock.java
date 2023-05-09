class InitBlock
{
	String name , email , department , college;
	int rollNo;
	InitBlock(String n , int r , String e , String d , String c)
	{
		name = n ;
		rollNo = r ;
		email = e ;
		department = d ;
		college = c;
	}
	
	void disp()
	{
		System.out.println(name+"\t"+rollNo+"\t"+email+"\t"+department+"\t"+college);
	}
	
	void setData()
	{
		name = "Jay Prakash";
		rollNo= 105;
		email= "jay123@gmail.com";
		department="MCA";
		college="SRM";
	}
	
	public static void main(String args[])
	{
		InitBlock ib = new InitBlock("Rajiv",101,"rrksd.195@gmail.com","BCA","Gaya College");
		System.out.println("Data Of main method");
		ib.disp();
	}
	
	//This is a InitBlock
	{
		System.out.println("\nData of Init Block");
		setData();
		disp();
	}
}