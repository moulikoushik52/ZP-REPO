package charstringpossibleway;

import java.util.Collections;

public class StringBuffer1 {

	public static void main(String[] args) {

		// Now it can be understood by the diagram given below. Here String is not changed 
		//but a new object is created with Stringimmutable. That is why string is known as immutable.



String s="string";   //string
s.concat("immutable");  //stringimmutable
System.out.println(s);
String e="String";
System.out.println(s.equalsIgnoreCase(e));     //equals(string) method


StringBuffer sbuffer=new StringBuffer("String");
sbuffer.append("buffersunchronized");
System.out.println(sbuffer); //synchronized
StringBuffer sbuffer1=new StringBuffer("String");
System.out.println(sbuffer.equals(sbuffer1));       //equals(object) method



StringBuffer sbuild=new StringBuffer("string");
sbuild.append("builderNotsynchronized");
System.out.println(sbuild); //Non-Synchronized
StringBuffer sbuild1=new StringBuffer("string");   
System.out.println(sbuild.equals(sbuild1));   //equals(object) method


String str=new String("mouli");
str.concat("koushik");
str.concat("varma");
System.out.println(str);


StringBuffer sbfr=new StringBuffer("mouli");
System.out.println(sbfr);
sbfr.append("koushik");
sbfr.append("varma");
System.out.println(sbfr);
System.out.println(sbfr.reverse());
System.out.println(sbfr.charAt(3));
System.out.println(sbfr.capacity());
System.out.println(sbfr.length());
System.out.println(sbfr.replace(2, 5, "f"));
System.out.println(sbfr.deleteCharAt(3));
System.out.println(sbfr.append("u").charAt(3));
System.out.println(sbfr.insert(3,'r'));
System.out.println(sbfr.substring(3));
System.out.println(sbfr.substring(2, 5));

























}
}
