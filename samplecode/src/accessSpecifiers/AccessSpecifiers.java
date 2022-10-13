package accessSpecifiers;

public class AccessSpecifiers extends AccessSpecifiers1{
	
	
	/*
	 Access specifiers are used to represent scope of members of class. 
	In java Access specifiers are classified into 4 types 
	1. private 
	2. default 
	3. protected 
	4. public
	 
	1. private: (within only class)
	 If you declare any member of class as private then scope of that member 
	remains only within the class. 
	 It can't be access from other classes. 
	
	2. default: (within package)
	 If you declare any member of class as default then scope of that member 
	remains only within the package 
	 It can't be access from other packages. 
	 There is no keyword to represent default access specifier. 
 
	3. protected: (Within package/ In other package but inheritance mandatory) 
	 If you declare any member of class as protected then scope of that member 
	remains only within the package 
	 That class which is present outside the package can access it by one 
	condition ie. inheritance operation 
 
	4. public: (within project) 
	If you declare any member of class as public then scope of that member remains 
	through the project. 
	
	
*Access Modifier                        Default       private      protected     public  
* Accessible inside the class            yes           yes            yes         yes
*Accessible outside the package           no   			no 			  no 		  yes 
*Accessible within the subclass     	 yes			no 			  yes 		  yes    
 inside the same package 	
* Accessible within the subclass          no            no			   yes         yes 
  outside the package 
 
 */
	public static void main(String[] args) {
		
		AccessSpecifiers s = new AccessSpecifiers();
		System.out.println(s.a);
		System.out.println(s.c);
		System.out.println(s.d);
		
		
		/*
		 Different types of JVM memories: 
			1. Heap area--> non-static method declaration. 
			2. Static pool area--> static method declaration. 
			3. method area --> static & non-static method definition. 
			4. stack --> main()--> method execution flow.
		 */
		
		
		
		
		
		
		
		
	}

}
