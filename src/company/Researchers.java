package company;

public class Researchers extends Employees {

	private String title;
	private String expertise;
	
	Researchers(int user_iD, String user_name, String user_position, int user_seniority, String user_title, String user_expertise) {
		super(user_iD, user_name, user_position, user_seniority);
		title = user_title;
		expertise = user_expertise;
	}
	
	String getTitle() {
		return title;
	}
	
	String getExpertise() {
		return expertise;
	}
	
	void setTitle(String t) {
		title = t;
	}
	
	void setExpertise(String e) {
		expertise = e;
	}
	
	void printResearcher() {
		super.printEmployees();
		System.out.print("\nTitle: " + getTitle() + "\nExpertise: " + getExpertise() + "\n");
	}
}
