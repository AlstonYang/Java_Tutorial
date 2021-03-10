public class DepositInsurance {

	private BankAccount account;
	private double totalValue, annuity;
	private int experiment;
	private int currentYear;
	
	public DepositInsurance(BankAccount account, double annuity, int experiment) {
		
		this.account = account;
		this.annuity = annuity;
		this.experiment = experiment;
		this.currentYear = 0;
		this.totalValue =0;
	}
	
	
	public int getExperiment() {
		
		return this.experiment;
	}
	
	public int getCurrentYear() {
		
		return this.currentYear;
	}
	
	public BankAccount getAccount() {
		
		return this.account;
	}
	
	public double getTotalValue() {
		
		return this.totalValue;
	}
	
	public double getAnnuity() {
		
		return this.annuity;
	}
	
	public int updateCurrentYear() {
		
		return this.currentYear +=1;
	}
	
	public void updateAnnuity(double amount) {
		
		this.annuity += amount;
	}
	
	public void updateTotalValue(double amount) {
		
		this.totalValue += amount;
	}
	
	public void redemption() {
		
		this.getAccount().deposit(this.getTotalValue());
	}
	
	public void redemption(double redemptionRate) {
		
		this.getAccount().deposit(this.getTotalValue()*redemptionRate);
	}
	
	public void yearEnd() {}
	
	public String getInfo() {
		
		return String.format("Designated Bank Accounts:%d\nCurrent total value:%.2f\nElapsed Years:%d\n", 
								this.account.getAccountID(), this.totalValue, this.currentYear);
	}
	
}
