package sir_problems;

public class factorial {
	
	static int factorial(int n)
	{
	    if (n <= 1)
	    {
	        return 1;
	    }
	    return n * factorial(n - 1);
	}
   public static void main(String[] args) {

	   int m=4;
	   System.out.println("The factorial of "+m +" is"+factorial(m));

}
}
