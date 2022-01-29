package threads;

public class MultiThreads {
    public static void main(String[] args) {
        ThreadExtender t1 = new ThreadExtender();
        Thread t2 = new Thread(new ThreadImplementer());
        t1.start();
        t2.start();
    }
}