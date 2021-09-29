package charstringpossibleway;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class Charpossiblewaysexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //To find the duplicate character count in a string.
		//duplicatecharactercountinastring();
		//To find duplicate characters in a string.
		//duplicatecharacterinastring();
		//To find Non-duplicate character in a String.
		nonduplicate();
	}	
	
	public static void duplicatecharactercountinastring() {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	
	System.out.println(s);
	int count = 0;
	char c2='u';
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==c2) {
	count++;
		}}
	
	System.out.println(c2  + "and their count is:"    +count);
	
	}

public static void duplicatecharacterinastring() {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println(s);
	char[] ch=s.toCharArray();
	int count=1;
	for(int i=0;i<ch.length;i++) {
	for(int j=i+count;j<ch.length;j++) {
		if((ch[i]==ch[j])){
			System.out.println(" The repeated char in a string:" +ch[i]); 
		}
	}}}
	
	
	
	public  static void   nonduplicate() {
	String[] sar= {"m","o","u","l","k","o","u","s","h","i","k"};
	List<String> l=Arrays.asList(sar);
	l.add("m");
	System.out.println(l);
		

	
	}
	
}





























































