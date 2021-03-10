import java.util.ArrayList;

public class WageAnalyzer implements Analyzer {

	private ArrayList<Employee> employees;
	
	public WageAnalyzer() {
		
		this.employees = new ArrayList<Employee>();
	}
	
	@Override
	public void addEmployee(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		
		this.employees = employees;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return employees.size();
	}

	@Override
	public double sum() {
		// TODO Auto-generated method stub
		double totalWage = 0;
		
		for(Employee employee:employees) {
			
			totalWage += employee.payment();
		}
		return totalWage;
	}

	@Override
	public double avg() {
		// TODO Auto-generated method stub
		
		return this.sum()/this.count();
	}

	@Override
	public double max() {
		// TODO Auto-generated method stub
		double maxWage = employees.get(0).payment(); 
				
		for(Employee employee:employees) {
			
			if (maxWage < employee.payment()) {
				
				maxWage = employee.payment();
			}
		}
		
		return maxWage;
	}

	@Override
	public double min() {
		// TODO Auto-generated method stub
		double minWage = employees.get(0).payment(); 
		
		for(Employee employee:employees) {
			
			if (minWage > employee.payment()) {
				
				minWage = employee.payment();
			}
		}
		
		return minWage;
	}
	
	@Override
	public String summary() {
		// TODO Auto-generated method stub
//		this.count();
//		this.sum();
//		this.avg();
//		this.max();
//		this.min();
		
		String info = String.format("%21s%9d\n%21s%9.2f\n%21s%9.2f\n%21s%9.2f\n%21s%9.2f\n", "Total employees:", this.count(), "Total wage:", this.sum(), "Average wage:", this.avg(), "Max wage:", this.max(), "Min wage:", this.min());
		return info;
	}

}
