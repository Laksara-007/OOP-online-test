package pp2019q2;

public class Lecturer implements IPerson{
	private String employeeID;
	private String department;

	public Lecturer(String employeeID, String department) {
		this.employeeID = employeeID;
		this.department = department;
	}
	
	@Override
	public String displayDetails() {
		String details = "Lecturer = " + employeeID + ", Department = " + department;
		return details;
	}

}
