package threads;

public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("[INFO] Thread " + Thread.currentThread().getName() + " is running.");
    }
}
