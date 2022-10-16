package Casting;

public class ImplicitCasting {

	
	public static void main(String[] args) {
		
		//byte->short->int->long->double.
		
		byte a=12;
		short b=a;
		int c=b;
		long d=c;
		double e =d;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
