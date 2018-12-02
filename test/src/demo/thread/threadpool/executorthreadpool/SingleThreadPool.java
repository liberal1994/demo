package demo.thread.threadpool.executorthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThreadPool {
    public static void main(String[] args) {
        //线程池最多只有一个线程在工作，可以保证任务的顺序执行
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service);
        for (int i = 0; i < 6; i++) {
            final int j = i;
            service.execute(() -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + j);
                System.out.println(service);
            });
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(service);
        service.shutdown();
    }
}
