
public class Customer {

	private String name;
	private double cash;
	
	public Customer(String name, double cash) {
		
		this.name = name;
		this.cash = cash;
	}
	
	public double getCash() {
		
		return this.cash;
	}
	
	public void updateCash(double amount) {
		
		this.cash += amount;
	}
	
	public boolean payment(double expense) {
		
		boolean result = false;
		
		if (this.cash - expense >=0 ) {
			
			this.cash -= expense;
			result = true;
		}
		
		return result;
	}
}
