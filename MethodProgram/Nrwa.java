class Nrwa{

	//No Return With Argument(NRWA) Member Function/Method
	void add(int a , int b){
	int c = a+b;
	System.out.println("Sum = " + c);
	}
	
	public static void main(String args[]){
	Nrwa n = new Nrwa();
	n.add(10,20);
	}
}