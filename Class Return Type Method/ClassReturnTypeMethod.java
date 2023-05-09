class Default
{
	String name , college , department ;
	int rollNo ;
	Default()
	{
		name = "Rajiv" ;
		college = "KIIT" ;
		department = "MCA" ;
		rollNo = 123 ;
	}
}

class ClassReturnTypeMethod
{
	//class return type member function\method
	Default Return()
	{
		return new Default();
	}
	
	//class argument passing type member function\method
	void disp(Default d)
	{
		String name="" , college="" , department="" ;
		int rollNo=0;
		System.out.println(d.name+"\t"+d.rollNo+"\t"+d.college+"\t"+d.department);
	}
	
	public static void main(String args[])
	{
		ClassReturnTypeMethod c = new ClassReturnTypeMethod();
		Default d = c.Return();
		c.disp(d);
	}
} 