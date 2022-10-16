package Generalization;

public class Stud3 implements StudentsClass {

	public void studName()
	{
		System.out.println("Vinay");
	}
	public void id()
	{
		System.out.println("12345");
	}
	public void branch()
	{
		System.out.println("chemical");
	}
	
	public static void main(String[] args) {
		
		Stud1 s = new Stud1();
		s.studName();
		s.id();
		s.branch();
		
		Stud2 t = new Stud2();
		t.studName();
		t.id();
		t.branch();
		
		Stud3 u = new Stud3();
		u.studName();
		u.id();
		u.branch();
		
		
		
	}
}
