class Road extends Thread {

    public Road(String roadName) {
        super(roadName);
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " : GREEN Signal ON");
            
            // Green signal for 5 seconds
            Thread.sleep(5000);

            System.out.println(getName() + " : GREEN Signal OFF");

            // Give chance to other threads
            Thread.yield();

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class TrafficSignalSimulator {
    public static void main(String[] args) {

        Road road1 = new Road("Road-1");
        Road road2 = new Road("Road-2");
        Road road3 = new Road("Road-3");

        road1.start();
        road2.start();
        road3.start();
    }
}