package assign3session6;

public class Bank {
	
	int balance;

	public Bank(int balance) {
		this.balance = balance;
	}

	public synchronized void deposit(int amount) {
		int temp = this.balance;
		temp = temp + amount;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = temp;
		System.out.println("Your current balance after deposit "+amount+" is : " + balance);
	}
	//synchronized method to synchronize the transactions
	public synchronized void withdraw(int amount) {
		//temporary variable to store balance.
		int temp = this.balance;
		temp = this.balance - amount;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = temp;
		System.out.println("Your current balance after withdraw "+amount+" is : " + balance);
	}

}
