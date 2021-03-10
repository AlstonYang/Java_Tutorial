
public class Manager extends Employee {

	public double bonusRate;
	
	public Manager(String name, String title, double dailyWage, double bonusRate) {
		
		super(name, title, dailyWage);
		this.bonusRate = bonusRate;
	}
	
	public double payment() {
		
		return super.payment()*this.bonusRate;
	}
	
}
