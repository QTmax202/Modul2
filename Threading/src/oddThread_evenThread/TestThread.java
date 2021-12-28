package oddThread_evenThread;

public class TestThread {
    public static void main(String[] args) {
        OddThread thread1 = new OddThread();
        EvenThread thread2 = new EvenThread();

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----");
        thread2.start();
    }
}
