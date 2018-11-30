package demo.thread.concurrentqueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

public class ConcurrentLinkedQueue_Test {
    private static final int THREAD_NUM = 5;

    public static void main(String[] args) {
        Queue<Integer> queue=new ConcurrentLinkedQueue<>();//线程安全
//        Queue<Integer> queue = new ArrayDeque<>();//线程不安全
        CountDownLatch latch = new CountDownLatch(THREAD_NUM);
        for (int i = 0; i < THREAD_NUM; i++) {
            new Thread("" + i) {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        queue.offer(j);
                    }
                    latch.countDown();
                }
            }.start();
        }
        try {
            latch.await();
            System.out.println(queue);
            System.out.println(queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
