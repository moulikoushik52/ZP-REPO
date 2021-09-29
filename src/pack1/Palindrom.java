package pack1;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="abcdcba";

for( int i=0;i<s.length();i++) {
	
	for(int j=s.length()-1;j>0 ;j--) {
		
		if(s.charAt(i)==s.charAt(j)) {
			System.out.println("It is a palindrome");
			System.exit(0);
		}
	System.out.println("Not a palindrome");	
	}
}
	

}}
