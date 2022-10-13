package problems;

public class MarksObtained {

	public static void main(String[]args)
	{
		
		int marks =84;
		
		if (marks<50) 
		{
			System.out.println("fail");
		}
		else 
	{
		if((marks==50)&&(marks<60))
		    {
		        System.out.println("D grade");	//if condition is true then and then only the if statement  code is print 
		    }
		else 
		{
		if((marks>=60)&&(marks<75))     //if condition is false then and then only the  else statement  code is print 
			{
				System.out.println("C grade");
			}
		else
		{
		if((marks>=75)&&(marks<85))
			{
				System.out.println("B grade");
			}
		else
			{
				System.out.println("A grade");
			}
		}
		}	
	}	
	}	
	
}
