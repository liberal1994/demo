package demo.thread.concurrentqueue.blockingqueue.delayqueue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

/**
 * DelayQueue也是一种阻塞队列，不过它里面只能放实现了Delayed接口的类（需要实现compareTo和getDelay方法）
 * 可以用来模拟一些延时的任务
 */
public class DelayQueue_Test {//DelayQueue也是一种阻塞队列，不过它里面只能放实现了Delayed接口的类

    private static final int SIZE = 5;

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        //DelayQueue中的元素必须实现Delayed接口
        DelayQueue<Task> queue = new DelayQueue<>();
        for (int i = 0; i < SIZE; i++) {
            queue.put(new Task(now + 1000 * (SIZE - i)));
        }
        try {
            System.out.println(queue.size());
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println(queue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < SIZE; i++) {
            try {
                Task task = queue.take();
                System.out.println(task.toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
