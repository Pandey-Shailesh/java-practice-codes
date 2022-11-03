package ArrayConcept;

public class PrintArrayInReverseOrder {
public static void main(String[] args) {
	
	int array[]= {25,35,21,54,68,24,20};
	int index = array.length-1;
	
		for(int j=0;j<index/2;j++)
		{
			int c = array[j];
			array[j]=array[index-j];
			array[index-j]=c;
		}
		//System.out.println(array[1]);
		for(int i=0;i<=index;i++)
		{
			System.out.println(array[i]);	
		
		}

}
}
