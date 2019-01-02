package demo.thread.ConcurrentList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

public class ListAndVector_Test {
    private static List<Integer> list=new ArrayList<>();//线程不安全,甚至抛出数组越界异常
                                                        //恰好在扩容前
//    private static List<Integer> list=new CopyOnWriteArrayList<>();//线程安全，但是有大量写操作时效率很差
//    private static List<Integer> list=Collections.synchronizedList(new ArrayList<>());
//    private static List<Integer> list = new Vector<>();//线程安全

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);//一条线程执行完毕计数减一，所有线程执行完毕，即count=0时主线程被唤醒
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                final int count=5;
                for (int j = 0; j < 100; j++) {
                    list.add(j);
                }
                latch.countDown();
            }).start();
        }
        latch.await();//主线程阻塞，等待其他线程执行完毕使得count=0
        list.stream().forEach((Integer o) ->{if(o==null){throw new NullPointerException();}System.out.println(o);});
        System.out.println(list.size());

    }
}
