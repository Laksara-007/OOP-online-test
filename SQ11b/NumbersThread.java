package sq11b;

public class NumbersThread extends Thread {
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "  thread: " + Thread.currentThread().getName());			

		}
	}
	public NumbersThread(String name) {
		super(name);
	}

}
