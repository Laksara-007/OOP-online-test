package sq3_exceptions;

public class MarksException extends Exception {
	float marks;
	public MarksException(float temp) {
		
		super("Invalid marks");
		this.marks= temp;
	}
	
	public float getMarks() {
		return marks;
	}
	

}
