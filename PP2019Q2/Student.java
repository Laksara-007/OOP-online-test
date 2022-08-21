package pp2019q2;

public class Student implements IPerson{
	String studentID;
	int grade;
	
	public Student(String studentID, int grade) {
		this.studentID = studentID;
		this.grade = grade;
	}


	@Override
	public String displayDetails() {
		
		return "Student ID: " + studentID + "\nGrade: " + grade ;
	}
	

}
