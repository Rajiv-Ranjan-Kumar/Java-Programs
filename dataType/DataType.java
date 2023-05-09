public class DataType{
	int x;
	byte x1;
	short x2;
	long x3;
	float x4;
	double x5;
	char x6;
	String x7;
	boolean x8;
	int x9[];//array datatype
	public static void main(String args[]){
		DataType d =new DataType();
		System.out.println("Bydefault Value of int type = "+d.x);
		System.out.println("Bydefault Value of byte type = "+d.x1);
		System.out.println("Bydefault Value of short type = "+d.x2);
		System.out.println("Bydefault Value of long type = "+d.x3);
		System.out.println("Bydefault Value of float type = "+d.x4);	
		System.out.println("Bydefault Value of double type = "+d.x5);
		System.out.println("Bydefault Value of char type = "+d.x6);
		System.out.println("Bydefault Value of String type = "+d.x7);
		System.out.println("Bydefault Value of boolean type = "+d.x8);
		System.out.println("Bydefault Value of array type = "+d.x9);	
	}
}