package multithreading;

import java.util.Scanner;

public class Part3 implements Runnable {
	  int count;
	
	public  synchronized void run() {
		for( int i=1;i<=100;i++) {
	 count++;
		}}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
  Part3 p= new Part3();
  Thread t1=new Thread(p);
  Thread t2=new Thread(p);
 Thread t3=new Thread(p);
 

  t1.start();
  System.out.println(t1.isAlive());
  t2.start();
  System.out.println(t1.getPriority());
  t3.start();
  System.out.println(t1.getName());
  t1.setName("mouli");
  System.out.println(t1.getName());

  try {
	t1.join();
	t2.join();
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  System.out.println(p.count);
 
 
  
	}

}
