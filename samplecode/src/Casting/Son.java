package Casting;

public class Son extends Father{

	public void house()
	{
		System.out.println("Father has 2 mansion");
	}
	public void moblie()
	{
		System.out.println("Son has Iphone");
	}
	public void car()
	{
		System.out.println("Father has Lamborgeni and Audi ");
	}
	
	public static void main(String[] args) {
		
		Father g =new Father();
		g.car();
		g.house();
		
		Father f = new Son();  		//UpCasting 
		f.car();
		f.house();
	
		Son s = new Son();			//overriding 
		s.car();
		s.house();
		s.moblie();
		
	}
}
