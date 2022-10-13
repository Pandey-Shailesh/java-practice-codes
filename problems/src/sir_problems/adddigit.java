package sir_problems;

public class adddigit {
	public static void main (String args[])
	{
		int num=932;   		
		int n=0;
		while(num>0)
		{
			int last=num%10;
			n=n+last;
			num=num/10;
		}
		System.out.println(n);
		
		
	}

}
