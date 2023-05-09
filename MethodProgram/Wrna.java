class Wrna{

	//With Return No Argument(WRNA) Member Function\Method
	int add(){
	int a = 10 ;
	int b = 15 ;
	int c = a+b;
 	return(c);
	}

	public static void main(String args[]){
	Wrna w = new Wrna();
	int c = w.add();
	System.out.println("Sum = " + c);
	}
}