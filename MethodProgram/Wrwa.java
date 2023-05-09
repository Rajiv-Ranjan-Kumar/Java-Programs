class Wrwa{

	//With Return With Argument(WRWA) Member Function\Method
	int add(int a , int b){
	int c = a+b;
	return(c);
	}
	
	public static void main(String args[]){
	Wrwa w = new Wrwa();
	int c = w.add(10,5);
	System.out.println("Sum = " + c);
	}
}