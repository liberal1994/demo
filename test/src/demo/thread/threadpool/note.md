
        ExecutorService ser = Executors.newFixedThreadPool(2);

        #结束线程池
        //ser.shutdown();//关闭线程池，等待任务全部结束
        //ser.shutdownNow();//立刻关闭线程池
        //显示线程池处于shutting down的状态
        //任务全部结束后再打印ser线程池处于Terminated状态

        #判断线程池状态
        //ser.isTerminated();//任务是否全部执行完
        //ser.isShutdown();//线程池是否关闭了，不代表任务执行完了

        #打印线程池信息
        System.out.println(ser);
        //java.util.concurrent.ThreadPoolExecutor@14ae5a5[Running, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]
        //维护两个队列：排队等待的任务队列(queued tasks)和完成的任务队列(completed tasks)

        Future
