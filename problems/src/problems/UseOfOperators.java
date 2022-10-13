package problems;

public class UseOfOperators {
public static void main(String[]args) {
	
	
	int a;
	int b;
	a=10;
	b=3;
	
	//Arthimatic Operators
	System.out.println(" Following are the Arthimatic operators ");
	int sum =a+b;
	int subs=a-b;
	int multi=a*b;
	int div1=a/b;
	int div2=a%b;
	a++;
	a--;
	++a;
	--a;
	
	System.out.println(sum);
	System.out.println(subs);
    System.out.println(multi);
    System.out.println(div1);
    System.out.println(div2);
    System.out.println(a++);
    System.out.println(a--);
    System.out.println(++a);
    System.out.println(--a);
 
    //Relation Operators
    System.out.println(" Following are the Relation operators  ");
    int x;
    int y;
    
    x=8;
    y=4;
   
    System.out.println(x==y);
    System.out.println(x>=y);
    System.out.println(x<=y);
    System.out.println(x<y);
    System.out.println(x>y);
    System.out.println(x!=y);
    
    //Logical Operators
    System.out.println(" Following are the Logical operators  ");
    int p;
    int q;
    
    p=5;
    q=10;
    
    System.out.println((p==q)&&(p<q));
    System.out.println((p==q)||(p<q));
    System.out.println(!(p==q));
    
}
}
