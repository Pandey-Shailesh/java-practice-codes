package sir_problems;

public class fabonaci {
	static int fibonaci(int b)
	{
	    if (b < 2)
	    {
	        return 1;
	    }
	    return fibonaci(b - 2) + fibonaci(b - 1);
	}
	
	public static void main(String[] args) {
		
		int n=15;
		for(int i=0;i<n;i++) {
		System.out.println(fibonaci(i)+" "); 
		}
		
	}

}
