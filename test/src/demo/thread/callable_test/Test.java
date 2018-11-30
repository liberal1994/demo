package demo.thread.callable_test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ser = Executors.newFixedThreadPool(2);
        //java.util.concurrent.ThreadPoolExecutor@14ae5a5
        // [Running, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]
        //维护两个队列：排队等待的任务队列(queued tasks)和完成的任务队列(completed tasks)

        //ser.shutdown();//关闭线程池，等待任务全部结束
        //System.out.println(ser)//显示线程池处于shutting down的状态
        //ser.shutdownNow();//立刻关闭线程池
        //任务全部结束后再打印ser线程池处于Terminated状态

        //ser.isTerminated();//任务是否全部执行完
        //ser.isShutdown();//线程池是否关闭了，不代表任务执行完了
        System.out.println(ser);

        Machine machine = new Machine();
        Future<Integer> result = ser.submit(machine);
        int res = result.get();
        System.out.println(res);

        System.out.println(ser);

        ser.shutdown();
        Thread.sleep(2000);
        System.out.println(ser);

    }
}
