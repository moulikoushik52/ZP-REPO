package pack1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapping {

	public static <K> void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1, "harisha");
hm.put(2, "koushik");
hm.put(3, "selenium");
hm.put(4, "manual");

System.out.println(hm);
System.out.println(hm.keySet());
Set s=hm.keySet();
Set e=hm.entrySet();

for(Map.Entry<Integer,String> m:hm.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
}
Iterator itr=e.iterator();
while(itr.hasNext()) {
Map.Entry m=(Map.Entry)itr.next();
System.out.println(m.getKey()+"  "+m.getValue());
}
}}