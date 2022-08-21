package sq11;

public class PrintThread extends Thread {
	
		public void run() {
			
				for (int i = 0; i < 10; i++) {
		System.out.println(i+1);

		}
	}

}
