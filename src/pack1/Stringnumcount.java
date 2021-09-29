package pack1;

import java.util.Scanner;

public class Stringnumcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Character ch='5';
Character ch1='*';
Boolean b1,b2,b3,b4;
char c5;
b1=ch.isLetter(ch);
b2=ch1.isLetter(ch1);
b3=Character.isDigit(ch);
b4=Character.isDigit(ch1);

c5=Character.toLowerCase('E');
	System.out.println(c5);
c5=Character.toUpperCase('k');
System.out.println(c5);

System.out.println(b1);
System.out.println(b2);
System.out.println(b3);
System.out.println(b4);

Scanner sc=new Scanner(System.in);
Character ch5=sc.next().charAt(0);
if(Character.isLowerCase(ch5)) {
	Character.toUpperCase(ch5);
	System.out.println(ch5);
}
else if  (Character.isUpperCase(ch5)){
	Character.toLowerCase(ch5);
	System.out.println(ch5);
}


	}}


