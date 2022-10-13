package problems;

public class FindLargestNumber_5Digits {
	public static void main(String args[]) 
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		
		a=81;
		b=82;
		c=83;
		d=84;
		e=85;
		
		System.out.println("to find the largest number ( with 5 no.s)");
		
		if(a>b)
		{
			if(a>c) 
			{
				if(a>d)
				{
					if(a>e)
					{
						System.out.println("a is greater number");
					}
					else
					{
						System.out.println("e is greater number");
					}
				}
				else
				{
					if (d>e)
					{
					System.out.println("d is greater number");
					}
					else
					{
						System.out.println("e is greater number");
					}
				}
			}
			else 
			{
				if(c>d)
				{
					if(c>e)
					{
						System.out.println("c is greater number");
					}
					else
					{
						System.out.println("e is greater number");
					}
				}
				else
				{
					if(d>e)
					{
						System.out.println("d is greater number");
					}
					else
					{
						System.out.println("e is greater number");
					}
				}
				
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					if(b>e)
					{
						System.out.println("b is greater number");
					}
					else
					{
						System.out.println("e is greater number");
					}
				}
				else 
				{
					if(d>e)
					{
						System.out.println("d is greater number");	
					}
					else
					{
						System.out.println("e is greater number");	
					}
				}
			}
			else
				if(c>d)
					{
					if(c>e)
						{
						System.out.println("c is greater number");
						}
					else
						{
						System.out.println("e is greater number");	
						}
					}																		
				else 
				{
					if(d>e)
					{
						System.out.println("d is greater number");
					}
					else
					{
						System.out.println("e is greater number");	
					}
			}
		}
		
	}

}
