public class SmartNumberPrinter {
     static class NumberThread extends Thread {
        public void run() {
            for (int i = 1; i <= 50; i++) {
                System.out.println( "Thread-A : " + i);
            }
        }
    }
    public static void main(String[] args)throws InterruptedException {
        NumberThread t1 =new NumberThread();
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 51; i <= 100; i++) {
                    System.out.println("Thread-B : " + i);
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                for (char ch = 'A'; ch <= 'Z'; ch++) {
                    System.out.println("Thread-C : " + ch);
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All Threads Completed");
    }
}