package multithreading;

import javax.swing.plaf.basic.BasicTableHeaderUI;

public class Part4 implements Runnable{
	public void run() {
		System.out.println("run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Part4 p=new Part4();
		Thread t1=new Thread(p);

		t1.setDaemon(true);
		t1.start();
		System.out.println(t1.isDaemon());
	
		System.out.println(Thread.currentThread().isDaemon());//To set main Thread is Demean thread.

	}

}
