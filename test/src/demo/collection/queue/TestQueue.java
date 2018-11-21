package demo.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Request> queue=new ArrayDeque<>();
        for(int i=0;i<10;i++){
            final int num=i;
            queue.offer(new Request() {
                @Override
                public void deposit() {
                    System.out.println("第"+num+"个人正在存款");
                }
            });
        }
        Request request=null;
        while(null!=(request=queue.poll())){
            request.deposit();
        }
    }

}
interface Request{
    void deposit();
}
