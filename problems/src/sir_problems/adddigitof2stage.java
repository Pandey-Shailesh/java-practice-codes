package sir_problems;

public class adddigitof2stage {
	public static void main (String args[])
	{
	 int num=196;
		
		
		while(num>=10)
		{
			int n=0;
			while(num>0)
			{
				int last=num%10;
				n=n+last;
				num=num/10;
			}
			num=n;
		}
		
		
		System.out.println(num);

	}
}
