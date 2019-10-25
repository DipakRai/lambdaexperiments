package mulshankar13.threads;

public class FizzBuzzTester2 {

	public static void main(String[] args) {
		
	}
	
}

class FizzBuzzThread implements Runnable{
	private int current=1;
	private boolean div3,div5;
	private int max;
	Object lock = new Object();
	
	@Override
	public void run() {
		
		synchronized(lock) {
			while(true) {
				if(current>max) {
					return;
				}
				
				if
			}
		
		}
		
	}
	
}