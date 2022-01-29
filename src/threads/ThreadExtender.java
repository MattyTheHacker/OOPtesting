package threads;

public class ThreadExtender extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("[" + Thread.currentThread().getName() + "] " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[" + Thread.currentThread().getName() + "] Work Completed.");
    }
}