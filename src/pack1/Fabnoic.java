package pack1;

public class Fabnoic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=9;
		int a=1;
		int b=1,c;
		
		System.out.println(a);
		System.out.println(b);
		
		 for( int i=3;i<=n;i++) {
			  c=a+b; 
			 System.out.println(c);
			 a=b;
			 b=c;
			 
		 }
	}

}
