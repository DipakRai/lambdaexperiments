package mulshankar13.threads;

/**
 * Inter thread communication between two threads
 * @author mulshankar13
 *
 */
public class AlphaNumericAlt {

	static Object lock = new Object();

	public static void main(String[] args) {

		Thread thread = new Thread(() -> {
			for (int i = 1; i <= 26; i++) {
				synchronized (lock) {
					try {
						lock.notify();// wakes up any other thread waiting on this monitor
						System.out.println(i);
						lock.wait();// causes the current thread to wait until some other thread
						// invokes the notify on this shared monitor
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block-lock.wait();
						e.printStackTrace();
					}
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			for (char c = 'a'; c <= 'z'; c++) {
				synchronized (lock) {
					try {						
						lock.notify();
						System.out.println(c);
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();
		thread2.start();
	}
}
