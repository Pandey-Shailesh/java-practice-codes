package ArrayConcept;

import java.util.Arrays;

public class StringArray_Sorting {
public static void main(String[] args) {
	
	String [] ar1=new String[4]; 
	 ar1[0]="mahesh"; //Length =4
	 ar1[1]="ramesh";   //Index =(Length -1)
	 ar1[2]="suresh";   //because indexxing start from zero (0)
	 ar1[3]="ganesh";   //i.e. if length is 4 then index is 3
	 
	 System.out.println("----print original data------"); 
	 for(int i=0; i<=ar1.length-1; i++) 
	 { 
	 System.out.println(ar1[i]); 
	 }
	 System.out.println("----print string info in alphabetical order------");
	 
	 Arrays.sort(ar1);
	 for(int i=0; i<=ar1.length-1; i++) 
	 { 
	 System.out.println(ar1[i]); 
	 }
	 //Note
	 /*
	  1.Note that if your are using Arrays.short() the null value is not acceptable 
	  while sorting .
	  2. Length = Total number of character/string/ int value present.
	  3.Index = Position of String /int/character
	  4.Indexing start from 0    (not 1)
	  
	  
	  */
}
}
