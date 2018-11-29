package demo.thread.concurrentqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_Test2 {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new SynchronousQueue<>();
        for (int i = 1; i <= 5; i++) {
            new Thread("Thread" + i) {
                @Override
                public void run() {
                    try {
                        Thread t;
                        if ((t = Thread.currentThread()).getName().equalsIgnoreCase("3")) {
                            t.setPriority(MAX_PRIORITY);
                        }
                        String str = queue.take();//每次都是线程5拿到这个字符串？
                        System.out.println(Thread.currentThread().getName() + " get:" + str);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
        try {
            Thread.sleep(6);//不睡眠主线程，每次都是线程1拿到字符串
                                    //在一个时间范围内，每个线程都有机会拿到
            queue.put("aaa");
            System.out.println(queue.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
