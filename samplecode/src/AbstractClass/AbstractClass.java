package AbstractClass;

public abstract class AbstractClass {
	
	/*
	 
	 Abstract Class:
	 A class declared with "abstract" keyword is called abstract class. 
	 An Abstract class is nothing but an incomplete class where programmer can declare 
	complete as well as incomplete methods in it. (It requires Min 1 Complete and 1 
	Incomplete Method)
	 Programmer can declare incomplete methods as abstract method, by declaring 
	keyword called "abstract" Infront of method. 
	 We can't create object of abstract class, to create object of abstract class we need 
 	to make use of concrete class. 
 	
	Concrete class: 
	A class which provides definitions for all the incomplete methods which are present 
	in abstract class with the help of extends keywords is called concrete class.
	 
	 
	 */
	
	public abstract void name();
	public abstract void dob();
	public  abstract void email();
	public void address()
	{
		System.out.println("Gondia");
	}
	
}
