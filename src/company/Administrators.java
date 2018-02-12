package company;

public class Administrators extends Employees{
	
	private int managedEmployees;

	Administrators(int user_iD, String user_name, String user_position, int user_seniority, int user_managed_employees) {
		super(user_iD, user_name, user_position, user_seniority);
		managedEmployees=user_managed_employees;
	}
	
	void setManagedEmployees(int m) {
		managedEmployees=m;
	}
	
	int getManagedEmployees() {
		return managedEmployees;
	}
	
	void printAdministrators() {
		super.printEmployees();
		System.out.print("\nNumber of managed employees: " + getManagedEmployees());
	}
	
}
