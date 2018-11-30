package demo.thread.concurrentqueue.blockingqueue.synchronousqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_Test {
    public static void main(String[] args) {
        BlockingQueue<String> queue=new SynchronousQueue<>();
        new Thread("1"){
            @Override
            public void run(){
                try {
                    System.out.println(queue.take());//SynchronousQueue的take方法从queue中取出一个数
                                                    // 前提是必须有一个线程用put方法向queue中放入一个数
                                                    //否则当前线程阻塞，等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        try {
            Thread.sleep(1000);//主线程睡眠5秒后，向queue中put一个元素，这时候线程1被唤醒；
            queue.put("aaa");
//            queue.add("aaa");//向SynchronousQueue中add操作添加元素会抛出异常：java.lang.IllegalStateException: Queue full
                                //放在put语句上面会使得抛出异常后线程1一直处于阻塞状态
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //消费者线程如果在生产者线程（主线程）下方，那么因主线程阻塞导致该消费者线程无法启动，使得程序一直挂起

        /*new Thread("2"){
            @Override
            public void run(){
                try {
                    System.out.println(queue.take());//SynchronousQueue的take方法从queue中取出一个数
                    // 前提是必须有一个线程用put方法向queue中放入一个数
                    //否则当前线程阻塞，等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();*/
        System.out.println(queue.size());
    }
}
