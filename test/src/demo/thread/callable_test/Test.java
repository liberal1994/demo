package demo.thread.callable_test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Machine machine = new Machine();
        ExecutorService ser = Executors.newFixedThreadPool(2);
        Future<Integer> result = ser.submit(machine);
        int res = result.get();
        System.out.println(res);
    }
}
