class Nrna{
	
	//No Return No Argoment(NRNA) Member Function/Method
	void add(){
	int a = 10 ;
	int b = 20 ;
	int c = a+b;
	System.out.println("Sum = " + c);
	}

	public static void main(String args[]){
	Nrna n = new Nrna();
	n.add();
	}
}