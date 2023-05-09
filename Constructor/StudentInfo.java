class StudentInfo
{
	String name , college , department ;
	int rollNo ;
	
	StudentInfo(String n , String c , String d , int r)
	{
		
		name = n;
		college = c;
		department = d;
		rollNo = r;
		
	}
	
	void dispInfo()
	{
		System.out.println(name+"\t"+rollNo+"\t"+college+"\t"+department);
	}
	
	public static void main(String args[])
	{
		StudentInfo s = new StudentInfo("Jay Prakash" , "SRM" , "MCA" , 1234);
		s.dispInfo();
	}

}