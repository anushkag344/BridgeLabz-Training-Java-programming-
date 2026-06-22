public class BackgroundCleanupService {

    static class CleanupTask extends Thread {

        @Override
        public void run() {

            while (true) {

                System.out.println(
                        "Cleaning temporary files...");

                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class UserTask extends Thread {

        public UserTask(String name) {
            super(name);
        }

        @Override
        public void run() {

            for (int i = 1; i <= 5; i++) {

                System.out.println(
                        getName() + " working...");

                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(
                    getName() + " finished.");
        }
    }

    public static void main(String[] args)
            throws InterruptedException {

        CleanupTask daemonThread =
                new CleanupTask();

        // Daemon Thread Banaya
        daemonThread.setDaemon(true);

        UserTask t1 =
                new UserTask("User-1");

        UserTask t2 =
                new UserTask("User-2");

        daemonThread.start();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(
                "All User Threads Finished");
    }
}