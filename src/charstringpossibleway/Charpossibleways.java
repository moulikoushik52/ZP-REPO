package charstringpossibleway;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;
import java.util.Scanner;

public class Charpossibleways {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	char ch='a';
	System.out.println(ch);
	char[] c= {'a','b','c','d','e'};
	System.out.println(c);
	Character c1=new Character('f');
	System.out.println(c1);
	System.out.println("Hiii i am Moulikoushik \"working\" as the Automation Enginer");
	
	
	char ch1='5';
	System.out.println(Character.isLetter(ch1)); //5 -false
	System.out.println(Character.isLetter(ch));  //a-true
	
	System.out.println(Character.isDigit(ch1));  //5 -true it is  digit
	System.out.println(Character.isDigit(ch));   //a not a digit.
	
	/*System.out.println(Character.isWhitespace('c'));
    System.out.println(Character.isWhitespace(' '));
    System.out.println(Character.isWhitespace('\n'));
    System.out.println(Character.isWhitespace('\t')); */
	
	System.out.println(Character.getNumericValue(ch1));
	System.out.println(Character.getNumericValue(c[3]));
	
	System.out.println(Character.toUpperCase(ch));
	System.out.println(Character.toLowerCase(c1));
	
	System.out.println(Character.isUpperCase('c'));
	System.out.println(Character.isLowerCase('c'));
	
	//To find the single character value in the String.
	
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader bfr=new BufferedReader(isr);
		int cr=bfr.readLine().charAt(2);
		System.out.println("The 5 th position value:"    +cr);
	
		//To find all charachter value in a String
		
		CharArrayReader car=new CharArrayReader(c);
		int k=0;
		while((k=car.read())!=-1) {
			char cr1=(char)k;
			System.out.println("The position in the character:"+k);
			
			//scanner class
			Scanner sc=new Scanner(System.in);
			int scchar=sc.next().charAt(5);
			System.out.println(scchar);
			
	
		}
		
	}}
