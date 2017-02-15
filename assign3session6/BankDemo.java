package assign3session6;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank(2000);

		Transaction t1 = new Transaction(b);
		Transaction t2 = new Transaction(b);
		t1.start();
		t2.start();

	}

}
