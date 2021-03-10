import java.util.ArrayList;

public class OvertimeAnalyzer implements Analyzer {

	private ArrayList <Employee> employees;
	
	public OvertimeAnalyzer() {
		
		employees = new ArrayList<Employee>();
	}
	
	@Override
	public void addEmployee(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		for (Employee employee:employees) {
			
			if (employee.getOvertimeCount()>0) {
				
				this.employees.add(employee);
			}
		}
	}
	
	@Override
	public int count() {
		// TODO Auto-generated method stub
	
		return employees.size();
	}

	@Override
	public double sum() {
		// TODO Auto-generated method stub
		double totalHours = 0;
		
		for (Employee employee:employees) {
			
			totalHours += employee.getOverTime();
		}
		
		return totalHours;
	}

	@Override
	public double avg() {
		// TODO Auto-generated method stub
		return this.sum()/this.count();
	}

	@Override
	public double max() {
		// TODO Auto-generated method stub
		double maxHours = employees.get(0).getOverTime();
		
		for (Employee employee:employees) {
			
			if (maxHours < employee.getOverTime()) {
				
				maxHours = employee.getOverTime();
			}
		}
		
		return maxHours;
	}

	@Override
	public double min() {
		// TODO Auto-generated method stub
		double minHours = employees.get(0).getOverTime();
		
		for (Employee employee:employees) {
			
			if (minHours > employee.getOverTime()) {
				
				minHours = employee.getOverTime();
			}
		}
		
		return minHours;
	}

	@Override
	public String summary() {
		// TODO Auto-generated method stub
//		this.count();
//		this.sum();
//		this.avg();
//		this.max();
//		this.min();
		
		String info = String.format("%21s%9d\n%21s%9.2f\n%21s%9.2f\n%21s%9.2f\n%21s%9.2f\n", "Total employees:", this.count(), "Total hours:", this.sum(), "Average hours:", this.avg(), "Max hours:", this.max(), "Min hours:", this.min());
		return info;
	}
}
