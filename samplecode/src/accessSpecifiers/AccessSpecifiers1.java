package accessSpecifiers;

public class AccessSpecifiers1 {
	
    public int a =15;
    private int b=42;
    protected int c=85;
    int d=840; //this is the default Access Specifiers.
    
    public static void main(String[] args) {
		
    	AccessSpecifiers1 s = new AccessSpecifiers1(); 
    	System.out.println(s.a);
    	System.out.println(s.b);
    	System.out.println(s.c);
    	System.out.println(s.d);
    	
	}
}
