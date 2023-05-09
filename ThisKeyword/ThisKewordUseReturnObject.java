class ThisKewordUseReturnObject
{
	static void disp(ReturnObject obj)
	{
		System.out.println(obj.name+"\t"+obj.email+"\t"+obj.idNo);
	}
	
	public static void main(String args[])
	{
		ReturnObject ro = new ReturnObject();
		ReturnObject r = ro.returnObject();
		ThisKewordUseReturnObject.disp(r);
	}
}

class ReturnObject
{
	String name , email;
	int idNo;
	
	ReturnObject()
	{
		name = "Jay Prakash";
		email = "bitukumar9771@gmail.com";
		idNo = 123;
	}
	
	//class return type method and return object refrence id
	ReturnObject returnObject()
	{
		return this; //return class refrence id
	}
}