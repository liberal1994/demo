package demo.thread.concurrentqueue;

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
            Thread.sleep(5000);//主线程睡眠5秒后，向queue中put一个元素，这时候线程1被唤醒；
            queue.put("aaa");
            queue.add("aaa");//向SynchronousQueue中add操作添加元素会抛出异常：java.lang.IllegalStateException: Queue full
                                //放在put语句上面会使得抛出异常后线程1一直处于阻塞状态
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(queue.size());
    }
}
