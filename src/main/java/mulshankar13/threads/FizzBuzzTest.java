package mulshankar13.threads;

public class FizzBuzzTest {

	public static void main(String[] args) {
		int n =15;
		Thread [] threads = {
			new FizzBuzzThread(true, true, n, "FizzBuzz"),
			new FizzBuzzThread(true, false, n, "Fizz"),
			new FizzBuzzThread(false, true, n, "Buzz"),
			new NumberThread(false, false, n)
		};		
		for (Thread thread : threads) {
			thread.start();
		}
	}
}

class NumberThread extends FizzBuzzThread {

	public NumberThread(boolean div3, boolean div5, int max) {
		super(div3, div5, max, null);
	}	

	@Override
	public void print() {
		System.out.println(current);
	}
}

class FizzBuzzThread extends Thread {

	private static Object lock = new Object();
	static int current = 1;
	private int max;
	private boolean div3, div5;
	private String toPrint;
	public FizzBuzzThread(boolean div3, boolean div5, int max, String toPrint) {
		this.div3 = div3;
		this.div5 = div5;
		this.max = max;
		this.toPrint = toPrint;
	}
	public void print() {
		System.out.println(this.toPrint);
	}
	@Override
	public void run() {
		System.out.println("outer loop current :"+current + " : div 3 :"+this.div3 + " : div 5 :"+this.div5);
		while (true) {
			System.out.println(" inner loop current :"+current);
			synchronized (lock) {
				if (current > max) {
					return;
				}
				if (((current % 3 == 0) == div3) && ((current % 5 == 0) == div5)) {
					print();
					current++;
				}
			}
		}
	}
}