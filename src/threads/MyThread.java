package threads;

public class MyThread extends Thread {
    @Override
    public void run(){
        if (this.isDaemon()) {
            System.out.println("[INFO] " + Thread.currentThread().getName() + " is a daemon thread.");
        } else {
            System.out.println("[INFO] Thread " + Thread.currentThread().getName() + " is running.");
        }
    }
}
