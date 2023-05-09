class ThisKeyword1
{
	String name , email , address ;
	int pinCode ;
	
	ThisKeyword1()
	{
		name = "Rajiv" ;
		email = "rrks.195@gmail.com";
		address = "A Bad";
		pinCode = 1234 ;
	}
	
	void disp()
	{
		String name = "Ranjan",email="ranjan123@gmail.com",address="Gaya";
		int pinCode=7894;
		
		System.out.println("Print local data without using this keyword");
		System.out.println(name+"\t"+email+"\t"+address+"\t"+pinCode);
		
		/*use in this keyword becouse instence variable and local variable is same name
		  and this keyword is refered in object of courent class*/
		System.out.println("\nPrint instence/globle data using this keyword");
		System.out.println(this.name+"\t"+this.email+"\t"+this.address+"\t"+this.pinCode);
	}
	
	public static void main(String args[])
	{
		ThisKeyword1 tk1 = new ThisKeyword1();
		tk1.disp();
	}
}