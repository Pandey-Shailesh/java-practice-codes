package InterfaceConcept;

public class TestDemo2Class implements TestDemo1{
	
	public void name()
	{
		System.out.print("Shailesh ");
	}
	public void email()
	{
		System.out.println("shailesh02021998@gmail.com");
	}
	public void address()
	{
		System.out.println("Gondia");
	}
	public void surname()
	{
		System.out.println("Pandey");
	}
	
	public static void main(String[] args) {
		
		TestDemo2Class t = new TestDemo2Class();
		t.address();
		t.email();
		t.name();
		t.surname();
		
		
		
		
	}

}
