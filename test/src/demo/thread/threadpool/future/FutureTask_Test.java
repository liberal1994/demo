package demo.thread.threadpool.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTask_Test {
    public static void main(String[] args) {
        //在FutureTask中传入Callable对象，
        FutureTask<Integer> task=new FutureTask<>(()->{
            Thread.sleep(1000);
            return 1000;
        });
        new Thread(task).start();
        try {
            System.out.println(task.get());//阻塞，等待线程结束
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
