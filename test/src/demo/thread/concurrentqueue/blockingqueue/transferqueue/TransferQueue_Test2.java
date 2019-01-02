package demo.thread.concurrentqueue.blockingqueue.transferqueue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;

public class TransferQueue_Test2 {
    private final static int THREAD_NUM = 20;

    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();

        for (int i = 0; i < THREAD_NUM; i++) {
            new Thread(() -> {
                try {
                    while (true) {
                        System.out.println(Thread.currentThread().getName() + ":" + queue.take());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        try {
            Thread.sleep(1000);
            System.out.println(queue.getWaitingConsumerCount());//获取等待的消费者线程数
            // boolean hasWaitingConsumer()判断有无等待线程
            for (int i = 0; i < 100; i++) {

                TimeUnit.MILLISECONDS.sleep(100);
//                if(!queue.hasWaitingConsumer()){
//                    break;//当消费者线程全部消耗完结束生产，主线程不会继续执行transfer方法
//                }
//                queue.transfer("" + i);
                if(!queue.tryTransfer(""+i)){//也可以用tryTransfer()尝试：
                    // 返回true：说明有消费者线程在等待，那么该方法会立刻转移e；
                    // 返回false：说明已经没有消费者线程了，这时候也不会吧e放入queue,queue.size()返回0
                    System.out.println(queue.size());
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(queue.hasWaitingConsumer());

        System.exit(0);
    }

}
