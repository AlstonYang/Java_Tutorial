import java.util.ArrayList;

public class Company {

	private String name;
	private ArrayList<Employee> employees;

	public Company(String name) {
		
		this.name = name;
		this.employees = new ArrayList<Employee>();
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void addEmployee(Employee employee) {
		
		this.employees.add(employee);
	}
	
	public Employee findEmployee(String name) {
		
		for (Employee employee:employees) {
			
			if (employee.getName().equals(name)) {
				
				return employee;
			}
		}
		
		return null;
	}
	
	public void addWorkDays(String name, double day) {
		
		Employee employee = this.findEmployee(name);
		
		if (employee != null) {
			
			employee.addWorkDays(day);
		
		}else {
			
			System.out.println("The employee is not found.");
		}
	}
	
	public void overtimeWork(String name, double hour) {
		
		Employee employee = this.findEmployee(name);
		
		if (employee != null) {
			
			employee.overtimeWork(hour);;
		
		}else {
			
			System.out.println("The employee is not found.");
		}
	}
	
	public String callAnalyzer(Analyzer analyzer) {
		
		analyzer.addEmployee(employees);
		return analyzer.summary();
	}
	
	public String summary() {
		
		String info="";
		info += String.format("%10s%10s\n%10s%10s%15s%21s%10s%12s\n", "Company:", this.name, "Name", "Work Day", "Overtime Count", "Overtime Hour(Total)", "Wage", "Title");
		
		for (Employee employee:employees) {
			
			info += String.format("%10s%10.2f%15d%21.2f%10.2f%12s\n", employee.getName(), employee.getWorkDay(), employee.getOvertimeCount(), employee.getOverTime(), employee.payment(), employee.getTitle());
		}
		
		return info;
	}
}
