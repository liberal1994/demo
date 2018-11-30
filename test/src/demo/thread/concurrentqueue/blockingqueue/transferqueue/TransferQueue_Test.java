package demo.thread.concurrentqueue.blockingqueue.transferqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

public class TransferQueue_Test {
    private final static int THREAD_NUM = 10;

    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();

        for (int i = 0; i < THREAD_NUM; i++) {
            new Thread(() -> {
                while (true) {//加while true会把生产者生产的东西全部消耗光直到阻塞
                    try {
                        System.out.println(Thread.currentThread().getName() + ":" + queue.take());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        try {
            Thread.sleep(1000);
            System.out.println(queue.getWaitingConsumerCount());//获取等待的消费者线程数
                                                // boolean hasWaitingConsumer()判断有无等待线程
            for (int i = 0; i < 100; i++) {
                Thread.sleep(100);
                queue.transfer("" + i);
//                System.out.println(queue.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
