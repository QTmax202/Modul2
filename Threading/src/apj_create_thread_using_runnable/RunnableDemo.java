package apj_create_thread_using_runnable;

public class RunnableDemo implements Runnable{

    private Thread t;
    private final String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating"+ threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+ threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("thread "+threadName+", "+i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread "+threadName+" exiting");
    }

    public void start(){
        System.out.println("Starting "+threadName);
        if (t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}
