package inheritanceConcept;
public class code3 extends code2  {
	
	public void pen() {
		System.out.println("pen");
	}
	public void paper() {
		System.out.println("paper");
	}
	public static void main(String[] args) {
		
		//===========Multi level================
		
		/*
		 * Multilevel Inheritance takes place between 3 or more than 3 classes. 
		 * In Multilevel Inheritance 1 sub class acquires properties of another super 
			class & that class acquires properties of its another super class & 
			phenomenon continuous. 
		 * In the Multilevel inheritance, a derived class will inherit a base class and as 
			well as the derived class also act as the base class to other class
		 * 
		 * 
		 the we inherit the property of the supermost class (code1)
		 and the  super class (code2) in the sub class(code3) with help of extends keyword
		 
		 code1 property is inherit in code2 and code2 all property inherit in code3. 
		 */
		code3 c3 = new code3();
		c3.car();
		c3.house();
		c3.mobile();
		c3.money();
		c3.pen();
		c3.paper();
		
		//=========== heirarchichal ============
		/*
		 *When multiple sub classes can acquire properties of 1 super class is known as 
			hierarchical inheritance. 
			eg. parent property is aquired by there multiple childs.
			
		 */
		//=======================Multiple ================
		/*
		 *  If one sub class acquiring properties of two super class at the same time then it is 
			referred as Multiple Inheritance 
		 * Multiple Inheritance can be achieved by using interface. 
		 * Java doesn’t support Multiple inheritance using class because of “Diamond 
			Ambiguity” problem.
		 */
	}

}
