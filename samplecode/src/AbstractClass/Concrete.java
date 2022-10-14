package AbstractClass;

public class Concrete extends AbstractClass{

	public void name()
	{
		System.out.println("shailesh");
	}
	public void dob()
	{
		System.out.println("02-02-1998");
	}
	public void email()
	{
		System.out.println("shailesh02021998@gmail.com");
	}
	public static void main(String[] args) {
		
		Concrete c = new Concrete();
		c.address();//Abstract class
		c.email();//concrete class
		c.dob();//concrete class
		c.name();//concrete class
	}
}
