public class TypePromotionImplicit{
	public static void main(String args[]){
		byte b = 10;
		short s = b; //type promotion (Implicite Type Conversion)
		System.out.println(s);
		
		short s1 = 12;
		int i = s1 ; //type promotion (Implicite Type Conversion)
		System.out.println(i);
		
		char c = 'A';
		int i1 = c ; //type promotion (Implicite Type Conversion)
		System.out.println(i1);
		
		int i2 = 20;
		long l = i2 ; //type promotion (Implicite Type Conversion)
		float f = i2 ; //type promotion (Implicite Type Conversion)
		System.out.println(l);
		System.out.println(f);
		
		long l1 = 123546;
		float f1 = l1; //type promotion (Implicite Type Conversion)
		double d = l1; //type promotion (Implicite Type Conversion)
		System.out.println(f1);
		System.out.println(d);
		
		float f2 = 125.50f; //becose bydefault double
		double d1 = f2; //type promotion (Implicite Type Conversion)
		System.out.println(d1);
	}
}