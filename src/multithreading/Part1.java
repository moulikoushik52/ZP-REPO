package multithreading;

public class Part1 extends Thread{
	public void run() {
		System.out.println("The run method is called by JVM");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Part1 p=new Part1();
Thread t=new Thread(p);
t.run();
	}

}
