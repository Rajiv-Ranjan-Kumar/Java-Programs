public class Explicit{
	public static void main(String args[]){
		short s = 300;
		byte b = (byte)s; //Type Casting Explicit
		System.out.println(b);
		
		int i = 300490;
		char c = (char)i; //Type Casting Explicit
		short s1 = (short)i; //Type Casting Explicit
		System.out.println(c);
		System.out.println(s1);
		
		float f = 1250.50f;
		int i1 = (int) f;//Type Casting Explicit
		System.out.println(i1);
		
		double d = 1254364.50;
		int i2 = (int)d;//Type Casting Explicit
		System.out.println(i2);
		
		long l = 12345698778l;
		int l3 = (int)l;//Type Casting Explicit
		System.out.println(l3);
		
		double d1 = 12065450.545860;
		float f1 = (float)d1;//Type Casting Explicit
		System.out.println(f1);
		int i4 = (int)d1;//Type Casting Explicit
		System.out.println(i4);
		long l2 = (long)d1;//Type Casting Explicit
		System.out.println(l2);
		
	}
}