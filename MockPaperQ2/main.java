package MockPaperQ2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int count = 0;
		String pattern1;
		String pattern2;
		Object lock = new Object();

		System.out.println("Enter pattern 1:");
		Scanner sc = new Scanner(System.in);
		pattern1 = sc.nextLine();

		System.out.println("Enter pattern 2:");
		pattern2 = sc.nextLine();

		System.out.println("Enter count:");
		count = sc.nextInt();

		child child = new child(count, pattern1, lock);
		childt childt = new childt(count, pattern2, lock);

		child.start();
		childt.start();

	}

}

class child extends Thread {
	private int cnt = 0;
	Object lock;
	private String ptrn;

	public child(int cnt, String ptrn, Object lock) {
		super();
		this.cnt = cnt;
		this.ptrn = ptrn;
		this.lock = lock;

	}

	@Override
	public void run() {

		synchronized (lock) {
		for (int i = 1; i < cnt + 1; i++) {
				try {
					lock.wait();
					for (int j =cnt; j >i ; j--) {
						System.out.print(" ");
					}
					for (int j = 1; j < i + 1; j++) {
						System.out.print(ptrn + " ");
					}
					System.out.println();
					//child.sleep(500);
					lock.notify();
				} catch (Exception e) {
					System.out.println(e);
				} finally {
				}

			}
		}

	}
}

	class childt extends Thread {
		private int cnt = 0;
		Object lock;
		private String ptrn;

		public childt(int cnt, String ptrn, Object lock) {
			super();
			this.cnt = cnt;
			this.ptrn = ptrn;
			this.lock = lock;

		}

		@Override
		public void run() {

			synchronized (lock) {
			for (int i = 1; i < cnt + 1; i++) {
					try {
						lock.notify();
						for (int j =cnt; j >i ; j--) {
							System.out.print(" ");
						}
						for (int j = 1; j < i + 1; j++) {
							System.out.print(ptrn + " ");
						}
						System.out.println();
						//childt.sleep(500);
						lock.wait();
					} catch (Exception e) {
						e.printStackTrace();
					} 
				}
			}

		}
	}
