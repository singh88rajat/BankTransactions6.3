package assign3session6;

public class Transaction extends Thread {
	
	private Bank bank;

	public Transaction(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		bank.deposit(500);
		bank.withdraw(200);
	}

}
