package threads;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("[INFO] There are " + Thread.activeCount() + " threads running.");
        System.out.println("[INFO] The current thread is " + Thread.currentThread().getName());
        System.out.println("[INFO] Current thread priority is " + Thread.currentThread().getPriority());
        System.out.println("[INFO] Current thread is alive? " + Thread.currentThread().isAlive());

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }

        MyThread t2 = new MyThread();
        t2.start();
        System.out.println(t2.isAlive());
    }
}