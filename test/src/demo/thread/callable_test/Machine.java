package demo.thread.callable_test;

import java.util.concurrent.Callable;

public class Machine implements Callable<Integer> {
    /**
     * 与Runnable接口的区别：可以有返回值，可以抛出异常
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        System.out.println("The machine is on working...");
        return 100;
    }
}
