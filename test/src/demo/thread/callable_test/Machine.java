package demo.thread.callable_test;

import java.util.concurrent.Callable;

public class Machine implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("The machine is on working...");
        return 100;
    }
}
