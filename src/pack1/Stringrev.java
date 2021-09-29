package pack1;

import java.util.Arrays;

public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="moulikoushik";
 System.out.println(s);
char c[]=s.toCharArray(); 
	System.out.println(c.length);	
	
	
		for( int j=0;j<c.length;j++) {
			System.out.println(c[j]);
		}
		
		System.out.println("......................");
		for( int i=c.length-1;i>=0;i--) {
		
			
				System.out.println(c[i]);
			}
		System.out.println("....string builder......");
		
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb);
		System.out.println(sb.reverse());

			if(sb==sb.reverse()) {
				System.out.println("Both length are Equal");
			
		}
		
		
		
	}}


