package sq11b;

public class ThreadBase {

	public static void main(String[] args) {
		Thread numT1 = new NumbersThread("red");
		Thread numT2 = new NumbersThread("blue");
		Thread numT3 = new NumbersThread("green");
		
		numT1.start();
		numT2.start();
		numT3.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("SLIIT");
		}
		
		System.out.println("Thread 1 - State = " + numT1.getState() + " - Alive = " + numT1.isAlive());
	}

}


