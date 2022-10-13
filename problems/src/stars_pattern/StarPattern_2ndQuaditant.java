package stars_pattern;

public class StarPattern_2ndQuaditant {
	public static void main(String args [])
	{
	
	
	int s=15;
	
	for(int a=1;a<=s;a++) 
	{
		for(int b=(s-1);b>=a;b--)	
		{
			System.out.print(" ");
		}
		for(int c=1;c<=a;c++)
		{
			System.out.print("*");
		}
			System.out.println();
	}
	}
}
