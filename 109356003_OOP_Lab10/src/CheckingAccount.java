
public class CheckingAccount extends BankAccount{

	private int transCount;
	
	public CheckingAccount(int amount, int ID) {

		super.setBalance(amount);
		super.setID(ID);
	}
	
	public void deposit(double amount) {
		
		transCount++;
		super.deposit(amount);
	}
	
	public void withdraw(double amount) {
		
		transCount++;
		super.withdraw(amount);
	}
	
	public void monthEnd() {
		double commissionFee = 5;
		
		if (transCount>3) {
			super.setBalance(super.getBalance()-(transCount-3)*commissionFee);
		}
		transCount=0;
	}
	
}
