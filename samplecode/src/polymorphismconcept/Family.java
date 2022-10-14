package polymorphismconcept;

public class Family {
public static void main(String[] args) {
	

	Son s = new Son();
	s.home();
	s.laptop();
	s.moblie();
	s.money();
	
	Father f = new Father();
	f.home();
	f.money();
	f.moblie();
}
}
