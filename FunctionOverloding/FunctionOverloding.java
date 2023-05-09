class FunctionOverloding{
	
	//First Case
	void show(int num){
		System.out.println(num);
	}
	
	void show(byte num){
		System.out.println(num);
	}
	
	void show(short num){
		System.out.println(num);
	}
	
	void show(double num){
		System.out.println(num);
	}
	
	void show(float num){
		System.out.println(num);
	}
	
	void show(long num){
		System.out.println(num);
	}
	
	void show(char num){
		System.out.println(num);
	}
	
	void show(String num){
		System.out.println(num);
	}
	
	// Second Case
	void show(int num1 , int num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	void show(float num1 , float num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	void show(double num1 , double num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	void show(long num1 , long num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	//Third Case
	
	void show(int num1 , float num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	void show(int num1 , double num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	void show(int num1 , long num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	//fourth Case
	
	void shows(int num1 , float num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	void shows(float num1 , int num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	void shows(int num1 , double num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	void shows(double num1 , int num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	void shows(int num1 , long num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	void shows(long num1 , int num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	public static void main(String args[]){
		FunctionOverloding fo = new FunctionOverloding();
		fo.show(10);
		fo.show((byte)10);
		fo.show((short)10);
		fo.show(10.5d);
		fo.show(10.50f);
		fo.show(10l);
		fo.show('R');
		fo.show("Rajiv");
		
		fo.show(10,20);
		fo.show(10.5f,20.5f);
		fo.show(10.50d,20.5d);
		fo.show(10l,20l);
		
		fo.show(10,20.5f);
		fo.show(10,20.5d);
		fo.show(10,20l);
		
		fo.shows(10,10.5f);
		fo.shows(10.5f,10);
		fo.shows(10,20.5d);
		fo.shows(20.5d,10);
		fo.shows(10,100l);
		fo.shows(100l,10);
	}
}