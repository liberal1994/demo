package demo.thread.reentrantllock_test;

import java.util.concurrent.locks.ReentrantLock;

public class Test1 {
    private static ReentrantLock lock = new ReentrantLock();
    private static int count = 0;

    private static void m1() {
        lock.lock();
        try {
            while (count != 20) {
                Thread.sleep(1000);
                System.out.println(count++);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (lock.isLocked()) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Runnable r= () -> m1();
        Thread t1=new Thread(r,"t1");
        t1.start();
    }
}
