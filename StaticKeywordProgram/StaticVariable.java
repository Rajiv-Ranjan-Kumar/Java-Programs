class StaticVariable
{
	static String compniName = "Ujala",productName = "Blub";
	int price ;
	String watt ;
	int voltage ;
	
	StaticVariable(int p , String w , int v)
	{
		price=p;
		watt=w;
		voltage=v;
	}
	
	void disp()
	{
		System.out.println("productName\t\tcompniName\t\tPrice\t\t\tWatt\t\tVoltage");
		System.out.println(productName+"\t\t\t"+compniName+"\t\t\t"+price+"\t\t\t"+watt+"\t\t"+voltage);
	}
	
	public static void main(String args[])
	{
		StaticVariable sv = new StaticVariable(100,"100w",240);
		sv.disp();
		
		StaticVariable sv1 = new StaticVariable(150,"200w",540);
		sv1.disp();
		
		System.out.println("\nDirect Call of Static Data Member");
		System.out.println(compniName+"\t"+productName); //Direct Call of Static Data Member
		
		System.out.println("\nCall of Static Data Member With Class Object");
		System.out.println(new StaticVariable(100,"100w",240).compniName+"\t"+new StaticVariable(100,"100w",240).productName); //Call of Static Data Member With Class Object
		
		System.out.println("\nCall of Static Data Member With Refrence Id");
		StaticVariable sv2 = new StaticVariable(100,"100w",240);
		System.out.println(sv2.compniName+"\t"+sv2.productName); //Call of Static Data Member With Refrence Id
		
		System.out.println("\nCall of Static Data Member With Class Name");
		System.out.println(StaticVariable.compniName+"\t"+StaticVariable.productName); //Call of Static Data Member With Class Name, This is Standar Aproch
	}
}