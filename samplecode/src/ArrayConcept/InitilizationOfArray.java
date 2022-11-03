package ArrayConcept;

public class InitilizationOfArray {
	
	/*
	 
	 Array is a data structure used to store the collection of information of same data 
	type 
	 Arrays are homogenous in nature (i.e., two different data types are not allowed in 
	single defined object) 
	 Array declaration is need to be done with capacity. (new String [5]) 
	 Arrays are not growable i.e., size is fixed
	 Array is an object
	 In the array object, indexing start from the Zero (0) 
	
		Types of Arrays 
			1. Single Dimensional Arrays - int [ ] ar =new int[5]; 
			2. Multidimensional Arrays  int [ ][ ] ar1 = new int[2][3]; ( Rows X Columns)
	 
	 */
	
	public static void main(String[] args) {
		
		
		//Integer Array
		
		//if we don't put any int value in the int array it return 0 at the console.
		int ar[] =new int [5]; //Declaration  
		ar[0]=5;
		ar[1]=6;					// Initillization
		ar[2]=1;
		
		//OR
		int []arr =new int[4];//Declaration  
		//Or
		int arra[]= {4,5,6,8,7};//Declaration and Initillization
		//OR
		int [] array = {1,2,3};//Declaration and Initillization
		
		
		//use of array    //Print array using for loop 

		
		for(int i=0;i<arra.length;i++)
		{
			System.out.println(arra[i]);
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+";");
		}
		System.out.println();
		String st[] =new String[5];
		st[2]="shailesh";
		//if we don't put any value in the string array it return null at the console .
		
		for(int j =0; j<st.length;j++)
		{
			System.out.println(st[j]);
		}
		//OR 
		String str[] = {"vinay","shailesh","abhi"};
		for(int s=0;s<str.length;s++)
		{
			System.out.println(str[s]);
		}
		
		//Print array in revese manner
		
		for(int i=array.length-1; i>=0; i--) 
		 { 
		 System.out.println(array[i]); 
		 }
		
	}

}
