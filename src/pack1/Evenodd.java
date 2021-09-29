package pack1;

import java.util.ArrayList;
import java.util.List;

public class Evenodd {
public static  void main(String[]args) {
	List <Integer> l=new ArrayList();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(5);
	l.add(6);
	l.add(7);
	l.add(8);
	System.out.println(l);
	
	// TODO Auto-generated method stub
		
			for (int i : l) {
				
				if(i%2==0) {
					System.out.println( "The Even numbers are:" +i);	
				}
				if(i%2!=0) {
					System.out.println("The odd Numbers are :"+i);	
				}
			}
		
}}