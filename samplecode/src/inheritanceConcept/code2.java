package inheritanceConcept;

public class code2 extends code1 {
	
 public void mobile() {
	 System.out.println("moblie");
 } 
 public static void main(String[] args) {
	// without using the inheritance we use the method of code1 in the code2 .
	//for calling the method of code1, we create the object of code1.
	code1 c1 = new code1();
	c1.car();
	c1.house();
	c1.money();
	/*
	 * It is an operation where inheritance takes place between 2 classes. 
	 * To perform single-level inheritance only 2 classes are mandatory.
	 * If only one base class is used to derive only one subclass, then it is referred as 
		single-level inheritance or if only one sub class acquires property of one 
		superclass, then it is refereed as single level inheritance.
	 * 
	 * 
	 * 1->but by using the property of inheritance we only create the object of sub class 
	 	and call the all the methods of super class.
	 2-> Inheritance:-> it is one of the OOPs concept where the property of one class(super class/parent class/base class)
	 	is aquired by another class (sub class/ child class)by using extends keyword this phenomenon is called as Inhertance.
	 3->there are 4 types of inheritance .
	 a. single level 
	 b. multi level
	 c.multiple 
	 d. heirachical 
	 4-> It is use for code Reusability purpose 
	 
	 */
	//======= Single level======================
	code2 c2 = new code2();
	c2.mobile();
	c2.house();
	c2.money();
	c2.car();

}
}
