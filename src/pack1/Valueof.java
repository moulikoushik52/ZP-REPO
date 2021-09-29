package pack1;

public class Valueof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="harisha";
		m1(s1);
		
	}
	public static void m1(String s1) {
		String st=new String();
		int length=st.length();
		for(int i=0;i<length;i++) {
			char ch=st.charAt(i);
			if(st.indexOf(ch)<0) {
				st+=ch;
				
				
			}
		}
		System.out.println(st);
	}



}
