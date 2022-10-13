package thisSuperConcept;

public class This_Super_Keywords_2 extends This_Super_Keywords_1 {

	int a=10;   // Global class variable of sub(current) class .
	
	public void variable() 
	{
		int a=20;
		System.out.println(a); //20 
		System.out.println(this.a); //10 //call global variable from same/current class 
		System.out.println(super.a); //30 //call global variable from super class
		
	}
	
	public static void main(String[] args) {
		
		This_Super_Keywords_2 s = new This_Super_Keywords_2();
		s.variable();
		
		//if i declare the global variable as static  then the a variable is print in sub class.
		//System.out.println(a);//sub class global variable 
	}
}
