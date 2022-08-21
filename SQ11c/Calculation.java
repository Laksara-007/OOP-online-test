package sq11c;

import MockPaperQ2.main;

public class Calculation {

	long  total;
	   public Calculation() {
	      total = 0;
	   }
	   public void Sum(int start, int end) {
	      long  temp = 0;
	      for (int r = start; r <= end; r++) {
	          temp += r;
	      }
	      synchronized (this) {
	         total += temp;
	      }
	   }
	   public long getTotal() {
	      return total;
	   }
}

class Thread1 extends Thread{
	Calculation cal;
	int start, end;
	
	@Override
	public void run() {
		cal.Sum(start, end);
		
	}

	public Thread1(Calculation cal, int start, int end) {
		this.cal = cal;
		this.start = start;
		this.end = end;
	}
	
}

	
