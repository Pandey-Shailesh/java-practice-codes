package Casting;

public class ExplicitCasting {

	public static void main(String[] args) {
		
		//double->long->int->short->byte
		
		double a =2220.48;
		long b=(long)a;
		int c= (int)b;
		short d =(short)c;
		byte e =(byte)d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
