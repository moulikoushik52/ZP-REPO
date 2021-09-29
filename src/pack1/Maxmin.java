package pack1;

public class Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {11,2,3,4,5,66,7,8};

int max=a[0];
int min=a[0];

for( int i=0;i<a.length;i++) {
	if(a[i]>max) {
		max=a[i];

System.out.println("max value :=" +max);
	}
if(a[i]<min) {
	min=a[i];
	System.out.println("min value :="+min);
}
}
	
}}

	