package problems;

public class FindLargestNumber_4Digits {
	public static void main(String[]args)
	{
		int a;
		int b;
		int c;
		int d;
		
		a=81;
		b=82;
		c=83;
		d=84;
		
		System.out.println("to find the largest number ( with 4 no.s)");
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("a is greater ");
				}
				else
				{
					System.out.println("d is greater ");
				}	
			}
			else
			{
				System.out.println("c is greater ");
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d) 
				{
					System.out.println("b is greater");
				}
				else
				{
					System.out.println("d is greater");
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println(" c is greater ");
				}
				else
				{
					System.out.println(" d is greater ");
				}
			}
		}
	}
}
