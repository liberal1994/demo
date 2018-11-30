package demo.thread.concurrentqueue.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class BlockingQueue_Test {
    private static BlockingQueue<Integer> queue;
    private static final int THREAD_NUM = 5;

    public static void main(String[] args)  {
        int count = 0;
        queue=new ArrayBlockingQueue<>(20);//有界的阻塞队列，必须初始化容量
//        queue = new LinkedBlockingDeque<>();//无界的阻塞队列，不必初始化容量，当然也可以初始化容量
        new Thread(() -> {
            for (int j = 0; j < 100; j++) {
                try {
                    queue.put(j);//当queue的size超出capacity时生产者线程阻塞
//                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"producer").start();
//        Thread.sleep(1000);
        for (int i = 0; i < THREAD_NUM; i++) {
            new Thread(() -> {
                for (;;) {
                    try {
                        //当生产者线程耗尽，消费者线程阻塞
                        System.out.println(Thread.currentThread().getName()+":"+queue.take());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"consumer"+i).start();
        }
    }
}
