package polymorphismconcept;

public class Demo1 {
 
	//(//Method Overloading) (Compiletime Polymorphism)
	
	static public void addition(int a,int b,int c,int d )
	{
		int sum = a+b+c+d;
		System.out.println(sum);
	}
	 public void addition(int a,int b )
	{
		int sum = a+b;
		System.out.println(sum);
	}
	 public void addition(int a,int b, int c) 
	{
		int sum = a+b+c;
		System.out.println(sum);
	}
	 
	 public void name(String city, String Country)
	 {
		 System.out.println("city: "+city+" country:"+Country);
	 }
	 
	 public void name(String country ,int code)
	 {
		 System.out.println("country: "+country+" code: "+code);
	 }
	//OR
	public static void main(String[] args) {
		
		addition(1,2,3,4);
	}
}
