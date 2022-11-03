package ArrayConcept;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		System.out.println("-----print info in ascending order----");
		int array[]= {1,5,8,6,9,7,4,3,2,0};
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("-----print info in decreasing order----");
		for(int j=array.length-1; j>=0 ;j-- )
		{
			System.out.println(array[j]);
		}
	}

}
