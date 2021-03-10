
public class BankAccount {

	private int accountID;
	private double balance, interestRate;
	
	public BankAccount(int accountID) {
		
		this.accountID = accountID;
		this.balance = 0;
		this.interestRate = 0.001;
	}
	
	public int getAccountID() {
		
		return this.accountID;
	}
	
	public double getBalance() {
		
		return this.balance;
	}
	
	public String deposit(double amount) {
		
		this.balance += amount;
		return String.format("The total balance: %.2f", this.balance);
	} 
	
	public String withdraw(double amount) {
		
		if(this.balance - amount >=0) {
			this.balance -= amount;
			return String.format("The total balance: %.2f", this.balance);
		}else {
			return "Transaction failed.";
		}
	}
	
	public void setInterestRate(double interestRate) {
		
		this.interestRate = interestRate;
	}
	
	
	public void interestPay() {
		
		this.balance *= (1+this.interestRate);
	}
	
	public void yearEnd() {
		
		this.interestPay();
	}
	
	public String getInfo() {
		
		return String.format("Account ID: %d\nBalance: %.2f\n", this.accountID, this.balance);
	}
	
}
