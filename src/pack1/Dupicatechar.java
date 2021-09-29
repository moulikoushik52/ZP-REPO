package pack1;

import java.util.HashSet;

public class Dupicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="harisha";
	System.out.println(deleteduplicate(s));
	}
	/*char d[]=s.toCharArray();
	int count ;
	for( int i=0;i<d.length;i++) {
		count=1;
		for(int j=i+count;j<d.length;j++) {
			if(d[i]==d[j]&&d[i]!=' ') {
				count++;
				d[j]=0;
			}
		}
		
	if(count>1&&d[i]!=0) {
			System.out.print(d[i]);
		}
	}
	*/
	public  static String deleteduplicate(String s) {
		
		HashSet<Character> set=new HashSet<Character>();
		StringBuffer sb =new StringBuffer();
		for( int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!set.contains(sb)) {
				set.add(ch);
				sb.append(ch);
			
			}
		}
		return sb.toString();
	}
}
	

