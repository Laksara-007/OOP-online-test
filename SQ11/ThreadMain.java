package sq11;

public class ThreadMain {

	public static void main(String[] args) {
			Thread printT  = new PrintThread();
			Thread SLIITT = new SLIITThread();
			
			printT.start();
			SLIITT.start();
			
	}

}
