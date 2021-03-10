
public class Employee {
	
	private int ID, baseSalary, totalSalary, sales;
	private String name, department;
	private BankAccount account;
	
	public Employee(int ID, String name, BankAccount account, String department, int baseSalary, int sales) {
		this.ID = ID;
		this.name = name;
		this.account = account;
		this.department = department;
		this.baseSalary = baseSalary;
		this.sales = sales;
		this.totalSalary = 0;
	}
	
	public void setSales(int sales) {
		
		this.sales = sales;
	}
	
	public String getDepartment() {
		
		return this.department;
	}
	
	public int getSales() {
		return this.sales;
	}
	
	public int getTotalSalary() {
		return this.totalSalary;
	}
	
	public void monthEnd() {
		double taxRate = (double)3/100;
		int salesBonus = 500;
		this.totalSalary = (int)Math.round((this.baseSalary+(salesBonus*this.sales))*(1-taxRate));
		this.account.deposit(this.totalSalary);
	}
	
	public String getInfo() {
		return String.format("ID:%d\nName:%s\nDepartment:%s\nTotal sales:%d\nTotal salary:%d\n", 
								this.ID, this.name, this.department, this.sales,this.totalSalary);
	}
}
