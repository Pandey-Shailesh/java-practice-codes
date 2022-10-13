package problems;

public class FindLargestNumber_3Digits {
public static void main(String[]args) 
{
	
	
	int a;
	int b;
	int c;
	
	a=90;
	b=85;
	c=89;
	System.out.println("to find the largest number ( with 3 no.s)");
	
	if(a>b)
	{
		if (a>c)
		{
			System.out.println("a is greater number");
		}
		else
		{
			System.out.println("c is greater number");
		}
	}
	else
	{
		if(b>c)
		{
			System.out.println("b is greater number");
		}
		else
		{
			System.out.println("c is greater number");
		}
	}

}
}
