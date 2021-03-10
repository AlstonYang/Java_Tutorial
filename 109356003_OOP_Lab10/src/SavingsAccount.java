
public class SavingsAccount extends BankAccount{

	private double interestRate;
	
	public SavingsAccount(int amount, int ID, double interestRate) { 
		
		super.setBalance(amount);
		super.setID(ID);
		this.interestRate = interestRate;
	}
	
	public void setInterestRate(double rate) {
		
		interestRate = rate;
	} 
	
	
	public void monthEnd() {
		
		this.deposit(this.getBalance() * (interestRate/100));
	}
}
