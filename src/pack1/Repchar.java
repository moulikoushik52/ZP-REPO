package pack1;

public class Repchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="moulikoushik";
char[] c=s.toCharArray();
int count=0;
	for(char ch:c) {
		System.out.println(ch);
		if(ch=='k') {
			count++;
		}
		System.out.println(count);
	}
	}

}
