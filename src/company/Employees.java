package company;


public class Employees {

	private int employeeID;
	private String name;
	private String position;
	private int seniority;
	private boolean isHappy;
	
	private static int employeeNumber;
	
	Employees(int user_iD, String user_name, String user_position, int user_seniority){
		employeeID=user_iD;
		name=user_name;
		position=user_position;
		seniority=user_seniority;
		employeeNumber++;
	}
	
	int getID() {
		return employeeID;
	}
	
	String getName() {
		return name;
	}
	
	String getPosition() {
		return position;
	}
	
	int getSeniority() {
		return seniority;
	}
	
	void setID(int i) {
		employeeID=i;
	}
	
	void setName(String n) {
		name=n;
	}
	
	void setPosition(String p) {
		position=p;
	}
	
	void setSeniority(int s) {
		seniority=s;
	}
	
	void printEmployees() {
		System.out.print("\n\nName" + getName() + "\nID: " + getID() + "\nPosition: " + getPosition() + "\nSeniority: " + getSeniority());	
	}

	static int getEmployeeNumber() {
		return employeeNumber;
	}
	
	void setHappiness(boolean h) {
		isHappy = h;
	}
	
	boolean isHappy() {
		return isHappy;
	}
}
