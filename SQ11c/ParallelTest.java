package sq11c;

public class ParallelTest{
	public static void main(String[] args) throws InterruptedException {
		Calculation cal = new Calculation();
		
		Thread thread01 = new Thread1(cal, 1, 50);
		Thread thread02 = new Thread1(cal, 51, 100);
		
		thread01.start();
		thread02.start();
		
		thread01.join();
		thread02.join();
		
	      System.out.println("Total " + cal.getTotal());

		
		
	}
}
