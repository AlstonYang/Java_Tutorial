import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account1 = new BankAccount(102603901, 1000);
		BankAccount account2 = new BankAccount(102603902, 1500);
		BankAccount account3 = new BankAccount(102603903, 1400);
		BankAccount account4 = new BankAccount(102603904, 1800);
		
		Employee Alex = new Employee(109306201, "Alex", account1, "Sales Dept.", 35000, 50);
		Employee Lily = new Employee(109306203, "Lily", account3, "Sales Dept.", 27500, 8);
		Employee Tony = new Employee(109306204, "Tony", account4, "Marketing Dept.", 40000, 30);
		
		ArrayList <Employee> employees = new ArrayList <Employee>();
		employees.add(Alex);
		employees.add(Lily);
		employees.add(Tony);
		
		ArrayList <Employee> SalesSubOrdinates = new ArrayList <Employee>();
		
		for(Employee employee:employees) {
			
			if (employee.getDepartment().equals("Sales Dept."))
				SalesSubOrdinates.add(employee);
		}
		
		Supervisor Bob = new Supervisor(110306202, "Bob", account2, "Sales Dept.", 50000, SalesSubOrdinates, 21);
	
		employees.add(Bob);
		
		for (int n =0; n<employees.size(); n++) {
			
			employees.get(n).monthEnd();
			System.out.println(employees.get(n).getInfo()+"\n");
		}
		
	}

}
