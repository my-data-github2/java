import com.sunbeam.employee.Employee;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		employee1.accept();
		employee2.accept();
		employee1.display();
		employee2.display();
		System.out.println("10% salary raise to every employee: ");
		employee1.salaryRaise();
		employee1.displaySalaryRaise();
		employee2.salaryRaise();
		employee2.displaySalaryRaise();
		
		
		
	}

};
