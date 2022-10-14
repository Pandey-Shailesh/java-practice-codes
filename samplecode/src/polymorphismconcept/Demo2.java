package polymorphismconcept;

public class Demo2 {

	//(//Method Overloading) (Compiletime Polymorphism)
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.addition(12, 660);
		d.addition(412,525,8452);
		
		
		d.name("India", 91);
		d.name("Gondia","India");
	}
}
