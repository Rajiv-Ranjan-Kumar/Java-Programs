class StudentInfo1
{
	String name , college , department ;
	int rollNo ;
	
	StudentInfo1()
	{
		
		name = "Rajiv";
		college = "KIIT";
		department = "MCA";
		rollNo = 123 ;
		
	}
	
	void dispInfo()
	{
		System.out.println(name+"\t"+rollNo+"\t"+college+"\t"+department);
	}
	
	public static void main(String args[])
	{
		StudentInfo1 s = new StudentInfo1();
		s.dispInfo();
	}

}