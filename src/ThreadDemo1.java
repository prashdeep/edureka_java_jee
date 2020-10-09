
public class ThreadDemo1 extends Thread {
	ThreadDemo1() {
		// System.out.println("Invoking the another thread..");
		start();
	}

	public void run() {
		try {
			for (int i = 1; i <= 10; ++i) {
				System.out.println("Child Thread " + i);
				Thread.sleep(1000);
			}
		} catch (Exception ex) {
			System.out.println("Exception is : " + ex);
		}
	}

	// main function.
	public static void main(String args[]) {
		new ThreadDemo1();

		try {
			// System.out.println("Starting the main thread...");
			for (int i = 1; i <= 10; ++i) {
				System.out.println("");
				System.out.println("Main Thread " + i);
				Thread.sleep(1000);
			}
		} catch (Exception ex) {
			System.out.println("Exception is : " + ex);
		}

	}

}
