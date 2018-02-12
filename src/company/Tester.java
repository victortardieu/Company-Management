package company;

public class Tester {
	
	public static void main(String[] args) {
		
		Employees employee1 = new Employees(123, "Victor", "CEO", 1);
		employee1.printEmployees();
		
		Employees employees2 = new Employees(456, "Tom", "CFO", 2);
		employees2.printEmployees();
		
		Administrators employee3 = new Administrators(789, "Fil", "Marketing Director", 3, 1);
		employee3.printAdministrators();
		
		Researchers employee4 = new Researchers(015, "Chris", "CTO", 4, "Dr", "Java/C++");
		employee4.printResearcher();
		
		System.out.println();
		System.out.println("Number of employees: " + employee1.getEmployeeNumber());
		System.out.println("Number of employees: " + employee4.getEmployeeNumber());
		
		employee1.setHappiness(true);
		System.out.println("\nEmployee1 is happy: " + employee1.isHappy());
	}
	
	

}
