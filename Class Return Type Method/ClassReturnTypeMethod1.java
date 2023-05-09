class InputDetail
{
	String name , college , department ;
	int rollNo ;
	
	//no return with argument member function\method for input details
	void input(String n , String c , String d , int r)
	{
		name = n;
		college = c;
		department = d;
		rollNo = r;
	}
}


class ClassReturnTypeMethod1
{
	//class return type member funtion\method and return class object refrence id 
	InputDetail detail()
	{
		InputDetail i = new InputDetail();
		i.input("Rajiv","Gaya College,Gaya" , "BCA" , 123);
		return i;
	}
	
	//class type argument passing member function\method and display details using class object refrence id
	void disp(InputDetail i)
	{
		String name="",college="",department="";
		int rollNo=0;
		System.out.println(i.name+"\t"+i.rollNo+"\t"+i.college+"\t"+i.department);
	}
	
	public static void main(String args[])
	{
		ClassReturnTypeMethod1 crtm = new ClassReturnTypeMethod1();
		InputDetail i = crtm.detail();
		crtm.disp(i);
	}
}