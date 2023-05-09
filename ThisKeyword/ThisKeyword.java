class ThisKeyword
{
	String name , email , address ;
	int pinCode ;
	ThisKeyword(String name , String email , String address , int pinCode)
	{
		/*use in this keyword becouse instence variable and local variable is same name
		  and this keyword is refered in object of courent class*/
		  
		this.name = name; 
		this.email = email;
		this.address = address;
		this.pinCode = pinCode;
	}
	
	void disp()
	{
		System.out.println(name+"\t"+email+"\t"+address+"\t"+pinCode);
	}
	
	public static void main(String args[])
	{
		ThisKeyword tk = new ThisKeyword("Rajiv","rrks.195@gmail.com","A Bad",1234);
		tk.disp();
	}
}