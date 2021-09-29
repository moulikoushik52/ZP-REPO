package charstringpossibleway;

public class Stringpossibleways1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="mouli123";
String s2="m o u li 1 2 3  ";
String s3="moulikoushik";
String s4="MOULI123";
String s6="987654";
int n=456;
String s5=String.valueOf(n);
System.out.println(s3);
int l=s3.length();
	System.out.println(l);
	System.out.println(s3.charAt(l-1));
	System.out.println(s3.charAt(l-2));
	//System.out.println(s3.charAt(l));        //fails because starts with 0 to n-1;
	System.out.println(s3.indexOf('k'));       // It shows the k where first index is availble=5
	System.out.println(s3.lastIndexOf('k'));   //It shows the k where last  index is availble=11 where -1 indicates not available.
	System.out.println(s3.substring(3));       //likoushik
	System.out.println(s3.substring(3,8))   ;   //likou  8 value not include 3,4,5,6,7
	System.out.println(s1.equalsIgnoreCase(s3));  //false boolean value
	System.out.println(s1.equalsIgnoreCase(s4));  //true both are equal
    int x=s1.compareToIgnoreCase(s4);  
	System.out.println(x);
System.out.println(s1.trim());
String m=s4+s5; 
	System.out.println(m);            //mouli123456
	Integer in=Integer.parseInt(s6);
	System.out.println("The string s6 is :" +in);

	 String str = s2.replaceAll("\\s", "");
	String k= s2.replaceFirst("\\s", "");
	s2.replace("//s","*");  //replace the charcater
    
    System.out.println("To delete all  white spaces in a String:"+ str);
	System.out.println(k);
	}

}
