package demo.thread.threadpool.executorthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPool_Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newScheduledThreadPool(5);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service);
        /**
         *  27: iconst_0
         *       28: istore_2
         *       29: iload_2
         *       30: bipush        6
         *       32: if_icmpge     65
         *       35: iload_2
         *       36: istore_3
         *       37: aload_1
         *       38: checkcast     #9                  // class java/util/concurrent/ScheduledExecutorService
         *       41: iload_3
         *       42: aload_1
         *       43: invokedynamic #10,  0             // InvokeDynamic #0:run:(ILjava/util/concurrent/ExecutorService;)Ljava/lang/Runnable;
         *       48: iload_2
         *       49: i2l
         *       50: getstatic     #3                  // Field java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
         *       53: invokeinterface #11,  5           // InterfaceMethod java/util/concurrent/ScheduledExecutorService.schedule:(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
         *       58: pop
         *       59: iinc          2, 1
         *       62: goto          29
         */
        for (int i = 0; i < 6; i++) {
            final int j = i;
            ((ScheduledExecutorService) service).schedule(() -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":"+j);
                System.out.println(service);
            }, i, TimeUnit.SECONDS);
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
