package demo.thread.threadpool.future;

import java.util.concurrent.*;

public class Future_Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Callable<Integer> task= () -> 1;
        Future<Integer> future=service.submit(task);
        try {
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(future.isDone());

    }
}
