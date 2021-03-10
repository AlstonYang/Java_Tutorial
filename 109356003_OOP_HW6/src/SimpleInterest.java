
public class SimpleInterest extends DepositInsurance{

	private double interestRate;
	
	public SimpleInterest(BankAccount account, double annuity, double interestRate, int experiment) {
		
		super(account, annuity, experiment);
		this.interestRate = interestRate;
	}
	
	
	public void interestPay() {
		
		this.updateTotalValue(this.getAnnuity()*this.interestRate);
	}
	
	public void addPremium(double amount) {
		
		this.updateAnnuity(amount);
	}
	
	public void yearEnd() {
		
		if (this.getCurrentYear() < this.getExperiment()) {
		
			if(this.getAccount().withdraw(this.getAnnuity()).equals("Transaction failed.")) {
				
				System.out.println("Deduction is not successful.");
				this.redemption(0.7);
			
			}else {
			
				this.updateTotalValue(this.getAnnuity());
				this.interestPay();
				this.updateCurrentYear();
			}
			
		}else {
			
			this.redemption();
			
		}
	}
	
}
