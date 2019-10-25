package mulshankar13.threads;

public class OddEvenThreads {
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {

                for (char itr ='a'; itr <= 'z'; itr++) {
                    synchronized (lock) {
                        System.out.print(" " + itr);
                        try {
                            lock.notify();
                            if(itr=='z')
                                break;                             
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {

                for (int i = 1; i < 100; i++) {
                    synchronized (lock) {
                        System.out.print(" " + i);
                        try {
                            lock.notify();
                            if(i==99)
                               break;
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("\nPrinting over");
        } catch (Exception e) {

        }
    }
}