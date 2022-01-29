package threads;

public class MultiThreads {
    public static void main(String[] args) throws InterruptedException {
        ThreadExtender t1 = new ThreadExtender();
        Thread t2 = new Thread(new ThreadImplementer());
        t1.start();
        t1.join(3000);
        t2.start();
    }
}