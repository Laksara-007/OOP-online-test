package sq3_exceptions;

import java.util.InputMismatchException;

public class MainApp {

	public static void main(String[] args) throws InputMismatchException, MarksException {
		Student student = new Student(1, "nameeee");
		student.input();
		System.out.println("average : " + student.getAverage());
		
		
		
	}

}
