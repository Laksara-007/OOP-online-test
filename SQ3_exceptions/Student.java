package sq3_exceptions;

import java.util.*;

public class Student {

	int id;
	String name;
	int noOfSubjects;
	ArrayList<Float> marks = new ArrayList<Float>();

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	float inputMarks(int index) throws MarksException {
		Scanner sc = new Scanner(System.in);
		float temp = (float) sc.nextDouble();
		if (temp > 100 || temp < 0) {
			throw new MarksException(temp);
		}
		

		return temp;
	}
	public void input() throws MarksException , InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of subjects");
		noOfSubjects = sc.nextInt();
		for (int i = 0; i < noOfSubjects; i++) {
			System.out.println("enter marks for subjectc" + (i+1) + " : ");
			marks.add(i, inputMarks(i));
		}
	}
	
	float getAverage(){
		float avg = 0;
		for (Float float1 : marks) {
			avg += float1;	
		}
		try {
		avg/=noOfSubjects;
		}catch(ArithmeticException e){
			avg=0;
		}
		return avg;
	}
}
