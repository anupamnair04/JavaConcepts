//Package Definition
package seed.thread;
//Driver Code
public class Transaction extends Thread{
	
	Account account;
	String name;
	
	Transaction(Account account, String name){
		super(name);
		this.account=account;
	}
	public void run(){
		int i = 0;
		while(i<10){
			try{
				if(Thread.currentThread().getName().equals("One")){
					synchronized(account){
						withdraw(1000);
					}Thread.sleep(3000);
				}if(Thread.currentThread().getName().equals("Two")){
					synchronized(account){
						deposit(2000);
					}Thread.sleep(1000);
				}
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}i++;
		}
	}

	private void withdraw(int amount) {
		
		int balamt = account.getBalance();
		System.out.println("Withdraw:"+amount);
		int bal = balamt - amount;
		account.setBalance(bal);
		balamt = account.getBalance();
		System.out.println("\t"+balamt);
		System.out.println();
		
	}
	private void deposit(int amount) {
		
		int balamt = account.getBalance();
		System.out.println("Deposit:\t\t\t"+amount);
		int bal = balamt + amount;
		account.setBalance(bal);
		balamt = account.getBalance();
		System.out.println("\t"+balamt);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello User");
		int initial=10000;
		System.out.println("Balance:"+initial);
		Account account = new Account(initial);
		Thread t1 = new Transaction(account,"One");
		Thread t2 = new Transaction(account,"Two");
		t1.start();
		t2.start();

	}
}