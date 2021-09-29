package charstringpossibleway;

import java.io.UnsupportedEncodingException;

public class Stringpossibleways2 {

public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
String s=" m o u l i 123 ";
System.out.println(s);
System.out.println(s.toCharArray());
System.out.println(s.trim());
System.out.println(s.replaceAll("\\s", ""));
System.out.println(s.replaceFirst("\\s", ""));
System.out.println(s.replace('o', '@'));
int l=s.length();
System.out.println(l);
System.out.println(s.charAt(l-2));
System.out.println(s.charAt(2));
System.out.println(s.concat("k"));
System.out.println(s.endsWith("23 "));
System.out.println(s.startsWith(" m"));
System.out.println(s.substring(3));
System.out.println(s.substring(2,5));
System.out.println(s.contentEquals("l i"));
System.out.println(s.indexOf(3));
int k=98;
//String s1=String.valueOf(k);
String s1=String.valueOf(k);
System.out.println(s1);
String s2="mouli";
String s3="koushikvarma";
String s4="mouli";
System.out.println(s2.concat(s3));
System.out.println(s2.concat(s4));
System.out.println(s2.equals(s3));
System.out.println(s2.equals(s4));
System.out.println(s1.getBytes());;
String s5="ABCDEFG";  
byte[] barr=s5.getBytes();  
for(int i=0;i<barr.length;i++){  
System.out.println("The getBytes method :" +barr[i]);  
}  

char ch[]=new char[10];
s2.getChars(1, 4, ch, 0);
System.out.println(ch);

int index= s3.indexOf("kv");
System.out.println("To find the index position of the String:"+index);


String s6=s3.intern();
System.out.println(s6);
String s7=new String("koushikvarma");
System.out.println(s3==s6);
System.out.println(s6==s7);

String intvalue=String.format("%d", 111);
String  stringvalue=String.format("%s", "MICKY");
String charvalue=String.format("%c",'m');
System.out.println(intvalue+" "+stringvalue+" "+charvalue);

String intvalue1=String.format("|%100d|", 111);
String intvalue2=String.format("|%-100d|", 111);
String intvalue3=String.format("|%010d|", 111);
System.out.println(intvalue1+" "+intvalue2+" "+intvalue3);

}
}

