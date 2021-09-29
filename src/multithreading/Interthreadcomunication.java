package multithreading;

 class Bank {
	int amount=10000;
	
	public synchronized void withdraw(int money) {
		System.out.println("Amount in account");
		
		if(this.amount==money) {
			System.out.println(" Amount can be withdrawn");
	                          }
		
		else if(this.amount>money) {
			System.out.println("amount can be withdrawn");
		                           }
		 
		else if(this.amount<money){
			System.out.println("Amount is less ");
			try                 {
				wait();
			                    }
			catch(InterruptedException e) {
				System.out.println(e);
			                              }
			
		                          }
		
			this.amount=this.amount-money;
			System.out.println("your balance withdrawn amount:"+this.amount);
	                              }
	
	public synchronized void deposit(int money) {
		System.out.println("Amount in deposit");
		this.amount=this.amount+money;
		System.out.println("your balance added amount"+this.amount);
	notify();                                           
	}
    }
public class Interthreadcomunication{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final Bank b=new Bank();	
   new Thread() {
	public void run() {
		b.withdraw(2000);
		b.deposit(4000);
	}
	}.start();
	
	
	
	}}


	
	


