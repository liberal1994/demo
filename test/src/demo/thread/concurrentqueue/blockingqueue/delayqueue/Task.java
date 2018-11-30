package demo.thread.concurrentqueue.blockingqueue.delayqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Task implements Delayed {
    private long runtime;

    public Task(long runtime) {
        this.runtime = runtime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(runtime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        long cmp = this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS);

        return cmp > 0 ? 1 : (cmp < 0 ? -1 : 0);
    }
    @Override
    public String toString() {
        return "Task{" +
                "runtime=" + runtime +
                '}';
    }
}
