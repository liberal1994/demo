package demo.thread.threadpool.executorthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CacheThreadPool_Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service);
        for (int i = 0; i < 7; i++) {
            final int j = i;
            service.execute(() -> {
                if (j >= 3) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName());
                System.out.println(service);
            });
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service);
        service.shutdown();


    }
}
