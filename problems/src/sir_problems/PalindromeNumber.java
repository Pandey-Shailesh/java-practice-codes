package sir_problems;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		int n=1321;
		int l;
		l=n;
		int m=0;
		
		while(n>0)
		{
			int last=n%10;
			m=((m*10)+last);
			n=n/10;
		}
		if(l==m)
		{
			System.out.println("it is palindrome");
		}
		else 
		{
			System.out.println("not palindrome");
		}
		
	}

}
