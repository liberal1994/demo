package demo.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {


    public static void main(String[] args) {
        MyStack<Handler> myStack=new MyStack(10);
        for(int i=0;i<10;i++){
            final int num=i;
            myStack.push(new Handler() {
                @Override
                public void deposit() {
                    System.out.println("第"+num+"个人正在存款");
                }
            });
        }
        Handler handler=null;
        while(null!=(handler=myStack.pop())){
            handler.deposit();
        }
    }
}
interface Handler{
    void deposit();
}
