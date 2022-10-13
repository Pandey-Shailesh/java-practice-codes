package stars_pattern;

public class LowerPyramid {

 public static void main(String args[]) {
	 int s=12;
 for(int a=s;a>=0;a--) 
	{
		for(int b=(s-1);b>=a;b--)	
		{
			System.out.print(" ");
		}
		for(int c=1;c<=a;c++)
		{
			System.out.print("*");
		}
		for(int c=2;c<=a;c++)
		{
			System.out.print("*");
		}
			System.out.println();
	}

 }
}
