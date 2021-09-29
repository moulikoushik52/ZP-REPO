package multithreading;

import java.util.Scanner;

public class Part2 implements  Runnable {
static String name;
Part2(String name){
	this.name=name;
}

	public void run() {
	for( int i=0;i<=5;i++) {
		try {
		Thread.sleep(100);
	}
		catch(InterruptedException e) { 
			System.out.println(e);}
		System.out.println( "Thread " + i + "  "+ name);
		
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.hasNext();
		String s=sc.next();
Part2 p=new Part2(s);
Thread t1=new Thread(p);
Part2 p1=new Part2(s);
Thread t2=new Thread(p1);
t1.start();
try {
	t1.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
t2.start();
try {
t2.join();
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
for( int i=0;i<=5;i++) {
	System.out.println(i +" main method : "+name);
}

	}

}
