package ArrayConcept;

public class MultidimensionalArrays {
	public static void main(String[] args) {
		
		//   0  1  2 
		 //0 10 20 30 
		 //1 40 50 60
		
		int [][] ar=new int[2][3]; //(Row*Column)
		 ar[0][0]=10; 
		 ar[0][1]=20; 
		 ar[0][2]=30; 
		 ar[1][0]=40; 
		 ar[1][1]=50; 
		 ar[1][2]=60;
		
		 
		 int s= ar.length;//length
		System.out.println(s);
		System.out.println(ar[1][1]);
		
		System.out.println("-----print array--------"); 
		 
		//outer for loop for rows 
		// //2<=1 2
		 for(int i=0; i<=1; i++) 
		 { 
		 //inner for loop for columns
		 //3<=2 3
		 for(int j=0; j<=2; j++) 
		 { // 1 2
		 System.out.print(ar[i][j]+" "); 
		 } 
		 System.out.println(); 
		 }
		
		
	}

}
