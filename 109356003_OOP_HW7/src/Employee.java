
public class Employee {

	private String name;
	private String title;
	private double dailyWage;
	private double workDay;
	private int overtimeCount;
	private double overtime;
	
	public Employee(String name, String title, double dailyWage) {
		
		this.name = name;
		this.title = title;
		this.dailyWage = dailyWage;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public String getTitle() {
		
		return this.title;
	}
	
	public double getWorkDay() {
		
		return this.workDay;
	}
	
	public int getOvertimeCount() {
		
		return this.overtimeCount;
	}
	
	public double getOverTime() {
		
		return this.overtime;
	}
	
	public double payment() {
		
		return this.dailyWage * this.workDay + this.overtime * 150;
	}
	
	public void addWorkDays(double day) {
		
		this.workDay += day;
	}
	
	public void overtimeWork(double hour) {
		
		this.overtimeCount +=1;
		this.overtime += hour;
	}
	
}
