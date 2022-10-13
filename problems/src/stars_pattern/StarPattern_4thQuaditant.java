package stars_pattern;

public class StarPattern_4thQuaditant {
	public static void main (String arg[]) 
	{
		 System.out.println("4th Quaditant Right Triangle");
		 System.out.println();
	 for(int a=0;a<10;a++)
	 {
		 for(int b=a;b<10;b++)
		 {
			 System.out.print("*");
		 }
		 System.out.println(" ");
	 }
	 
	 
	 System.out.println();
	 
	 
	 
	 for(int a=10;a>0;a--) 
	 {
	 	for(int b=0;b<a;b++)
	 	{
	 		System.out.print("*");
	 	}
	 	System.out.println();

	 }
	}
}
