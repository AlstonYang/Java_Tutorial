import java.util.ArrayList;

public class CompoundInterest extends DepositInsurance{

	private ArrayList<Double> interestRate;

	
	public CompoundInterest(BankAccount account, double annuity, int experiment) {
		
		super(account, annuity, experiment);
		interestRate= new ArrayList<Double>();
	}

	public void setInterestRate(double rate) {
		
		this.interestRate.add(rate);
	}
	
	public void interestPay() {
		
		this.updateTotalValue(this.getAnnuity() * this.interestRate.get(this.getCurrentYear()));
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
